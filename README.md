Example codebase for [Detecting Scala Extensions at Runtime.](http://connectionrequired.com/blog/2013/12/detecting-scala-extension-classes-at-runtime/)

This is an example codebase showing how to dynamically load extension code in java or scala (though the code is written in scala).

To run:

1. Install scala and sbt (http://www.scala-sbt.org/)

2. run: `sbt compile`

3. run: `sbt "project reflections-base" "run"`

  You will see only "Started" because there are no extensions.

4. run: `sbt "project reflections-extension" "run-main org.reflections_example.Main"`

  You will see both "In MyFirstExtension" and "In MySecondExtension"

Depends on the java reflections library https://github.com/ronmamo/reflections
