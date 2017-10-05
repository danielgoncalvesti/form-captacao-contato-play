name := """captacao-email-play"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  
EclipseKeys.preTasks := Seq(compile in Compile)

libraryDependencies ++= Seq(
  cache,
  javaWs,
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41"
)
