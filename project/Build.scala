import sbt._
import Keys._

object ReflectionsExampleBuild extends Build {
  lazy val root = Project(id = "reflections-example",
                          base = file(".")) aggregate(reflectionsBase, reflectionsExtension)

  lazy val reflectionsBase = Project(id = "reflections-base",
                                     base = file("reflections-base"))

  lazy val reflectionsExtension = Project(id = "reflections-extension",
                                          base = file("reflections-extension")) dependsOn(reflectionsBase)

  scalaVersion := "2.10.3"
}
