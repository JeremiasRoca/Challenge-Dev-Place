package com.pair16.pair16;

import com.pair16.pair16.model.User;
import com.pair16.pair16.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Pair16Application {

	@Autowired
	private PasswordEncoder pe;

	public static void main(String[] args) {
		SpringApplication.run(Pair16Application.class, args);
	}

	@Bean
	protected CommandLineRunner init(final UserRepository ur){
		return args -> {
			String passwordHashed = pe.encode("1234");
			User user = new User("pepe","pepe@gmail.com",passwordHashed);
			ur.save(user);
		};
	}
}
