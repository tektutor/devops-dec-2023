# Day 2 - Docker

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

## Docker Alternatives
- Podman
- Containerd

# Docker Commands

## Lab - Finding the docker version
```
docker --version
```

Expected ouput
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ee1a7535-bcad-4898-b0d3-faf1aba7cd97)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/80cb0ddd-78b0-43f8-b41a-ffe9df847cf6)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/bfe50e3a-23ac-4850-916b-b3e3d9d458ea)

