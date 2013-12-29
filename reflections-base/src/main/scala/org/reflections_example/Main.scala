package org.reflections_example

import org.reflections.Reflections
import scala.collection.JavaConversions._

import org.reflections_example.extension.BaseExtension

object Main {
  def extensions: List[BaseExtension] = {
    val reflections = new Reflections("org.reflections_example.extension")
    val subclasses = reflections.getSubTypesOf(classOf[BaseExtension])
    subclasses.toList.map { x => x.getDeclaredConstructors()(0).newInstance().asInstanceOf[BaseExtension] }
  }

  def main(args: Array[String]) {
    println("Started")
    extensions.foreach { _.init }
  }
}
