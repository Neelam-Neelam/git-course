package net.javaguides.springboot_hibernate.repository;

import net.javaguides.springboot_hibernate.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
