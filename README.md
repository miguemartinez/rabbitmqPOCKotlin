#Rabbit POC 

#####with some kotlin on the main to improve my concepts of this language  


I've created this repository in order to fool around with these concepts most of the explaning is here

https://www.rabbitmq.com/tutorials/tutorial-one-spring-amqp.html

As key concepts of this is that Chocolatey does not install Rabbit MQ variables as well in Win10 , so consider that 

Easy Path right here is have a compose with RAbbitMQ like this project does

Download , build , then hit this in console to send the messages to the pipe


`java -jar rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,sender`

Hit this to activate the profile of the receiver

`java -jar rabbitmq-amqp-tutorials-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver`

That's it then , Cheerio


 
