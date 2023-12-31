![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/240c088d-9514-4889-a5cc-f013a3b70f90)# Day4

## Launching Jenkins Build Server
```
cd ~/Downloads
java -jar ./jenkins.war --enable-future-java
```

Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/500c931e-bf3b-4311-9d7a-18d8216b11cf)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e14bd35d-e40b-43fb-9bcb-1d1982053976)

Accessing the Jenkins Dashboard on your web browser
```
http://localhost:8080
```

If this is the first time you are starting Jenkins, then Jenkins will prompt for initial admin password
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/95a67a4b-1117-4ebf-8968-e2671d366585)

It would then ask for installing plugins
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/08ef3275-fbb5-4ec3-8d2f-b338470d417a)

Let's select "Install Suggested Plugins"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/1a036a2f-dd0f-4ad6-baa8-86f6f19a5ce2)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/86fe2348-ddaa-4dca-99d7-2410769cee62)

Then you will get the below page
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/cc49b484-9cfd-4194-b73e-b5951286de2a)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b2c2b6be-6b31-4ec8-ab37-31530ea66fe0)
Click on "Save and Continue" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/94616707-e2f7-4431-b620-e5053e3254ea)
Click on "Save and Finish" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d80ff254-846f-4755-b33f-8eb432d86265)
Click on "Start using Jenkins" button

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2a03d47d-4218-4be5-b825-89dcf573388d)

We need to install few additonal plugins, hence let's click on "Manage Jenkins" link on the left side of Jenkins Dashboard 
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/0fad5cac-12b6-4234-8ecf-8bbe1e704e4c)

Let's click on "Plugins"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/4d0e9eb1-fd0b-47cb-b22f-7110aa60575f)

Let's click on "Available Plugins", Search for Docker and select the checkbox
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/42802595-e509-407f-9422-e86270d18c50)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/368a1f66-f1b8-4916-9812-9a5160d35304)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9813ce32-2092-4b9a-af96-07ec8347837d)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/f91f6260-707f-4614-b8ee-89d847e3dcc1)
Click on Install

Make sure the "Restart option" is select, 
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/c893d1eb-fd9c-47c2-906a-a2a65df951de)

Once the additional plugins are installed and Jenkins is restart, we get to see the below page
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2c2e4c13-f36a-4cf9-9842-b3ec1489ee01)

Let's type the login credentials and sign in
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/a30628bf-f3b6-48f1-8c89-4ceaba9d15d3)

Let's go to "Manage Jenkins --> Tools"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/98c12914-c017-42b1-bf97-3c0635265eba)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/be371467-e59b-445d-a4d7-ed2335d2bebd)

Let's add JDK configuration by clicking "Add JDK" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b68b9e2f-632d-4fc5-a7f6-599083c1faa2)

Let's uncheck the "Install JDK" checkbox to get the below screen
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/eb9fe8ff-41d9-4ca6-a9a0-aeab88a9891f)

Using your Ubuntu terminal, check the maven version to copy the JDK path
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7f61567d-5ffe-498f-8da5-ee2e83797150)
We need to paste the path in Jenkins as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5281167d-ea06-4a2c-b922-565438ff32c7)

Let us scroll down to "Maven Installations"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7444d0bd-14b9-4250-9456-16431de7525b)
Click on "Add Maven" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/916ea8ac-18e3-466c-a0a0-0a8cf4c0a2e0)
Uncheck the "Install automatically" check box
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/c20a26bf-dc02-4c76-b9f0-a43e9f8a28a9)

From your ubuntu terminal, copy the mvn home path
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/78082eb2-aed7-4b01-afbf-56d71d11a755)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/5c05bd2a-98e4-4562-99da-7e44fe0d98af)

Click on "Save" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/44203be9-50cd-43c2-8afa-35f657bcd038)

