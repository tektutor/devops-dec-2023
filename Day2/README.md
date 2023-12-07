# Day 2 - Docker

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
## Hypervisor vs Docker

## High Level Architecture of Hypervisor

## Docker Overview

## High Level Architecture of Docker

## Docker Alternatives


