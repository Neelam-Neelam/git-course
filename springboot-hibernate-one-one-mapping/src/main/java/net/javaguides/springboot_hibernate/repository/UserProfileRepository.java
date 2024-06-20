package net.javaguides.springboot_hibernate.repository;

import net.javaguides.springboot_hibernate.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}
