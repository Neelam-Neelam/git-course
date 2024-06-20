package net.javaguides.springboot_hibernate;

import net.javaguides.springboot_hibernate.entity.Gender;
import net.javaguides.springboot_hibernate.entity.User;
import net.javaguides.springboot_hibernate.entity.UserProfile;
import net.javaguides.springboot_hibernate.repository.UserProfileRepository;
import net.javaguides.springboot_hibernate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringbootHibernateOneOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneOneMappingApplication.class, args);
	}
   @Autowired
	private UserRepository userRepository;
	@Autowired
	private UserProfileRepository profileRepository;
	@Override
	public void run(String... args) throws Exception {
		//user object
		User user = new User();
		user.setName("prasanth");
		user.setEmail("prasanth@gmail.com");

		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("pune");
		userProfile.setBirthOfDate(LocalDate.of(1997,9,24));
		userProfile.setGender(Gender.MALE);
		userProfile.setPhoneNumber("1234567899");

		user.setUserProfile(userProfile);
		userProfile.setUser(user);

		userRepository.save(user);




	}



}
