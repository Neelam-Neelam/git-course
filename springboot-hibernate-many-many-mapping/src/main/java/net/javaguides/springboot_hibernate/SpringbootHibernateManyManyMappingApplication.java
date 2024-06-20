package net.javaguides.springboot_hibernate;

import net.javaguides.springboot_hibernate.entity.Post;
import net.javaguides.springboot_hibernate.entity.Tag;
import net.javaguides.springboot_hibernate.repository.PostRepository;
import net.javaguides.springboot_hibernate.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateManyManyMappingApplication implements CommandLineRunner {
    @Autowired
	private PostRepository postRepository;
	@Autowired
	private TagRepository tagRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateManyManyMappingApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
         Post post = new Post("Hibernate many tomany mapping example","Hibernate many tomany mapping example","Hibernate many tomany mapping example");
		Post post1 = new Post("Hibernate many tomany mapping example post1","Hibernate many tomany mapping example post1","Hibernate many tomany mapping example post1");

		Tag tag = new Tag("spring boot");
		Tag tag2 = new Tag("Hibernate");
// add tag reference post
		post.getTags().add(tag);
		post.getTags().add(tag2);
		post1.getTags().add(tag);
		//add post reference tag
		tag.getPosts().add(post);
		tag2.getPosts().add(post);
		tag.getPosts().add(post1);

		this.postRepository.save(post);
		this.postRepository.save(post1);
	}
}
