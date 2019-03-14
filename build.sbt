name := """inventory_management_system"""
organization := "de.dphilipp"

version := "0.1-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += javaForms
libraryDependencies += javaJdbc

// H2 in memory database - local development
libraryDependencies += "com.h2database" % "h2" % "1.4.192"

// PostgreSQL JDBC
/*
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.5"
*/

// JAXB
libraryDependencies += "org.glassfish.jaxb" % "jaxb-core" % "2.3.0.1"
libraryDependencies += "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2"

// https://mvnrepository.com/artifact/org.yaml/snakeyaml
libraryDependencies += "org.yaml" % "snakeyaml" % "1.24"

/*
lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)
*/