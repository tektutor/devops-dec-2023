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


## Lab - Getting ansible help about any ansible module
To exit the exit, type letter 'q' without quotes
```
ansible-doc file
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/fc9a7b90-dc87-4054-88c4-5a058e45b13a)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f1d326aa-5030-4033-bc77-d66549e6c033)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3df1c69e-8c02-48ec-8d6e-9b92ee20b334)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/976a884c-5378-47fe-ac30-216fe6df45d5)


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
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c97b7894-98e5-4be9-9f8d-595f1d291c60)

Copying the default nginx config file from ubuntu1 container to local directory
```
cd ~/devops-dec-2023
cd Day3/ansible
docker cp ubuntu1:/etc/nginx/sites-available/default .
ls -l
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/38809e81-7eaa-452c-a3c0-e1b238823a1d)

Running the updated playbook
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-playbook -i inventory install-nginx-playbook.yml]
curl http://localhost:8001
curl http://localhost:8002
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/b16cf14c-aa2e-40a5-99c1-ca4bc1109eac)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/af4eac2b-5f9f-493a-973b-1d40301d4caf)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f0774a0f-bca0-4ff2-ac53-da646c8c7ac7)

Things to note
- So far we have used the below ansible modules
  - ping - helps test if ansible is able to communicate with the ansible nodes
  - apt - helps in installing/uninstalling/updating/upgrading softwares in Ubuntu Linux distribution
  - file - helps in create folders, files with specific permissions
  - shell - used to execute any shell commands within the ansible nodes
  - copy - helps in copying files from local machine to ansible nodes and vice versa
  - setup - helps in collecting facts about ansible nodes

## Lab - Using ansible template module to customize the html page 
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-playbook -i inventory install-nginx-playbook-with-template-module.yml
curl http://localhost:8001
curl http://localhost:8002
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/e50dc0b1-8e9f-4fa0-8d3f-e6057fbfeea3)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d09cc560-2e13-4d48-ae8b-acc59f1c70d0)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9b549636-c890-4f06-a2d3-061edd2c2e6d)

Things to Note
- In this lab exercise, we learned how we could use template module to customize the index.html page with variables
- Using template modules makes the html page dynamic as it is configures with machine specific details
- Ansible template modules internally uses Jinja2 python library

Recommended reference
https://jinja.palletsprojects.com/en/3.1.x/


## Lab - Download jar from JFrog Artifactory server using Ansible playbook
Just in case, your JFrog Artifactory container is not running, you need to create it as shown below
```
docker run -d --name jfrog --hostname jfrog -p 8081-8082:8081-8082 releases-docker.jfrog.io/jfrog/artifactory-oss:latest
docker ps
```

You can access the JFrog Artifactory from your RPS Lab web browser
```
http://localhost:8081
```
You need to change the password to 'Rps@12345' without quotes.


Then you need to deploy the application jars as shown below
```
cd ~/devops-dec-2023
git pull
cd Day1/multi-module-project
mvn deploy
mvn clean
```

Now you can procceed as shown below
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ls -l
ansible-playbook download-artifacts-from-jfrog-artifactory-using-playbook.yml
ls -l
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7d72cccb-639e-4fa5-9ed0-84ffb0deec07)

## Lab - Passing extra variables to ansible playbook
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
curl http://localhost:8002
ansible-playbook install-nginx-playbook-with-template-module.yml -e greeting_msg=Welcome
curl http://localhost:8002
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c8c01767-2392-4df1-b3a8-2c0770ecf2be)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/11d80062-36ee-4f2c-9369-b73f332576cb)

## Demo - Ansible Tower

Installing Ansible Tower Opensource (AWX)
https://medium.com/@jegan_50867/installing-ansible-tower-awx-e46d5231357d

When you login to Anisble Tower Web Interface looks as shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/84068656-abf0-4455-ba9d-3a0af6e0826b)

Create a new project ( GitHub Integration )
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/cafa1c15-13bc-4bef-980e-1a291651c267)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4f45cc44-84c4-4b6c-b2ba-a82154e93834)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7e02fb11-142e-45ed-9238-d4f6b1752006)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/cfc793e9-9760-4d8d-8948-74b9e8a4c17b)

We need to add a new credential and paste the private key we created in the RPS machine and save it.
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1dec1250-594d-453b-a9f2-6390886643d9)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/65bed279-1a00-4685-b9aa-83ff4ffb1c1b)

We need to create an inventory
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1b097adc-28b2-469e-b65a-9394c3a2c1b3)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/3fa354af-4a56-4835-90f7-7f2fdb54b15f)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9978556a-570c-4886-adf6-041aff733df9)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/453bdd11-9fc6-4c3d-9712-528214c7976a)

We need to create a Job Template to configure and run an Ansible Playbook within Ansible Tower
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f8cde36d-3363-4e90-a821-6f02931df5c2)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/2401fcd1-9166-4d5f-92c2-da0588c16932)

We need to launch the Job to run the Ansible Playbook
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9c544c2c-185a-4ba0-a9c2-543fc951fc7c)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/577f794f-9ead-4068-80e3-7daae8053dbf)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/05b4c8cc-b2ec-4683-b6d8-a61f47b19b31)

## Lab - Using Ansible vault to protect sensitive data like login credentials

When prompts for password, type 'Rps@12345' without quotes.
```
cd ~/devops-dec-2023
git pull
cd Day3/ansible
ansible-vault create jfrog-credentials.yml
cat jfrog-credentials.yml
```

Expected output
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/ed6cecb4-3cd3-4715-8948-34f324f45291)