Let's navigate to "Manage Jenkins --> Clouds"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2857782b-fcd3-47e8-945a-0cbc9a10f378)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2c450939-4174-406c-be3d-aa09d916c285)
Click on "New cloud"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9480899e-69e4-4fde-814b-678b68ff75fb)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2cc19341-116c-41af-bd74-dbe3964d5cda)
Click on "Create" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b3886349-929b-4a14-9d93-db905f66dfc3)

Click on "Docker cloud details"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/18e58194-8a83-4758-93a9-6bd8d93099d9)

We need to configure the Docker Service to support REST API access for remote docker clients and for third-party application like Jenkins to interact with Docker service.

Let's launch the ubuntu terminal and type the below command
```
sudo systemctl status docker
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/734f1981-0b84-4788-a050-29bf8f38ab99)

From the above screen, you may copy the path of docker service configuration file
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/eb0fc832-5e90-480f-95b1-b82900831bf5)

Then, let's edit the file /lib/systemd/system/docker.service as an administrator
```
sudo vim /lib/systemd/system/docker.service
```
In the above file at line number 14 we need to append the below string
```
-H tcp://0.0.0.0:4243
```
Once the above string is appended it should look as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e0e406da-8636-423f-bf39-d5be6034c0b5)

To apply the service configuration changes, we need to restart the docker service 
```
sudo systemctl daemon-reload
sudo systemctl restart docker
sudo sytemctl status docker
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/27fa0696-d1d8-4b3e-8ee5-60e8675867d5)

Now you may proceed with Jenkins configuration
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2bc64d11-899a-4cd4-83ee-5e790ed4ba77)

Let's test if Jenkins is able to communicate with Docker Server by clicking on "Test Connection" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/dfbb9d70-9f78-4575-bd1b-c2f04edd564e)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/8ecee7fa-bc36-4e08-be3b-a80bee973fee)

Let's click on "Docker Agent Templates"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/85037954-d1b6-4390-9dfa-b26f766d0a3b)
Click on "Add Docker Template"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e013bc89-e6c4-45e2-bbe8-190e8735061d)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/f33f37cf-0506-40fe-ac15-448618f55ac1)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7bab6d71-76b8-4207-91e5-44ae4f26e6af)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d865166d-c504-4a05-afb7-24a15bb625b2)
Click on "Save" button

## What is Jenkins?
- is a build automation server
- used mainly for CI/CD Builds
- this was developed in Java by Kohsuke Kawaguchi, former employee of Sun Microsystems
- Initially it was developed as Hudson is an opensource project
- Then Oracle acquired Sun Microsystems, then part of Hudson including Kohsuke Kawaguchi had quit Oracle
  created a new branch from Hudson called Jenkins
- The other part of the Hudson team they continue to develop the product as Hudson
- There is lot common code between Hudson and Jenkins
- More than 10000 active contributors are there for Jenkins
- Many other software vendors got inspired by Jenkins similar products came out in market like Bamboo, Team City, Microsoft TFS, etc.,
- Jenkins supports CI/CD build for products built in any software stack
  
## What is Cloudbees?
- Cloudbees is the enterprise paid variant of Jenkins
- Feature wise Jenkins and Cloudbees pretty much they are same
- We get support for Cloudbees while we only get community support for Jenkins
- Cloudbees is more stable as it is a paid version
  
## Jenkins Alternatives
- Bamboo
- Team City
- Cloudbees
- Microsoft Team Foundation Server (TFS)

## Lab - Creating a Maven Jenkins Job to setup CI for one of our Maven project

For navigate to jenkins Dashboard
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5bdc97b0-eb92-4c1d-9301-3fdffb730c49)

Click on "Create a Job" and select Maven style job
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d9988609-5f45-49ab-9e2f-1e0ff6538292)

General section
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/514a77e1-f2a3-4688-96cc-5137f7c69940)

Source Code Management
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b5760820-e59b-462a-b2e8-3e8492db3429)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/20214af1-d976-4f3b-8535-e34ceffe7338)

Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4d595db9-fba1-4e5e-b0ba-0c34ac2528fc)

Build
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ac8fa6c4-6ad5-40b0-a283-43b7d4aa74cf)

