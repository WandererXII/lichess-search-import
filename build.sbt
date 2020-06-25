scalaVersion := "2.13.2"
name := "lichess-search-import"
organization := "org.lichess"
version := "2.0"
resolvers += "lila-maven" at "https://raw.githubusercontent.com/ornicar/lila-maven/master"
libraryDependencies += "org.reactivemongo" %% "reactivemongo" % "0.20.11"
libraryDependencies += "org.reactivemongo" %% "reactivemongo-akkastream" % "0.20.11"
libraryDependencies += "org.reactivemongo"  % "reactivemongo-shaded-native" % "0.20.11-linux-x86-64"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.2.30"
libraryDependencies += "com.github.ornicar" %% "scalalib" % "6.8"
libraryDependencies += "org.lichess" %% "scalachess" % "9.3.1"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.5"
libraryDependencies += "com.typesafe.akka" %% "akka-slf4j" % "2.6.5"
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"
libraryDependencies += "joda-time" % "joda-time" % "2.10.6"
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.0"
libraryDependencies += "com.typesafe.play" %% "play-ahc-ws-standalone" % "2.1.2"
libraryDependencies += "com.typesafe.play" %% "play-ws-standalone-json" % "2.1.2"
scalacOptions += "-deprecation"
