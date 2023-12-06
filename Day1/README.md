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

## Info - Maven Convention over Configuration
- this is based 80-20 Principle
- as per 80-20 Principle, they say if you consider any product, 80% of the times we use only 20% of the features of any product
- those 20% of the features which are commonly used shall be identified and it should be implemented in such a way it is easy to use
- most features which are rarely also must be supported, but it is ok if it requires hopping between multiple menu pages to reach out to the advanced features. As these advanced features are generally used by Expert users, that too rarely.
- 80% of the times, maven build tool will be used by Java based projects
- In some rare cases, maven build tool could also be used to build C++/C# projects, maven also supports such use-cases
- But using maven to build C++/C# projects are rare, we may have to configure maven as those projects may or may not follow all the Maven conventions
- If we follow Maven conventions, then we need to do little to no configurations, if we can't follow maven conventions, then we need to do more configurations

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

Maven life-cycle is a sequence of many maven phases executed from top to bottom order. For those phases some plugins are configured, the respective plugin goals will be invoked.

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
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/46a324e0-5b36-49e9-8b4f-f7207871bf67)


## Lab - Listing the clean life-cycle phases
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn help:describe -Dcmd=clean
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/fa541d40-b6d5-4b74-883e-5538785a4f6c)


## Lab - Listing the site life-cycle phases
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn help:describe -Dcmd=site
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/442cc708-4806-4505-9448-354842c97641)

## Lab - Understanding the use of mvn site command
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn site
```

The above maven command will generate html documentation based on the pom.xml. This documentation web pages can be accessed using web browsers by the team members to understanding the plugins and dependent libraries. 

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1a25bdad-6462-4a2d-a8f1-b52ebcdcb79d)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a20bfc2e-5019-4ac5-bf05-ffdcfc3fd393)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3411b6cf-b3b7-4b1c-a86b-3761adf2081d)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e21ed833-be6d-41c6-8fde-5d59bfe871f2)

## Lab - Integrating JUnit automated test cases as part of maven build
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
cat pom.xml
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/937f790c-6ed7-48b1-a5f3-59ba62f44340)
In the above screenshot, you can notice we added junit dependency so that Maven will download the junit testing framework jar file from Maven Central repository and cache in the Maven local repository.

Also notice, we added JUnit test case as shown below
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
cat src/test/org/tektutor/HelloTest.java
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/26b837d4-7cbd-4cd2-8535-cc4f43223e08)

We can now compile and execute the test cases as part of Maven build with the below commands
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn test
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ce5d88cd-918f-4918-99c1-5d32f76363ba)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c4a12dae-af31-4e04-bf9a-0e9d253a7f4d)

In the above screenshot, you can notice the maven build executed one test case as part of the build.  In case any one of the testcases or multiple test cases fail, the build will also fail.  The build will succeed, only if all the test cases passes.

## Lab - Launching JFrog Artifactory server as a Docker container
```
cd ~
docker run -d --name jfrog --hostname jfrog -p 8081-8082:8081-8082  releases-docker.jfrog.io/jfrog/artifactory-oss:latest
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5a1ae248-81fa-4127-8bb3-3748c7ef3c53)

Accessing the JFrog Artifactory from your RPS CentOS machine Web browser
```
http://localhost:8081
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/70fb7d71-be2e-4be8-99da-314b09b946de)

The default JFrog Artifactory server login credentials are
<pre>
username - admin
password - password
</pre>
When it prompts for changing the password, change it rps@12345

## Lab - Deploying application packaged jar files into JFrog Artifactory server
```
```
