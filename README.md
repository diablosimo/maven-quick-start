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

#Directory conventions in maven
standard directory template: maven will look on them without any configuration.

standard java project producing jar file, maven will look on :
* the main java source code in `src/main/java`. 
* resources like properties files in `src/main/resources`.
* unit test resource files in `src/test/resources`

if project is a web application, maven will look on :
* java web application configuration and view files in `src/main/webapp`

need different locations : **override POM**.


