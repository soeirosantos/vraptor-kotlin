# VRaptor Kotlin Hello World

This Hello World shows how Kotlin can interoperate with Java using a Java EE7 implementation and a third-party framework.

## Kotlin
https://kotlinlang.org/
Kotlin is an OSS statically typed programming language that targets the JVM, Android, JavaScript and Native. The first official 1.0 release was in February 2016.

## VRaptor
http://www.vraptor.org/
VRaptor is an opensource MVC framework which delivers high productivity to your Java Web applications on top of CDI.

## Running the sample

This sample depends on a Java EE7 runtime.

Download and unzip the Wildfly 10: http://download.jboss.org/wildfly/10.1.0.Final/wildfly-10.1.0.Final.zip

Clone the repository and navigate to the root of the project, then execute the following commands (changing ${WILDFLY_HOME} by the correct Wildfly location):

```
$ gradle war
$ cp build/libs/vraptor-kotlin.war ${WILDFLY_HOME}/standalone/deployments
$ ./${WILDFLY_HOME}/bin/standalone.sh
```

Access: http://localhost:8080/vraptor-kotlin/hello