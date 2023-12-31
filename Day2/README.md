![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ecb69e94-b42a-461d-9f01-0096e6608100)# Day 2 - Docker

## Processor Packaging
- Two of types of Packing
  SCM
  - Single Chip Module
  - a single IC can host only one Processor
  MCM
  - Multiple Chip Module
  - a single IC can host multiple Processors
  - in a single CPU Socket, if we install a Processor (MCM) - this means 1 CPU Socket could support multiple Processors
 
## Server Grade Motherboads
- they support Multi-socket 

## Processor with multiple CPU Cores
- maximum CPU cores you have seen in a server grade processor
- 256 cpu cores per processor

## What is Hypervisor ?
- Virtualization Technology
- helps us run multiple Operating System on the same laptop/desktop/workstation/server
- mutiple OS can be active at the same time on the same machine
- this is a Hardware + Software technology
- We need Processor that supports Virtualization
- AMD processor
  - Virtualization feature supported by AMD Processor is AMD-V
- Intel processor
  - Virtualization feature supported by Intel Processor is VT-X
- There are two of hypervisors softwares
  - Type 1 
  - Type 2
- Type 1 Hypervisor
  - used in servers/workstations
  - this doesn't require an Operating System to be installed to create Virtual Machines
  - this is also called as Bare Metal Hypervisor
  - Examples
    - VMWare vSphere/vCenter
- Type 2 Hypervisor
  - used in laptops/desktops/workstations
  - this requires an OS to install the Hypervisor
  - Examples
    - VMWare
      - Fusion ( Mac OS-X ) - requires license
      - Workstation ( Windows & Linux ) - requires license
    - Microsoft Hyper-V ( Windows ) - comes with server grade windows
    - Oracle VirtualBox ( Linux, Windows & Mac ) - Free  
    - KVM ( Linux ) - opensource & Free
- this type of virtualization is considered heavy weight as each OS that we install in a Virtual Machine requires dedicated hardware resources
  - we need to allocate CPU Cores to each VM
  - we need to allocate RAM to each VM
  - we need to allocate Storage to each VM
  - Virtual machine also gets virtual network card and virtual graphics cards, etc.,
- each Virtual Machine represents one fully functional Operating System, these OS that runs inside the Virtual Machine is referred as Guest OS
- In case of Type 2 Virtualization software, the OS on which the virtualization software is installed is referred as Host OS

Advantages
- to host 1000 OS as VMs, how many minimal physical servers are required
- Technically, 1 Physical server can host 1000+ Virtual machines
- 
## How many physical servers are required to support 1000 OS without using Virtualization software/technology?
- 1000 Physical servers
- We need a data-center(server room) that can occupy 1000 server
  - Real estate cost involved ( rent/lease )
  - Servers tend to create lot of noise ( sound proofing cost involved )
  - Servers tend to create lot of heat ( Air Conditioning that runs 24x7 - cost involved )
  - Servers are power hungry, they will consume lot of electricity
  - Electricity Bill
- Assume that the server motherboard has 4 CPU Sockets
- If we install MCM based Processor, i.e each IC supporting let's say 4 processors
- 16 Processors and each Processor supporting 256 CPU Cores
- total cores = 16 x 256 = 4096 Physical Cores
- total virtual cores = 4096 x 2 = 8192 virtual cores
- Virtual machines use virtual cores
  - Hyperthreading - each physical cpu core supports 2 to 4 virtual cores
## Hypervisor vs Docker

## High Level Architecture of Hypervisor

## Linux Kernel Features that enable Container Technology
- Namespace
  - this helps in isolating one container from other containers
- Control Groups (CGroups)
  - this helps in applying some resource quota restrications for containers

## Docker Overview
- light-weight application virtualization technology
- each container represents one running application
- containers don't run OS
- containers dont' get their own dedicated hardware resources
- containers don't have their own OS Kernel
- containers are just application process that runs in separate namespace
- containers will never be able to replace Operating System or Virtual Machines
- containers are not competing technology to Virtualization, they are complementing technology. Meaning, they can used in combination.

