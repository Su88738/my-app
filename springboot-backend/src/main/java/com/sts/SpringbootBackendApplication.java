package com.sts;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sts.model.User;
import com.sts.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception{
		this.userRepository.save(new User("SUMIT","KUMAR","SUMIT.KUMAR@ATOS.NET"));
		this.userRepository.save(new User("SUJIT","KUMAR","SUJIT.KUMAR@ATOS.NET"));
		this.userRepository.save(new User("AMIT","KUMAR","AMIT.KUMAR@ATOS.NET"));
		this.userRepository.save(new User("AMAR","KUMAR","AMAR.KUMAR@ATOS.NET"));
	}

}