Save
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/89054661-a0f7-484d-b773-a670c611749c)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/6b38e70d-7365-43c7-baa3-b757ae2f5bb7)

Build History ( within 2 minutes it will automatically start the build )
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/22fca429-c8b7-46b0-9ab1-a4e87a3808bc)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/592cd06a-e397-415e-9884-2067c7883b8a)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/cf86de63-83cb-4d26-a381-862cdd433b72)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5900f699-9aa4-496e-9a05-5f8ff44b66b0)

Jenkins workspace folder
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/30cc259f-585a-4f47-ba04-994caf787648)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a2e6fc76-8055-44a2-8018-222870ba629d)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/138d945c-36e0-4ea2-b24a-c5b113ad9993)


## Lab - Creating a Free style job in Jenkins

From Jenkins Dashboard, click on "New Item" menu on the left side
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/fe2b8a93-b3e6-4829-afdb-81da65ddec26)

Click on Ok
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8294821f-8fb5-49a3-8b00-ed72225398d9)

General section
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e49449ab-c806-4ec0-9443-fe4126fa4d9f)

Soure Code Management
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/60ce7742-957f-4ead-94b2-50d51d4acfca)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ab690175-d056-4c5c-8147-03be8a7799ed)

Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d96e365f-4447-4aca-ab84-3d1ac70c352c)

Build Steps
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7445dc43-72d4-4507-a21d-ded6fd8be112)
Select "Execute Shell"
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/319a83a8-a623-48bf-b724-0382e4faf34b)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f169d378-f033-4d76-bd5a-f2b45dd22447)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/6e6257d7-6041-47a1-a67a-dcbb7be23435)

Click on Save button
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0a7ef558-f970-494d-86e7-a471373b9396)

Build History
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/6600ac5a-78ef-4028-8e77-92fe0269ec1b)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e7f17d22-7a20-446b-9cdb-eb38bb2a875c)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c1a83b8d-ff0a-4932-81e3-8d266156268e)

## Lab - Invoking Ansible Playbook from Jenkins based on Code commit in GitHub(CI)
Navigate to Jenkins Dashboard
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b4a5e6c0-8575-4106-a67b-e03814916dad)

Click on "New Item" on the left side menu (Free style job)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5d92aff9-644b-461f-81dd-56e39ea8d11e)
Click on "Ok" button

General Section
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b58f9720-b6b8-4855-848f-a3a52cf3281a)

Source Code Management
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8f35364e-9f3d-4938-9250-e84906511cc4)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/bd770844-c60c-42fd-925a-bfb1dda275d2)

Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/51c83573-4307-4353-ac2f-de416cbfe842)

Build Steps
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e6fd54e8-3950-49e6-bb5c-3a83497c2831)
Add Build Step --> Select "Invoke Ansible Playbook"
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9efbb4c9-4bc4-49a7-beed-072c892b52fd)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/fcc536c9-f8c3-4d98-bb68-59185fbafb90)

Under Build Steps -> Vault Credentials section
Click on Add option by clicking the "+" symbol
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b543cb67-7d0b-4bfb-b269-cf18ebb49ba7)
click on "Jenkins"
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4fcff613-77a5-41c7-aa57-734e7adb8ffc)
Type "secret text" as "root@123" without quotes as the Vault password to decrypt and access the Ansible vault protected data.
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/99927f9e-55af-4409-adb0-c3d54f9a4e24)
Click on "Add" button to save the vault credentials in Jenkins
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/fe3d02d1-fa88-49c8-ad6c-688577d30eef)

Select the Ansible vault credential we just now saved
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/94a109a6-e136-4899-9a7c-aa717b475b98)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e403ee5a-ae45-4d61-ac67-18d048d9713d)

Click on Save button to save the Jenkins job configurations done.

