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


