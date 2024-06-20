package net.javaguides.springboot_hibernate.repository;

import net.javaguides.springboot_hibernate.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
