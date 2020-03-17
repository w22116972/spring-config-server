package com.example.springcloudconfigserviceredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServiceRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServiceRedisApplication.class, args);
	}

}
