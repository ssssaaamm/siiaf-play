
name := """siiaf"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava,DebianPlugin)

serverLoading in Debian := com.typesafe.sbt.packager.archetypes.ServerLoader.SystemV

maintainer in Debian := "Grupo Vape <9nsamuelf2@gmail.com>"

packageSummary in Debian := "SIIAF"

packageDescription :="Sistema Informatico Integrado de Administracion Financiera"


scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

libraryDependencies += javaJdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
libraryDependencies += "it.innove" % "play2-pdf" % "1.5.1"

lazy val myProject = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

offline := true

