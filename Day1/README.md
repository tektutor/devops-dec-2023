![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/2f49f32c-99b3-484f-afab-7d96b0293259)# Day1

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
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/16d7ec1d-900d-4f02-a411-6553625e5316)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/70fb7d71-be2e-4be8-99da-314b09b946de)

The default JFrog Artifactory server login credentials are
<pre>
username - admin
password - password
</pre>
When it prompts for changing the password, change it Rps@12345

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/be3cd670-663d-46ef-885f-8512228d8cd6)
Click on "Get Started" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7f801806-7755-4279-811e-12b34eabcf24)
Reset the password to Rps@12345

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3d174ae3-a232-4f42-b535-f6fa06d6204d)
Click on "Next" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e1936eba-f5d6-4009-8390-1ba8b815cfc0)
Click on "Skip" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a56a14e2-9e1f-404d-89f0-f9c03ef4c72d)
Click on "Skip" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7ddc194c-c620-4367-ac86-d8a9e794af77)
Click on "Skip" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/363dbbbf-eb61-4e53-896d-45fe52d91b01)
Click on "Finish" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/307675f2-6e7d-4c7f-821b-62efef29ff30)
Click on "Create a repository" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/92ca2e72-c6eb-4857-afd8-a704b66a3365)
Click on "Add Repository" and then select "Local Respository"

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8911835e-ac92-45aa-a587-1d53521a2e54)
Select "Maven"

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/144e2bc1-e6e8-4a91-811c-253cfbcc1f01)
type "tektutor" in the Repository key and click on "Create Local Respository" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/adfb0e4d-34fd-433a-b748-92d042223ec4)
You may close the window without creating users.

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b01110bc-bd21-4da5-91e1-530eadcd873f)

On the top Left, switch from "Administration" tab to "Application" tab
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d7baad06-746d-4450-9275-845e9106e68e)

On the top left, click on "Artifactory" and "Artifacts" under that
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4174240e-4e93-4c5f-bf9c-6e1b278e853f)

The url shown below is the URL we could use to deploy our application artifacts
http://localhost:8082/artifactory/tektutor/

## Lab - Packaging you application binaries as jar file
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn package
cd target
ls
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/61b0c511-5e17-48a3-b2fb-6391a8a408c0)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a6738c71-85fe-4947-aa02-1801280841db)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/db077c34-72cb-4e53-8f70-1042895f05a1)

## Lab - Installing(copying) the application jar and respective pom files into Maven local repository
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn install
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/cf2862fd-fbf1-4d02-998f-591fc409c36e)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/2ead13ad-931c-4237-8278-9e586c3e36a1)

## Lab - Deploying application packaged jar files into JFrog Artifactory server
As it is if we attempt to perform deploy, it would fail as shown below

```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn deploy
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/96ace6b5-e1cb-4386-8389-956f3d13905e)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b0d8d6fc-1011-450d-924f-5dc823c1d9bc)

This is because, we are yet to configure the JFrog Artifactory URL in the pom.xml file.

Hence we need to configure the pom.xml as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8a91e42c-3c45-4fb1-91d6-bfe78edfa754)

Let's attempt to deploy the jar file as we are done with the pom.xml configuration
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn deploy
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0512a387-1ae8-49cf-acb1-94f7cf776097)

The above is due to the unauthorized login, i.e we need to configure maven settings.xml file with the JFrog Artifactory login credentials, so that maven can login into the JFrog Artifactory server and then can successfully deploy the application jar and poms respectively.

Finding your maven installation path
```
mvn --version
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5e4f1dcc-1e59-42ed-b159-ba1f1166d116)

We can now edit the settings.xml file at the below path

gedit /home/jegan/Downloads/apache-maven-3.9.6/conf/settings.xml

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3d4c4a49-40c9-4ee6-808a-fc08cfafcaac)

Navigate to line number 112
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/11522951-9b4b-46b3-ae51-980f7ef7531f)

Copy the lines between line numbers 120 to 124 from the commented section and paste it below line number 112 as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/00162288-4bd6-459f-9085-5eaa7c90c858)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d8789193-4eae-4169-846d-a75b52893955)

Now edit the lines 113 thru 116 as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/02213e07-5f55-4355-a1bf-7afb84732fcc)
Save the changes and close gedit editor.

Let's check the JFrog Artifactory deployment url to see it empty
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/10451ff4-6aa6-4ae3-acf9-3c5ac5bc75fa)

Now you may try to deploy as shown below
```
cd ~/devops-dec-2023
git pull
cd Day1/hello
mvn deploy
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c4ade022-c030-43b8-8f57-3932fe9856fd)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/784b7de9-b9f2-4a80-bb4d-5b3db9fc7437)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/54cb3e19-219c-4c82-9a68-b9483f1fd348)

Now let us again check the JFrog Artifactory deployment url to notice the jar and pom files got deployed
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/aa20edb8-e034-417e-94a1-fd0330b81c6e)

If you are able to see your jar and poms deployed onto JFrog Artifactory server, you have successfuly deployed !


## Info - What is Super POM?
- this comes with Maven installation
- you can find this Super POM inside maven-installation-folder/lib/maven-model-xxxx.jar
- this file has all the default global configuration like maven central repo url, plugin repo url, life-cycle phase and its respective plugin configurations

## Info - What is Parent POM?
- this is the top level pom file we manually create
- this parent pom will have the name of the parent module defined in terms of maven co-ordinates
- will have common dependencies and configurations which will be inherited by all child modules
- the parent pom packaging must be marked as pom as they are not allowed to have source code
- the parent module will have one or more module element for each child module

## Info - What is Child POM?
- every child module in a multi module project will have pom.xml under the child module folder which is referred as the Child POM
- Child modules can optionally have source code, ie. this also could be parent some other child modules

## Info - What is Effective POM?
- Effective POM is the combination of properties, configurations inherited by Parent POM from the Super POM
- Effective POM from the point of child pom would have inherited everything from its immediate parent
- this is how, maven learns learns all the required properties to build a maven project
## Lab - Printing the effective pom for CRM parent module
```
cd ~/devops-dec-2023
git pull
cd Day1/multi-module-project
mvn help:effective-pom
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/babf2b10-5452-4936-8dcd-285374f92e0e)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/af57bb32-c504-47bb-bc7f-b7a8a87955a3)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/876a164f-12c9-4c10-b75d-5e91afb4e9ba)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0b252fa5-a85f-4f0c-943d-e07bc22b9302)

## Lab - Multi module project
```
cd ~/devops-dec-2023
git pull
cd Day1/multi-module-project
mvn compile
mvn install
mvn deploy
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/20253ecc-fa0d-4187-b479-aabb6d2fe284)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/cbd79f95-dcc3-4f5e-b7bf-79e1d16dccdb)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4794b4e5-ead3-401f-b37d-4032dbca04f5)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1fd61ce9-c6fc-4bad-ba0f-13e79d1d5169)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/90800d2e-5f1e-40f1-979f-31711d549a48)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e8938ea8-0170-4ff6-a65f-9711728acbf2)
