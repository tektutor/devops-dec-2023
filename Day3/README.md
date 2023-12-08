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
- follows Pull architecture
  
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

## What are the Ansible Alternatives
- Puppet
- Chef and
- Salt
