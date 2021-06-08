package it.vashykator.spring.cloud.config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableConfigServer
//@EnableEurekaServer
class SpringCloudConfigApplication

fun main(args: Array<String>) {
	runApplication<SpringCloudConfigApplication>(*args)
}