- each container represents one application
- each container runs in a separate namespace
- each container has its own virtual network stack
- hence, every containers gets one or more IP Addresses
- containers has its own file system
- containers are created using Container Images
- Container Images comes with pre-loaded/pre-installed applications
- Whaever software are there in the Container Image, are available in a ready to use fashion on the containers
  
## High Level Architecture of Docker
![Docker Architecture](DockerHighLevelArchitecture.png)

## What is Container Engine?
- high-level software which is also end-user friendly
- Container Engines depends on container Runtime softwares to manage containers
- as this is user-friendly, end-users like us tend to use this software instead of Container Runtime
- Example:
  - Docker is a Container Engine which internally depends on Containerd that in turn depends on runC Container Runtime
  - Podman is a Container Engine which internally depends on CRI-O Container Runtime
    

## What is a Container Runtime?
- is a low-level software that knows how to manage containers
- manage containers
  - create containers in background/foreground
  - list containers
  - delete containers
  - start/stop/restart/kill/abort containers
- it is not so user-friendly software, hence normally no end-users use this software directly
- Examples
  - runC
  - CRI-O
  - rkt
  - LXC

## Docker Alternatives
- Podman
- Containerd

## Installing Docker in Windows
https://docs.docker.com/desktop/install/windows-install/

## Installing Docker in Ubuntu
https://docs.docker.com/engine/install/ubuntu/

## Installing Docker in CentOS
https://docs.docker.com/engine/install/centos/

## Installing Docker in Mac
https://docs.docker.com/desktop/install/mac-install/

## What is Docker Image?
- Docker Image is similar to window iso DVD image we download from Microsoft website
- We can burn a DVD with windows iso, with that Windows Image DVD we can install Windows on any number of Laptops/PC
- Docker Image is similar to ISO images
- Docker Images container some pre-installed softwares
- With Docker Image we can create as many containers as we need
- a blueprint of a Container

## What is Docker Container?
- Container is a running instance of a Docker Image
- When we create a container using a particular Docker Image, that containers gets an unique name and hostname
- The container will be in any one of following state
  - created
  - running
  - exited
- The container gets an Private IP address
- The container will have all the softwares installed on the Docker Image
# Docker Commands

## Lab - Finding the docker version
```
docker --version
docker info
```

Expected ouput
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ee1a7535-bcad-4898-b0d3-faf1aba7cd97)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/80cb0ddd-78b0-43f8-b41a-ffe9df847cf6)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/bfe50e3a-23ac-4850-916b-b3e3d9d458ea)

The default location of Docker Local Registry is /var/lib/docker

## Lab - Listing docker images in your docker local registry
```
docker images
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/13669931-31bb-409f-a0b9-e8eded623abd)

## Lab - Deleting a Docker Image from your local docker registry
```
docker rmi hello-world:latest
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c2472df5-a9eb-48b1-abb5-5419e713a8ad)

## Lab - Downloading docker image from Docker Remote Registry to Docker Local Registry
```
docker images
docker pull hello-world:latest
docker images
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7f445a47-f2d4-44af-9256-4bc590ee1b46)


## Lab - Creating a container in background
```
docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:16.04 /bin/bash
```
The above command will create a new container and start running the container

Things to note
<pre>
d - stands for deattached/daemon i.e runs the container in the background
it- interactive terminal
name - ubuntu1 is the name of the container we have assigned
hostname - ubuntu1 is the hostname we have assigned for the container
ubuntu:16.04 - is the docker image we downloaded from Docker Hub Remote Registry
16.04 - is the tag/version of ubuntu we downloaded from Docker Hub Remote Registry
/bin/bash - is the shell we launched inside the container
</pre>

Each time we execute the docker run command, it would create a new container and starts that, hence we must provide a unique container name and hostname.

As long as the bash shell contintues to run inside the container, the container will be running.  If we exit the bash shell inside the container then it will exit container as well, leading to stopping the container.

Let us list the docker images to check if the above command has download the ubuntu:16.04 image from Docker Hub - Remote Registry to Local Docker Registry
```
docker images
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/58a9599e-da46-42c1-9d05-ffb38473c643)

