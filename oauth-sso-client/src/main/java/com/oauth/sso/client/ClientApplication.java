package com.oauth.sso.client;

import com.oauth.sso.client.domain.User;
import com.oauth.sso.client.service.UserRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class ClientApplication {

	private static final Logger log = LoggerFactory.getLogger(ClientApplication.class);

	@Value("${systemName}")
	private String systemName;

	@Value("${server.port}")
	private int serverPort;

	@Bean
	public CommandLineRunner initUser(UserRepository repository) {
		//
		return (args) -> {
			//
			log.debug("\n## systemName : {}", systemName);
			log.debug("\n## systemPort : {}", serverPort);

			repository.save(createUser("tsong"));
			repository.save(createUser("jmpark"));
			repository.save(createUser("jkkang"));

			for (User user : repository.findAll()) {
				log.debug("\n## found user : {}", user);
			}
			User user = repository.findOne("jmpark");
			log.debug("\n## user : {}", user);
		};
	}

	private User createUser(String userName) {
		//
		return new User(userName, getRandomAge(), String.format("%s in %s", userName, systemName));
	}

	private int getRandomAge() {
		//
		return 20 + new Random().nextInt(30);
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
