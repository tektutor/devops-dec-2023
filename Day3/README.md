# Day3

## What is Configuration Management Tool?
- a tool that supports automating administrative activies
- we can automate software installations/uninstations, updates/upgrades, creating users with certain permissions, setup firewalls/proxy, configuring db servers, importing databases, rebooting, user management, etc.,
- examples
  - Puppet
  - Chef
  - Salt/Saltstack
  - Ansible

## What is DSL?
- Domain Specific Language
- the language used to write the automation script
- the DSL used by Puppet/Chef tool  is Ruby scripting language
- the choice of DSL makes a configuration management tool easy or tough

## Puppet/Chef
- DSL used in Puppet/Chef is Ruby
- the installation process is very tough
- requires many servers/machines
- learning curve is steep
- architecture is complex
- uses proprietary tools for everything
- client/server architecture
- the machines where Puppet/Chef performs software installation automation is called Puppet/Chef nodes
- In the Puppet/Chef nodes we need to install some Puppet/Chef agents
- The agents will periodically connects to the Puppet/Chef servers looking for new automation scripts or any updates in existing scripting
- When the agents find a new/updated script, it pulls the scripts and runs on the Puppet/Chef agents
- follows Pull based architecture
  
## Why Ansible?
- agentless
- doesn't use any proprietary tools on the Ansible nodes
- DSL used is YAML, which is easy to learn
- Ansible itself is developed in Python language, but we don't need to know python to write Ansible playbooks
- Ansible architecture very simples
- Ansible comes in 3 flavours
  - Ansible Core ( open source, supports only command-line )
  - Ansible AWX ( open source, supports Web Interface, developed on top Ansible Core )
  - Red Hat Ansible Tower ( Requires license, developed on top of Ansible AWX )
- follows PUSH based architecture
- very easy to learn and install
- follows a very simple architecture
- developed by Michael Deehan
- Michael Deehan is former employee of Red Hat, after quitting Red Hat he started a company called Ansible Inc
- Ansible core was developed as an open source product
- Once Ansible Core gained popularity, Red Hat acquired Ansible Inc, hence Ansible is a Red Hat product
- Later, IBM acquired Red Hat, hence it is an IBM product

## What are the Ansible Alternatives
- Puppet
- Chef and
- Salt

## What is an Ansible ad-hoc command?
- through ansible ad-hoc commands, we call one ansible module at a time
- generally used for poc or as a support tool
- for complex automations, we need use Ansible Playbook

## What is an Ansible Playbook?
- is the automation script written in YAML file
- this helps in software installation and configuration automation
- it would be invoked one or more Ansible Modules in a specific order one after the other

## Lab - Finding the ansible version
```
ansible --version
```

Expected output
<pre>
┌──(jegan㉿tektutor.org)-[~/devops-dec-2023]
└─$ ansible --version 
ansible [core 2.14.9]
  config file = None
  configured module search path = ['/home/jegan/.ansible/plugins/modules', '/usr/share/ansible/plugins/modules']
  ansible python module location = /usr/lib/python3/dist-packages/ansible
  ansible collection location = /home/jegan/.ansible/collections:/usr/share/ansible/collections
  executable location = /bin/ansible
  python version = 3.11.2 (main, Mar 13 2023, 12:18:29) [GCC 12.2.0] (/usr/bin/python3)
  jinja version = 3.1.2
  libyaml = True
</pre>

## Lab - Creating a Custom Ubuntu Ansible node docker image
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible/CustomDockerImages/ubuntu
ssh-keygen
cp ~/.ssh/id_rsa.pub authorized_keys
ls
docker build -t tektutor/ansible-ubuntu-node:latest .
docker images
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3372882e-4346-4818-8fb7-9492fb185a79)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/2cbbf8d1-1639-402c-b143-dcdfda0e62a7)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/cb75a391-0cc0-4890-8a64-3d47ff6f7132)

