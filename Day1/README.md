# Day1

## Checking the maven version on your RPS Lab machine
```
mvn --version
```

Expected output
<pre>
┌──(jegan㉿tektutor.org)-[~/Downloads/apache-maven-3.9.6]
└─$ <b>mvn --version</b>
Picked up _JAVA_OPTIONS: -Dawt.useSystemAAFontSettings=on -Dswing.aatext=true
Apache Maven 3.9.6 (bc0240f3c744dd6b6ec2920b3cd08dcc295161ae)
Maven home: /home/jegan/Downloads/apache-maven-3.9.6
Java version: 17.0.9-ea, vendor: Debian, runtime: /usr/lib/jvm/java-17-openjdk-amd64
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "6.4.0-kali3-amd64", arch: "amd64", family: "unix"  
</pre>

## What is Agile?
- Fail-fast
- 

## SCRUM
- Daily stand-up meeting
  - What is the purpose of this meeting?
    - Discuss road-blocks, impediments
    - share updates
    - it is a fail-fast meeting
    - inspect plan & adapt meeting

## SCRUM vs Waterfall


## What is DevOps?
- fail-fast engineering process that helps catch the defects as soon as it is injected/introduced into code
- projects that follow Devops, the team members would be committing the source code several times a day
- the code written by developers will be integrated to the dev branch several times a day, only then we will be catch the defects as soon as they are injected into the stable code
- automated test cases are very crucial to find the bugs early during the development cycle
- converting manual efforts into code as much as possible
- Developers, QA, Operations Team

## What is Continuous Integration (CI)?
- the developers add automated unit testing and integrating testing as part of the features they integrate
- developers will be following Test Driven Development (TDD) 
- once the code is committed
- scope of automated testing is restricted to unit and integration testing

## What is Continuous Deployment (CD)?
- the application binary that passed all the automated test cases added by dev team will be deployed automatically into QA environment automatically
- automated test cases
  - smoke test
  - sanity test
  - end to end functional testing
  - component/API test
  - stress, load & performance testing

## What is Continuous Delivery (CD)?
- QA team certified builds are automatically delivered to customer's production like environment for further testing and manual approval
- Continuous Delivery could even deploy the application binaries to live production environment

## Who all are impacted by DevOps?
- You might be Developer, QA, System Administrator, DBA, Infra Engineer
- Developers
  - 20 years no developers would have done automated testing
  - today, whichever team follows DevOps, every developer must know Unit Testing Frameworks and TDD
    - Java Developers
      - JUnit/TestNG
      - Mockito/JMock/EasyMock,PowerMock
    - C/C++
      - CppUnit,CUnit
      - Google Test/Mock
    - JavaScript/TypeScript,ReactJS, AngularJS
      - Jasmine/Karma
    - C#(.Net)
      - NUnit/MS Test
      - Moq
   - manual developer testing activity should be converted into automated test cases by writing code
   - developers in this process will learn little bit of QA skills
   - developers also are expected to learn little of administration automating activities
     - configuration management tools ( Ansible, Chef, Puppet, Salt )
    - developers has learn little bit of QA & Admin skills (automation)
   - QA Engineers
     - they need to learn programming to the extent they know how to do white box testing, automating functional, componet,API test, load, stress, etc
     - Selenium
     - BDD Frameworks
     - they also need learn little bit of administration skills ( Ansible, Puppet, Chef, Salt/Saltstack )
  - Operations Team
    - need to learn infrastructure automation tools to provision machines locally or on cloud
    - need to learn configuration management tools to automate software installations & configurations

## What is Apache Ant?
  - build tool mostly used by Java based projects
  - open source tool developed by Apache Foundation
  - When Apache Foundation used Ant build for one of their complex product called Jakarta, they realized Ant build tools lacks the following
    - the use of XML to capture build instructions doesn't suit well and doesn't scale well for complex projects
    - dependency management
    - convention or standards - best practices

## What is Apache Maven?
- build tool used mostly by Java based projects
- however, it can be used to build other language stack projects as well like C++, C#, etc.,
- it is language agnostic build tool
- supports
  - dependency management
  - has conventions for pretty everything
    - it has conventions on how to name your projects
    - it has conventions on how to track various version of your compenents/artifacts