Finding if the ubuntu1 container that we created is running
```
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/247dbb7a-50d5-432d-af66-7a126fe4b2d4)

## Lab - Stopping a running container
```
docker ps
docker stop ubuntu1
docker ps
docker ps -a
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e8c30727-ebe8-49a5-a6f8-893b7f82c225)

## Lab - Start an exited container
```
docker ps -a
docker start ubuntu1
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d10906e9-fbb3-4bad-b88e-5f0a41a3b3a4)

## Lab - Restarting a running container
```
docker ps
docker restart ubuntu1
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0acee6c2-cb7e-4e49-afb3-83787b896755)

## Lab - Deleting a running container
```
docker ps
docker rm ubuntu1
docker stop ubuntu1
docker rm ubuntu1
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ea3aa885-c4c3-4078-8934-a80a49e8833f)

## Lab - Forcibly deleting a running container
```
docker ps
docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:16.04 /bin/bash
docker ps
docker rm -f ubuntu1
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ccf7e3d9-25e3-463b-abd2-1372c062193f)


## Lab - Delete multiple containers forcibly with one command 
```
docker ps -a
docker rm -f pg jfrog c2
docker ps -a
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/6b8c411d-5622-41c4-b46d-a9d200a29056)

## Lab - Deleting multiple containers forcibly without using their names

Let's first create 3 containers
```
docker run -dit --name ubuntu1 --hostname ubuntu1 ubuntu:16.04 /bin/bash
docker run -dit --name ubuntu2 --hostname ubuntu2 ubuntu:16.04 /bin/bash
docker run -dit --name ubuntu3 --hostname ubuntu3 ubuntu:16.04 /bin/bash
```

Let's list and check them if they are running
```
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/75da2abf-50b7-447f-a0bb-cef8ddadb810)

Let's list only the container ids of currently running containers
```
docker ps -q
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/fef4b4f4-94d5-4b3b-a2eb-2c1cc687a022)

Let's now combine the above command as a sub-command to delete all running containers
```
docker rm -f $(docker ps -q)
```

Expected ouput
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/be6f56ad-e05d-4809-9db3-90926a3c7da7)


## Lab - Creating a mysql db server container
```
docker images
docker run -d --name mysql --hostname mysql -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ea89f52a-d5fa-40b7-b292-c31555da7296)


Checking the mysql db server logs
```
docker logs mysql
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1859615a-0904-48d8-b0c1-f21570baba8e)

## Lab - Finding details of mysql container
```
docker ps
docker inspect mysql
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/98bc5036-21e7-48d6-9c25-1a1fd84f8620)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/2a839201-2467-4fff-921b-85485081f9e7)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8133d24d-9b8c-45c4-a8bd-1b02993305dc)

## Lab - Finding the IP address of a running container
```
docker inspect mysql | grep IPA
docker inspect -f {{.NetworkSettings.IPAddress}} mysql
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4ad25269-ca34-4bdf-a369-8ebddc9dd10c)

Pinging the container IP from your RPS CentOS machine terminal
```
ping 172.17.0.2
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8fb28591-023f-4a50-8948-350a0d9a8000)

## Lab - Finding more details about a Docker image
```
docker image inspect mysql:latest
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/458af43c-cf20-4b66-98ca-57f3b409ee47)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b0b5853f-bd6b-4f61-831a-ddb05e4d165f)

## Lab - Connecting to mysql server using mysql client inside the container shell

Getting inside the mysql container shell
```
docker exec -it mysql /bin/bash
ls
```

Connecting to mysql server, using the mysql client that comes with the mysql container
```
mysql -u root -p
```
When it prompts for password, type 'root@123' without quotes.

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/727a8cc0-2a97-499e-ba59-9bc50a98f93c)

Creating a database in the mysql db server and switching to the database
```
SHOW DATABASES;
CREATE DATABASE tektutor;
USE tektutor;
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/867daf1d-fc7e-4953-a578-5c33b324c44c)

