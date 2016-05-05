# HTTP word count utility
HTTP word count utility Developed using Embedded Jetty and Jersey


  Download by cloning the [Git](https://github.com/amalkrishna/HTTP-word-count-utility) repository:

    git clone https://github.com/amalkrishna/HTTP-word-count-utility.git

###Problem Statement
When someone queries a word, output the word count as response.
 
Outside world will use the following HTTP interface to interact with you:

`/?query=<word>`
 
Response has to a valid JSON as below: 

`{"count": <count>}`


####Usage

Extract the file `HTTP-word-count-utility-master.zip`

```
cd HTTP-word-count-utility-master
mvn clean install
cd target
java -jar CountUtility-1.0-SNAPSHOT.jar
```

####Sample Text File : (D://Java/test.txt)
      java hello java text add java project readme hello text java

####Sample Test case 
```
http://localhost:8080/?query=java
{"count":4}
```

```
http://localhost:8080/?query=JAVA
{"count":4}
```
```
http://localhost:8080/?query=free
{"count":0}
```
