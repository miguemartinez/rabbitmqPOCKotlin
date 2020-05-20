package com.rabbitmqamqptutorials

import com.rabbitmqamqptutorials.tut1.RabbitAmqpTutorialsRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
 class RabbitmqAmqpTutorialsApplication
{
	@Profile("usage_message")
	@Bean
	fun usage(): CommandLineRunner {
		return CommandLineRunner { args: Array<String?>? ->
			println("This app uses Spring Profiles to  control its behavior.\n")
			println("Sample usage: java -jar    rabbit-tutorials.jar  --spring.profiles.active=hello-world,sender")
		}
	}

	@Profile("!usage_message")
	@Bean
	fun tutorial(): RabbitAmqpTutorialsRunner {
		return RabbitAmqpTutorialsRunner()
	}

	companion object {
		@JvmStatic fun main(args: Array<String>) {
			runApplication<RabbitmqAmqpTutorialsApplication>(*args)
		}
	}
}
