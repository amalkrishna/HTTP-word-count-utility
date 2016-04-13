# HTTP word count utility
HTTP word count utility Developed using Java API for RESTful Web Services (JAX-RS)


  Download by cloning the [Git](https://github.com/amalkrishna/HTTP-word-count-utility) repository:

    git clone https://github.com/amalkrishna/HTTP-word-count-utility.git

###Problem Statement
When someone queries a word, output the word count as response.
 
Outside world will use the following HTTP interface to interact with you:

`/?query=<word>`
 
Response has to a valid JSON as below: 

`{"count": <count>}`


####Usage

*Import the project to IDE

*Add an external Library resteasy-jackson-provider

*Replace the input file link (mentioned in CountCalculator.java)

*Run the web service over Apache Tomcat v7.0

####Sample Text File : text.txt
      java hello java text add java project readme hello text java

####Sample Test case 
```
http://localhost:8080/CountUtility/?query=java
{"count":4}
```

```
http://localhost:8080/CountUtility/?query=JAVA
{"count":4}
```
```
http://localhost:8080/CountUtility/?query=free
{"count":0}
```

