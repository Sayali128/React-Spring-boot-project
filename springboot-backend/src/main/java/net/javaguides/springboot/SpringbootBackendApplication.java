package net.javaguides.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.springboot.model.User;
import net.javaguides.springboot.repository.UserRepository;


@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner{

	

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
    @Autowired
    private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		this.userRepository.save(new User("Sayali", "Kad", "sayalik@gmail.com", "Associate Consultant", "Siemens"));
		this.userRepository.save(new User("Rajashree", "Kad", "Rajashree@gmail.com", "Associate Consultant", "Insurance"));
		this.userRepository.save(new User("Sumit", "Kad", "sumits@gmail.com", "Senior Consultant", "HealthCare"));

		
		
	}

	
}
