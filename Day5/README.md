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
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/9518049e-662a-4f18-bdcc-c17df79328ca)

Your Dashboard would look like this now
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/0f7f0ceb-e1b2-4897-9b7e-f10c94e9fe76)


## Lab - Creating a DevOps Pipeline in declarative style using Jenkinsfile(groovy)
Head over to Jenkins Dashboard
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/1022d501-61bd-4ce9-ae5d-1f9d82efea64)

Click on "New Item" and Select "Pipeline"
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c53a144a-e694-4adc-aba5-034ccba9d532)

![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/d63e0c31-d13b-4114-a012-9de158986456)
Build Triggers
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/7bc30439-a1d8-4f35-97e1-75ad6db7f3a9)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/331b85e2-ee54-478c-b4b3-0a08c468fc68)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/f0f39330-36df-404a-83c2-dedb7c822290)
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/4fb94da3-c750-42bc-a489-2516d902cb01)

Make sure you saved the configurations.

If everything went well, it will automatically trigger the pipeline and your would get an output similar to screenshot shown below
![image](https://github.com/tektutor/devops-dec-2023/assets/12674043/c9f5ae9a-75b9-4e3c-91d8-ac03c9f5d44d)


## Lab - Setting up CI for mysql db changes using Datical liquibase

Datical tool to track db schema changes in declarative style

Let's create a mysql db container
```
docker run -d --name mysql --hostname mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
```
Expected output
<pre>
jegan@tektutor.org: docker run -d --name mysql --hostname mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root@123 mysql:latest
2d1d256a3e00104d7410d8f13ff09c8261307fdda6bf3961d18dc64a9e3565b6
</pre>


You may now check if the mysql db container is running
```
docker ps
```

Expected output
<pre>
jegan@tektutor.org: docker ps
CONTAINER ID   IMAGE          COMMAND                  CREATED         STATUS         PORTS                                                  NAMES
2d1d256a3e00   mysql:latest   "docker-entrypoint.s…"   2 minutes ago   Up 2 minutes   0.0.0.0:3306->3306/tcp, :::3306->3306/tcp, 33060/tcp   mysql
</pre>


Let us get inside the mysql db container, when prompts for password type 'root@123' without quotes
```
docker exec -it mysql bash
mysql -u root -p
CREATE DATABASE tektutor;
SHOW DATABASE;
```
Expected output
<pre>
jegan@tektutor.org: docker exec -it mysql bash
bash-4.4# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE tektutor;
Query OK, 1 row affected (0.01 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| tektutor           |
+--------------------+
5 rows in set (0.00 sec)

mysql> exit
Bye
bash-4.4# exit
exit
</pre>

Let's check the datical liquibase now

```
cd ~/devops-dec-2023
git pull

cd Day5/datical/db-ci
cat liquibase.properties
```

The liquibase.properties file has the mysql connection details and it looks as shown below
<pre>
jegan@tektutor.org:$ <b>cat liquibase.properties</b>
changeLogFile: dbchangelog.xml
url: jdbc:mysql://localhost:3306/tektutor
username: root
password: root@123
</pre>

Any schema changes that we wish to perform, we need to do only via the dbchangelog.xml file. For instance, to create a trainig table with 3 colums, we may create a dbchangelog.xml as shown below
```
<?xml version="1.0" encoding="UTF-8"?>  
<databaseChangeLog
    xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:ext="http://www.liquibase.org/xml/ns/dbchangelog-ext"
    xmlns:pro="http://www.liquibase.org/xml/ns/pro"
    xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-latest.xsd
        http://www.liquibase.org/xml/ns/dbchangelog-ext http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-ext.xsd
        http://www.liquibase.org/xml/ns/pro http://www.liquibase.org/xml/ns/pro/liquibase-pro-latest.xsd">
        
     <changeSet  id="1"  author="Jeganathan Swaminathan">  
         <createTable  tableName="training">  
             <column  name="id"  type="int">  
                 <constraints  primaryKey="true"  nullable="false"/>  
             </column>  
             <column  name="name"  type="varchar(200)">  
                 <constraints  nullable="false"/>  
             </column>  
             <column  name="duration"  type="varchar(200)"/>  
         </createTable>  
    </changeSet>  
</databaseChangeLog>
```

In order to apply the table schema changes, you may run the below command
```
cd ~/devops-dec-2023/Day5/datical/db-ci

mvn liquibase:update
```
Expected output
<pre>
jegan@tektutor.org:~/devops-dec-2023/Day5/datical/db-ci$ mvn liquibase:update
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.tektutor:tektutor-java-app >-------------------
[INFO] Building tektutor-java-app 1.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- liquibase-maven-plugin:4.22.0:update (default-cli) @ tektutor-java-app ---
[INFO] ------------------------------------------------------------------------
[INFO] there are no resolved artifacts for the Maven project.
[INFO] there are no resolved artifacts for the Maven project.
[INFO] Parsing Liquibase Properties File
[INFO]   File: liquibase.properties
[INFO] ------------------------------------------------------------------------
[INFO] ####################################################
##   _     _             _ _                      ##
##  | |   (_)           (_) |                     ##
##  | |    _  __ _ _   _ _| |__   __ _ ___  ___   ##
##  | |   | |/ _` | | | | | '_ \ / _` / __|/ _ \  ##
##  | |___| | (_| | |_| | | |_) | (_| \__ \  __/  ##
##  \_____/_|\__, |\__,_|_|_.__/ \__,_|___/\___|  ##
##              | |                               ##
##              |_|                               ##
##                                                ## 
##  Get documentation at docs.liquibase.com       ##
##  Get certified courses at learn.liquibase.com  ## 
##                                                ##
####################################################
Starting Liquibase at 15:53:32 (version 4.22.0 #9559 built at 2023-05-10 20:45+0000)
[INFO] Parsing Liquibase Properties File liquibase.properties for changeLog parameters
[INFO] Executing on Database: jdbc:mysql://localhost:3306/tektutor
[INFO] Successfully acquired change log lock
[INFO] Creating database history table with name: DATABASECHANGELOG
[INFO] Reading from DATABASECHANGELOG
[INFO] Using deploymentId: 6306214275
[INFO] Reading from DATABASECHANGELOG
Running Changeset: dbchangelog.xml::1::Jeganathan Swaminathan
[INFO] Table training created
[INFO] ChangeSet dbchangelog.xml::1::Jeganathan Swaminathan ran successfully in 25ms
[INFO] UPDATE SUMMARY
[INFO] Run:                          1
[INFO] Previously run:               0
[INFO] Filtered out:                 0
[INFO] -------------------------------
[INFO] Total change sets:            1


UPDATE SUMMARY
Run:                          1
Previously run:               0
Filtered out:                 0
-------------------------------
Total change sets:            1

[INFO] Update summary generated
[INFO] Update command completed successfully.
Liquibase: Update has been successful.
[INFO] Successfully released change log lock
[INFO] Successfully released change log lock
[INFO] Command execution complete
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.046 s
[INFO] Finished at: 2023-06-09T15:53:34+05:30
[INFO] ------------------------------------------------------------------------
</pre>

The liquibase will grab the mysql connection details from the liquibase.properties file and connects to our tektutor database with mysql server and applies the changeset defined in the dbchangelog.xml file.

The pom.xml file points to the liquibase.properites and the liquibase.properites file points to dbchangelog.xml file. This is how, liquibase learns about these files.

You may now verify, if the changes are done in your mysql server
<pre>
jegan@tektutor:~/devops-dec-2023/Day5/datical/db-ci$ docker exec -it mysql bash
bash-4.4# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> USE tektutor;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> SHOW TABLES;
+-----------------------+
| Tables_in_tektutor    |
+-----------------------+
| DATABASECHANGELOG     |
| DATABASECHANGELOGLOCK |
| training              |
+-----------------------+
3 rows in set (0.01 sec)

mysql> DESCRIBE training;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| id       | int          | NO   | PRI | NULL    |       |
| name     | varchar(200) | NO   |     | NULL    |       |
| duration | varchar(200) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

mysql> exit
Bye
bash-4.4# exit
exit
</pre>

Assuming, you wish to add 2 more columns to the training table on tektutor database. We can update the dbchangelog.xml file as shown below
```
<?xml version="1.0" encoding="UTF-8"?>  
<databaseChangeLog
    xmlns="http://www.liquibase.org/xml/ns/dbchangelog"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:ext="http://www.liquibase.org/xml/ns/dbchangelog-ext"
    xmlns:pro="http://www.liquibase.org/xml/ns/pro"
    xsi:schemaLocation="http://www.liquibase.org/xml/ns/dbchangelog
        http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-latest.xsd
        http://www.liquibase.org/xml/ns/dbchangelog-ext http://www.liquibase.org/xml/ns/dbchangelog/dbchangelog-ext.xsd
        http://www.liquibase.org/xml/ns/pro http://www.liquibase.org/xml/ns/pro/liquibase-pro-latest.xsd">

     <changeSet  id="1"  author="Jeganathan Swaminathan">  
         <createTable  tableName="training">  
             <column  name="id"  type="int">  
                 <constraints  primaryKey="true"  nullable="false"/>  
             </column>  
             <column  name="name"  type="varchar(200)">  
                 <constraints  nullable="false"/>  
             </column>  
             <column  name="duration"  type="varchar(200)"/>  
         </createTable>  
    </changeSet>  
    <changeSet  id="2"  author="Jeganathan Swaminathan">  
         <addColumn tableName="training">  
             <column  name="from_date"  type="varchar(200)"/>  
             <column  name="to_date"  type="varchar(200)"/>  
	 </addColumn>
    </changeSet>  
</databaseChangeLog>
```

You may now update the liquibase as shown below
```
cd ~/devops-dec-2023/Day5/datical/db-ci
mvn liquibase:update
```

Expected output
<pre>
jegan@tektutor:~/devops-dec-2023/Day5/datical/db-ci$ mvn liquibase:update
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.tektutor:tektutor-java-app >-------------------
[INFO] Building tektutor-java-app 1.0
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- liquibase-maven-plugin:4.22.0:update (default-cli) @ tektutor-java-app ---
[INFO] ------------------------------------------------------------------------
[INFO] there are no resolved artifacts for the Maven project.
[INFO] there are no resolved artifacts for the Maven project.
[INFO] Parsing Liquibase Properties File
[INFO]   File: liquibase.properties
[INFO] ------------------------------------------------------------------------
[INFO] ####################################################
##   _     _             _ _                      ##
##  | |   (_)           (_) |                     ##
##  | |    _  __ _ _   _ _| |__   __ _ ___  ___   ##
##  | |   | |/ _` | | | | | '_ \ / _` / __|/ _ \  ##
##  | |___| | (_| | |_| | | |_) | (_| \__ \  __/  ##
##  \_____/_|\__, |\__,_|_|_.__/ \__,_|___/\___|  ##
##              | |                               ##
##              |_|                               ##
##                                                ## 
##  Get documentation at docs.liquibase.com       ##
##  Get certified courses at learn.liquibase.com  ## 
##                                                ##
####################################################
Starting Liquibase at 15:55:46 (version 4.22.0 #9559 built at 2023-05-10 20:45+0000)
[INFO] Parsing Liquibase Properties File liquibase.properties for changeLog parameters
[INFO] Executing on Database: jdbc:mysql://localhost:3306/tektutor
[INFO] Successfully acquired change log lock
[INFO] Reading from DATABASECHANGELOG
[INFO] Using deploymentId: 6306347311
[INFO] Reading from DATABASECHANGELOG
Running Changeset: dbchangelog.xml::2::Jeganathan Swaminathan
[INFO] Columns from_date(varchar(200)),to_date(varchar(200)) added to training
[INFO] ChangeSet dbchangelog.xml::2::Jeganathan Swaminathan ran successfully in 29ms
[INFO] UPDATE SUMMARY
[INFO] Run:                          1
[INFO] Previously run:               1
[INFO] Filtered out:                 0
[INFO] -------------------------------
[INFO] Total change sets:            2


UPDATE SUMMARY
Run:                          1
Previously run:               1
Filtered out:                 0
-------------------------------
Total change sets:            2

[INFO] Update summary generated
[INFO] Update command completed successfully.
Liquibase: Update has been successful.
[INFO] Successfully released change log lock
[INFO] Successfully released change log lock
[INFO] Command execution complete
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.912 s
[INFO] Finished at: 2023-06-09T15:55:47+05:30
[INFO] ------------------------------------------------------------------------
</pre>

You may now verify if the schema changes are applied
<pre>
jegan@tektutor:~/devops-dec-2023/Day5/datical/db-ci$ docker exec -it mysql bash
bash-4.4# mysql -u root -p
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 12
Server version: 8.0.33 MySQL Community Server - GPL

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> USE tektutor;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed
mysql> SHOW TABLES;
+-----------------------+
| Tables_in_tektutor    |
+-----------------------+
| DATABASECHANGELOG     |
| DATABASECHANGELOGLOCK |
| training              |
+-----------------------+
3 rows in set (0.01 sec)

mysql> DESCRIBE training;
+-----------+--------------+------+-----+---------+-------+
| Field     | Type         | Null | Key | Default | Extra |
+-----------+--------------+------+-----+---------+-------+
| id        | int          | NO   | PRI | NULL    |       |
| name      | varchar(200) | NO   |     | NULL    |       |
| duration  | varchar(200) | YES  |     | NULL    |       |
| from_date | varchar(200) | YES  |     | NULL    |       |
| to_date   | varchar(200) | YES  |     | NULL    |       |
+-----------+--------------+------+-----+---------+-------+
5 rows in set (0.00 sec)

mysql> exit
Bye
bash-4.4# exit
exit
</pre>

For official documentation about liquibase, you may check here
https://docs.liquibase.com/faq.html
