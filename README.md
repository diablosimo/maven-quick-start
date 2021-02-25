# maven-quick-start
Sample project to use with maven-quick-start
# Main Groups
##Goals
the lowst level of work in maven.
ex: package a jar file. 

syntaxe: Plugin +goal name

Ex: compile goal and Compiler plugin (copiler:compile)
##Phases
##Lifecycles
* jar : compile, package , install
* clean: clean

#Directory conventions in maven
standard directory template: maven will look on them without any configuration.

standard java project producing jar file, maven will look on :
* the main java source code in `src/main/java`. 
* resources like properties files in `src/main/resources`.
* unit test resource files in `src/test/resources`

if project is a web application, maven will look on :
* java web application configuration and view files in `src/main/webapp`

need different locations : **override POM**.

#Target directory
intermediate folders for maven to arrive to jar file
* mvn clean: remove target folder.

>mvn clean package

install : maven local repository
`[INFO] Installing C:\Users\simob\IdeaProjects\devops\pom.xml to C:\Users\simob\.m2\repository\com\irisi\maven\1.0-SNAPSHOT\maven-1.0-SNAPSHOT.pom`

#Plugins

* make up nearly everything in Maven.
* providing the default functionality and behaviors in Maven,
* plugins add more functionality and features.
* For example plugins often add more goals, that can be executed in a Maven build.
* Plugins are also dependencies that need to be downloaded.
* Plugins can do just about anything.
* Some examples of commonly used plugins would be
  * compiling project source code, running and reporting on unit tests,
  * publishing build artifacts to an artifact repository,
  * deploying your project to a remote server,
  * building and publishing to a documentation server, and many many more.

* Maven comes with a basic set of plugins to get started.
*Many common or core plugins are simply known to Maven and are downloaded when needed. Other plugins need to be explicitly mentioned
* in your project's POM file, in order to let Maven know that you want to use that plugin.
* In either case, if you want to change the default behavior of a plugin, you can specify the various options within your project's POM file, and the appropriate configuration section.



The first thing Maven does is resolve any dependencies that need to happen for the build.

In this case, we're specifying a particular plugin version and Maven will go download that particular version. It first downloads the POM file, 
and then based on that POM file will go get the actual Jar file that contains the plugin.

As part of that, there may be some additional dependencies that need to be downloaded; these are known as transitive dependencies. So, any dependencies
of our dependency, that is our plugin, will also be downloaded as needed.

And then, finally, we're able to go through the process as normal and compile our code, which now, since we're using the correct version of the source and target
for our particular version of Java installed, we're able to take advantage of the more modern aspects, or features, within the Java language.