- though Maven also uses XML file, it doesn't capture build instructions, instead just has project name, its dependency, etc.,
- it is object oriented build tool
- it uses repositories
  - supports 3 types of repositories
    1. Local ( user home .m2 folder )
    2. Private ( has proprietary lib/framework jar and opensource lib/framework jars and plugins )
    3. Central Repository ( Web site that has all open sources lib/framework jars and plugins )

## What are Maven co-ordinates
- Maven has conventions for even on how we should name our projects
- the combination of all the 3 co-ordinates are supposed to unique
- Maven uses following 3 co-ordinates
  1. GroupId
  2. ArtifactId
  3. Version
 
- GroupId
  - your organization's reverse domain name ( Eg: tektutor.org is my startup domain name, reverse domain would be org.tektutor )
  - string
- ArtifactId
  - is the name of the packaged application binary
  - i.e. name of the jar/war/ear/zip etc.,
- Version
  - x.y.z
    - x - represents major version
    - y - represents minor version
    - z - represents incremental version

## Lab - Installing tree utility
When the below prompts for password type 'rps@12345' as the password without quotes.
```
sudo yum install -y tree
```

## Lab - Cloning this TekTutor code repository (from the terminal) - One time activity
```
cd ~
git clone https://github.com/tektutor/devops-dec-2023.git
cd devops-dec-2023
```

## Lab - Pulling delta changes everytime a new commit is done (this is done pretty much always)
```
cd ~/devops-dec-2023
git pull
```

## Lab - Building your first maven project
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
cat pom.xml
cat src/main/java/org/tektutor/Hello.java
mvn compile
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/bf1d5383-68e9-4cdd-ba5f-998649ef8230)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9ea16905-9cb2-4da8-8104-2cb599023627)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ea9eca64-bb81-4cbc-8a75-f97756a5d4a0)

Compile will create target folder to place all the application compiled binaries as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e085076d-131e-4184-83cd-913dcf5a6bbb)

Executing the Hello world application
```
cd ~/devops-dec-2023/Day1/hello
ls
cd target/classes
tree
java org.tektutor.Hello
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/18e4745a-b3a7-4537-9e61-350e989356d7)

Deleting the target folder
```
cd ~/devops-dec-2023/Day1/hello
tree target
mvn clean
tree target
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/19a0b4e7-ffea-430e-87cd-031956d52920)

## Info - What are Maven Plugins?
- Maven Plugins are jar files that are downloaded by Maven build tool on demand from Maven Central Repository website
- Maven Plugins are used by Maven build tool
- For every functionality, Maven build tool depends on specific plugins
- For example:
  - To compile maven project, maven depends on maven-compiler-plugin
  - To delete target folder, maven depends on maven-clean-plugin
  - To package application binaries as jar file, maven depends on maven-jar-plugin
  - To deploy application jar into jfrog artifactory or sonatype nexus, maven depends on maven-deploy-plugin
  
- Each Maven Plugin has one or more goals
- Each goal supports one functionality
- For example - maven-compiler-plugin supports 3 goals
  1. compile
  2. testCompile
  3. help

## Lab - Finding maven-compiler-plugin goals
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn help:describe -Dplugin=org.apache.maven.plugins:maven-compiler-plugin:3.11.0
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/6785cd07-1106-44a9-9691-3c1d6b3437d0)


## Info - Maven Life cycle

Life cycle is a combination many Maven Phases, each Maven Phase invokes one or more Maven Plugins, each Plugin has one more goals.

Maven supports 3 types of Life cycle
1. default
2. clean
3. site 

## Lab - Listing Maven default life-cycle phases
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn help:describe -Dcmd=compile
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/42e6b16d-3916-40a8-b9a3-5d1f9e6ed236)

## Lab - How maven uses the Maven co-ordinates to maintain the plugins and dependencies within maven local repository folder
Maven co-ordinates for maven-compiler-plugin is
<pre>
groupId - org.apache.maven.plugins
artifactId - jar name
version - 3.11.0
</pre>

The above maven co-ordinates of maven-compiler-plugin will be used as a directory structure within maven local repository folder as shown below
```
cd ~/.m2/repository
# the below folder is formed using groupId
cd org/apache/maven/plugins

## the below folder is formed using artifactId
cd maven-compiler-plugin

# the below folder is formed using version
cd 3.11.0

# you will be able to locate the maven-compiler-plugin jar and its pom in this directory
ls -l
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/339b31cf-83b6-489d-bd53-e1f4a12c7f34)
