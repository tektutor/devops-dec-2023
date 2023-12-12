# Day 5

## Lab - Creating DevOps Pipeline with multiple stages

In this lab exercises, we would be creating 3 FreeStyle Jobs manually and then we will configure it in a way it runs one after the other as a DevOps Pipeline.

- First FreeStyle Job is BuildDockerImage ( Docker )
- Second FreeStyle Job is BuildMavenJobInSlaveDockerContainer ( Maven Build within Docker Container )
- Third FreeStyle Job is DownloadJarFromJFrogArtifactoryServerUsingAnsible ( Ansible Playbook )

#### Creating the BuildDockerImage FreeStyle Job
Let's create the First FreeStyle Job as shown below
General Section
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9da7b460-48c3-4405-ab81-7abdf2717cd7)

Source Code Management
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7a53e716-68c7-4d12-90b7-2d7723f56d92)

Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7e2db4f6-48a4-4873-a820-ccb34efa261c)

Build Steps
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/703bc3ee-aa08-4060-aaf0-e538971230c8)

Save the above FreeStyle Job.

#### Creating the BuildMavenJobInSlaveDockerContainer FreeStyle Job
Let's create the Second FreeStyle Job as shown below

General Section
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e13cbccc-9bca-46f9-a02a-e6ad4ca4a5ca)

Source Code Management
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/14e9888b-d323-49bd-9fcb-a88203a3f13e)

Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8322c3e7-00fd-4f2c-8829-182f461df32e)

Build Steps
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/bddb25a9-9e6d-485b-a9fd-ce4a9a7a8a9d)

Save the FreeStyle Job


#### Creating the DownloadJarFromJFrogArtifactoryServerUsingAnsible FreeStyle Job
Let's create the First FreeStyle Job as shown below

General Section
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7623479e-d680-4957-9fca-826e7560169d)

Source Code Management
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/17bd5c9c-d383-46c7-8743-a336b77398dd)

Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4dc93fa9-d827-4ce1-814e-91a06f4b08b2)

Build Steps
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/881cb730-496d-4201-9b74-ca189de1d0ef)

Save the above FreeStyle Job.

## Lab - Creating the DevOps - Build Pipeline View

At this point, your Jenkins Dashboard will have all the 3 FreeStyle jobs we created today as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e5dfbba6-3c6f-4df0-b569-4ad933003540)

Click on the "+" symbol and then click on "New view"
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f0d047a0-4aa4-4084-b99b-86838d4f7649)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/34f06c96-298e-4592-ad6c-f2d2d617c1ef)
Click on "Create" button

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/acae8932-953c-4532-8206-cbae0c60a4d2)

Under Pipeline Flow --> Upstream / downstream config --> Select Initial Job, you need to select "BuildDockerImage" as the first job in the pipeline.
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/07ef74a3-627a-4092-9779-218c485a395e)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1395bd74-08ab-4ea0-80a7-0f50984c0613)

Under Display Options --> No. of Displayed Buils, you may choose 10 or whatever number of build history your prefer.
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3aa5fda7-1bd3-4e29-ba69-4a5b7acf71d1)

Click on "Ok" to save the configurations.

