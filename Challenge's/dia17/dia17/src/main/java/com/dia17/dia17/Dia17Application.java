package com.dia17.dia17;

import com.dia17.dia17.model.User;
import com.dia17.dia17.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class Dia17Application {

	@Autowired
	private PasswordEncoder pe;

	public static void main(String[] args) {
		SpringApplication.run(Dia17Application.class, args);
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
