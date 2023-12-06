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
  
