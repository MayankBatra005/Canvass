# Canvass Clone for Practice
Backend is developed in JAVA Springboot with Kafka


## Kafka Configuration steps for windows 

1. Download the Kafka setup from [Link](https://kafka.apache.org/downloads)
2. Extract and install the kafka server [Youtube link for Windows](https://www.youtube.com/watch?v=EUzH9khPYgs)
3. Make configuration changes in zookeeper.properties and server.properties<br>
	3.1 Server.properties change the logs folder destination<br>
	3.2 Zookeeper.properties change the data directory folder <br>
4. Now run the kafka and zookeper using command prompt <br>
	4.1 To start Zookeper command : <br>
	     .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties <br>
		 Zookeeper is started on Port 2181 <br>
	4.2 Now start Kafka in another command prompt with following command: <br>
		.\bin\windows\kafka-server-start.bat .\config\server.properties  <br>

## Springboot Kafka Implementation Steps 
In the springboot project add Dependencies 
```
		<dependency>
			<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka</artifactId>
		</dependency>

		<dependency>
            <groupId>org.springframework.kafka</groupId>
            <artifactId>spring-kafka-test</artifactId>
            <scope>test</scope>
        </dependency>
```
[Kafka Tutorial](https://www.youtube.com/watch?v=L_iu8HOus8k)
## Springboot-Kafka Configurations
	Kafka configurations can be done in two ways:
	1. Using application.properties 
	2. Via Code using @Configuration Annotation 

## Springboot Producer 
	1. Create a service annotation 
	2. Create a final string topic 
	3. Now we need a kafka Template instance 
	4. Now use this kafka template to send the message 

## Springboot Consumer
	1. Create a service annotation 
	2. Implement the @KafkaListener
	3. Capture the message inside this listener (It can be a string, any object,
	I have implemented an assignment)