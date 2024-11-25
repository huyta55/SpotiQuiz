package com.huyta55.spotiquiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.huyta55.spotiquiz.orchestration.entity.mapper.PlayerEntityMapper;
import com.huyta55.spotiquiz.jpa.entity.repository.PlayerRepository;


@SpringBootApplication
public class SpotiquizApplication {

	@Autowired
	PlayerEntityMapper playerEntityMapper;

	@Autowired
	PlayerRepository playerRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpotiquizApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return runner -> {
			runPlayer();
		};
	}

	private void runPlayer() {

		String username = "huyta1";
	}
}