## Lab - Configure Docker plugin to provision a jenkins slave container on demand
Let's navigate to "Manage Jenkins --> Clouds"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2857782b-fcd3-47e8-945a-0cbc9a10f378)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2c450939-4174-406c-be3d-aa09d916c285)
Click on "New cloud"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/9480899e-69e4-4fde-814b-678b68ff75fb)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2cc19341-116c-41af-bd74-dbe3964d5cda)
Click on "Create" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/b3886349-929b-4a14-9d93-db905f66dfc3)

Click on "Docker cloud details"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/18e58194-8a83-4758-93a9-6bd8d93099d9)

We need to configure the Docker Service to support REST API access for remote docker clients and for third-party application like Jenkins to interact with Docker service.

Let's launch the ubuntu terminal and type the below command
```
sudo systemctl status docker
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/734f1981-0b84-4788-a050-29bf8f38ab99)

From the above screen, you may copy the path of docker service configuration file
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/eb0fc832-5e90-480f-95b1-b82900831bf5)

Then, let's edit the file /lib/systemd/system/docker.service as an administrator
```
sudo vim /lib/systemd/system/docker.service
```
In the above file at line number 14 we need to append the below string
```
-H tcp://0.0.0.0:4243
```
Once the above string is appended it should look as shown below
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e0e406da-8636-423f-bf39-d5be6034c0b5)

To apply the service configuration changes, we need to restart the docker service 
```
sudo systemctl daemon-reload
sudo systemctl restart docker
sudo sytemctl status docker
```
Expected output
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/27fa0696-d1d8-4b3e-8ee5-60e8675867d5)

Now you may proceed with Jenkins configuration
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/2bc64d11-899a-4cd4-83ee-5e790ed4ba77)

Let's test if Jenkins is able to communicate with Docker Server by clicking on "Test Connection" button
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/dfbb9d70-9f78-4575-bd1b-c2f04edd564e)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/8ecee7fa-bc36-4e08-be3b-a80bee973fee)

Let's click on "Docker Agent Templates"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/85037954-d1b6-4390-9dfa-b26f766d0a3b)
Click on "Add Docker Template"
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/e013bc89-e6c4-45e2-bbe8-190e8735061d)

![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/f33f37cf-0506-40fe-ac15-448618f55ac1)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/7bab6d71-76b8-4207-91e5-44ae4f26e6af)
![image](https://github.com/tektutor/devops-nov-2023/assets/12674043/d865166d-c504-4a05-afb7-24a15bb625b2)
Click on "Save" button

## Lab - Building a Custom Docker Image to use it in your Jenkins Docker cloud configuration
```
cd ~/devops-dec-2023
git pull
cd Day4/CustomDockerImages
docker build -t tektutor/maven:latest .
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d381defb-cdb8-410c-a67e-aac6ff62d1f9)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a9e0bbc7-4411-4fad-b51e-d642fb8079b1)


## Lab - Configuring HelloFreeStyle Job to delete the build onto docker container

1. Whenever code is commited to TekTutor GitHub repository devops-dec-2023, the Jenkins built-in node will trigger the FreeStyleJob Jenkins job.
2. Since the FreeStyleJob is configured to run on a docker container based 'docker-slave' label configuration, Jenkins slave will request the Jenkins built-in node for a container.
3. Jenkins built-in node then will request the Docker Server to create container using tektutor/maven:latest image
4. Once Jenkins built-in(master) node gets a notification from Docker server that it has created the required container, Jenkins master node will then notify the Jenkins Free Style job to run in the newly provisioned docker container.
5. Once the build starts within the container, Jenkins slave ( remoting.jar ) within the container will clone the GitHub repo https://github.com/tektutor/devops-dec-2023.git and then it will build the maven job.
6. Jenkins master node will keep monitoring the status of the build and it gives the build report on the master node in a convenient way.

The HelloFreeStyle Job General section must be configured as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a38ec59d-bcf4-441c-a9ee-29f2b634ac17)

Make sure, you saved it.

Build status shows as below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e82a419a-b6ac-417e-a815-d8e0e431c3c2)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/bf89d37a-fca3-4c62-8cb2-e9c6f30084f0)
