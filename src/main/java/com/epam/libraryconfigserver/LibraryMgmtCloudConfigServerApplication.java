package com.epam.libraryconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LibraryMgmtCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryMgmtCloudConfigServerApplication.class, args);
	}

}
