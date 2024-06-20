package net.javaguides.springboot_hibernate.repository;

import net.javaguides.springboot_hibernate.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