## Lab - Creating a Custom CentOS ansible node docker image
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible/CustomDockerImages/centos
cp ~/.ssh/id_rsa.pub authorized_keys
ls
docker build -t tektutor/ansible-centos-node:latest .
docker images
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7366926f-32f0-4d8a-af46-67cea78919a1)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7d4c9fdc-67dd-4f9e-904e-1b894c84c8b4)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/067f3f84-cc7e-466a-9f87-711cc310d64a)

## Lab - Creating two containers using our custom ubuntu ansible node
```
docker images
docker run -dit --name ubuntu1 --hostname ubuntu1 -p 2001:22 -p 8001:80 tektutor/ansible-ubuntu-node:latest
docker run -dit --name ubuntu2 --hostname ubuntu2 -p 2002:22 -p 8002:80 tektutor/ansible-ubuntu-node:latest
docker ps
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f697a439-9bd1-49dd-b562-d6037d12e957)


## Lab - Testing the ubuntu1 and ubuntu2 ansible node containers for ssh connectivity with a key-based login authentication
```
ssh -p 2001 root@localhost
exit
ssh -p 2002 root@localhost
exit
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c99597f9-85f4-4192-8dd1-83615b6a7964)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d84533e2-d2ff-4988-80f6-1802a63c6931)

## Lab - Running an ansible ad-hoc command using ping module
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible -i inventory all -m ping
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/5f0df1f3-5094-4c3a-93b0-918ad4bf8a97)


## Lab - Ansible ad-hoc command to retrieve facts about the ansible nodes using setup ansible module

Things to know about setup ansible module
- the setup modules gets invoked as the very first task in a playbook by default
- it collects many useful details, like what OS the ansible node has, what is the python version installed, hardware details, kernel details, etc..,

```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible -i inventory all -m setup
ansible -i inventory all -m setup | grep ansible_distribution
ansible -i inventory all -m setup | grep ansible_os_family
ansible -i inventory all -m setup | grep ansible_pkg
ansible -i inventory all -m setup | grep python
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/008cf760-d3ce-44f7-90da-784ad06c10c1)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f85862ef-17a9-4042-bbba-510d0edbfda7)

## Lab - Running your first ansible playbook
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-playbook -i inventory ping-playbook.yml
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1ce9114b-8d79-4fdb-88a1-5ca9935a9e42)


## Lab - Installing nginx using ansible playbook on the ubuntu ansible node containers
In this lab exercise, we will do the following
- install nginx in ubuntu ansible nodes
- configure nginx to pick html pages from our custom folder
- deploy custom web page that has machine specific details

```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-playbook -i inventory install-nginx-playbook.yml
```

Expected outupt
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3235ef11-a461-4640-8f47-fdda5ec3d64d)

Things to note
- green color indicates the task was successfully executed but ansible didn't modify anything on the ansible node to make it successfuly
- yellow color indicates, the task was successfully executed but ansible had to make some changes on the ansible node to make it successsful

Understanding idempotency property of Ansible Configuration Management tool
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-playbook -i inventory install-nginx-playbook.yml
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/db4f7bb7-15fd-4868-a49a-b575560eb5ba)

Things to note
- if we rerun the ansible playbook, it would report everything in green color, this is because ansible will first compare the current state of the machine with the desired state of the machine as expected in the playbook.  If there is deviation then ansible executes the task to match the actual state of the machine to desired machine state
- if the machine's current state already matches with the desired then ansible will simply the task as success in green color without executing the task, this property is called Idempotency
- the task with title "Gathering facts" is nothing but setup module which collects many facts about the ansible node.  This modules gets invoked as the first task in every play that appears in the playbook.

We are not able to access the web page from nginx web server, as the nginx service wasn't started after installing. You could verify this by trying out the below commands
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible -i inventory ubuntu1 -m shell -a "service nginx status"
ansible -i inventory ubuntu2 -m shell -a "service nginx status"
```
Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/38f32c35-03c0-4161-ade2-3d742823a2cd)

Now let's run the updated ansible playbook to start the nginx web server using shell module

```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-playbook -i inventory install-nginx-playbook.yml
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ac74c4b1-405e-4c64-8bc8-8759e58a429c)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7204919d-e943-47f7-809a-374f78d6e530)
![Uploading image.png…]()
