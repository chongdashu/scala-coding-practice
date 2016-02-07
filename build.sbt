lazy val root = (project in file("./")).
settings(
  name := "Scala Coding Practice",
  scalaVersion := "2.11.7"
)

libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