Let's create a table and insert some records as shown below
```
SHOW TABLES;
CREATE TABLE training (id INT NOT NULL, name VARCHAR(200) NOT NULL, duration VARCHAR(200) NOT NULL, PRIMARY KEY(id) );
INSERT INTO training VALUES ( 1, "DevOps", "5 Days" );
INSERT INTO training VALUES ( 2, "Kubernetes", "5 Days" );
SELECT * FROM training;
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/464009ea-0430-4819-bf28-f69695e6f7b9)

Let's disconnect my mysql server, exit and delete the container
```
exit
exit
docker ps
docker rm -f mysql
docker ps -a
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/8561d0b5-8451-4ac7-b886-6737fbf79faa)

At this point, we lost all data stored within the mysql container.  The reason being, we used the container storage, which is a very bad idea.  As containers are temporary resources, we shouldn't store data inside the container storage, instead we should use an external storage.  We will learn the best practice in our next lab exercise.


## Lab - Using host directory as an external volume within mysql container to persist data permanently
Let's create a mysql directory inside /tmp directory
```
mkdir -p /tmp/mysql 
ls -lha /tmp/mysql
```

Let's see if any containers are running
```
docker ps -a
```

Let's create the mysql container using /tmp/mysql folder as the external storage within container
```
docker run -d --name mysql --hostname mysql -v /tmp/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/433a9feb-d617-46d2-81f3-41f5bb2223bf)


Let's connect to mysql server using the mysql client that comes with the mysql container
```
docker exec -it mysql /bin/bash
mysql -u root -p
SHOW DATABASES;
CREATE DATABASE tektutor;
USE tektutor;
SHOW TABLES;
CREATE TABLE training (id INT NOT NULL, name VARCHAR(200), duration VARCHAR(200), PRIMARY KEY(id) );
INSERT INTO training VALUES ( 1, "Kubernetes", "5 Days" );
INSERT INTO training VALUES ( 2, "Microservices using Spring Boot Framework", "5 Days" );
exit
exit
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/75bc42f4-0937-41a1-8400-f18beb53298b)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a6840224-cf59-45e4-b945-3ef44d82cefc)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/91dca4f8-07ed-4447-babe-aa690ce5d779)


Let's delete the mysql container forcibly
```
docker rm -f mysql
docker ps -a
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a1d81ee4-0a33-42be-8896-d9de53c9835e)


If you check the local machine /tmp/mysql folder, it would look as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/64e110f2-2029-4080-a56d-f85b96e1309b)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/85a9b78a-0327-41bc-b9d3-3f2a954f1c84)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5eb45e95-31e1-4cd3-9c67-7f17b64fcf2c)

Let's create a new mysql container mounting the same /tmp/mysql local folder as shown below
```
docker ps -a
docker run -d --name mysql --hostname mysql -v /tmp/mysql:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
docker ps
docker exec -it mysql bash
SHOW DATABASES;
USE tektutor;
SHOW TABLES;
SELECT * FROM training;
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/dafcf796-8cc6-4525-868a-6ccc1a3f859b)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c72c6422-fad4-42cc-9f11-e848a4a8b6eb)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0bf9754b-6894-4814-8a60-6820d43ffd78)


## Lab - Creating nginx web server as a container
```
docker ps -a
docker run -d --name web1 --hostname web1 nginx:latest
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/a0f208ed-94ac-4330-8b22-56738ecb9df0)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7265d154-6358-4a83-985f-f233cab370d7)

## Lab - Creating nginx web server with port forward to expose the container service to outside world
```
docker rm -f web1
docker run -d --name web1 --hostname web1 -p 8001:80 nginx:latest
docker ps
docker inspect web1 | grep IPA
ifconfig ens192
curl http://localhost:8001
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0a0751a6-a303-4065-a929-c4ec1451a2a6)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/094c6591-a77e-4431-aef1-7dfd84c6a257)

## Lab - Creating a container in the interactive/foreground mode
```
docker ps
docker run -it --name c1 --hostname c1 ubuntu:16.04 /bin/bash
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5227108f-8f20-4f04-b7dd-59870d4ceb0b)
