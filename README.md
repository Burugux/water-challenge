## Water-challenge API
Aggregates data from the waterpoint micro-service, third party APIs and adds a few other API level improvements such as pagination and search filters.

It's endpoints can be accessed [here](https://water-challenge.herokuapp.com/swagger-ui.html#).

## Requirements
* Java 8
* Java IDE - Eclipse or IntelliJ
* Maven

## Installation
* Install java
```console
    sudo add-apt-repository ppa:openjdk-r/ppa
    sudo apt-get update
    sudo apt-get install openjdk-8-jdk
    sudo update-alternatives --config java
    sudo update-alternatives --config javac
```
* Install maven 
    * The instructions can be found [here](https://maven.apache.org/install.html)

* Install IDE your choice

## Running the application
1. Clone via https
`https://github.com/Burugux/water-challenge.git`

2. If use are using Maven, run the application with
```console
mvn spring-boot:run
or
mvn spring-boot:run -Dspring.profiles.active=dev
```
## Generating JARs
 * Using Maven
 `mvn clean install ` or `mvn clean compile package`
 
 ## Running the JAR
 * JARs and other compiled assets can be found in the resources folder
 ```console
 java -jar target/monitor-0.0.1-SNAPSHOT.jar
 ```

## Accessing the swagger UI locally
http://localhost:8085/swagger-ui.html

## Further Help
Refer to [HELP.md](HELP.md) for getting started with spring MVC and maven.