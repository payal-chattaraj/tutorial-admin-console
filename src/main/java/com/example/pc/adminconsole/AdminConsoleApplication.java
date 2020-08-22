package com.example.pc.adminconsole;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class AdminConsoleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminConsoleApplication.class, args);
	}

}
