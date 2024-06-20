package net.javaguides.springboot_hibernate;

import net.javaguides.springboot_hibernate.entity.Comment;
import net.javaguides.springboot_hibernate.entity.Post;
import net.javaguides.springboot_hibernate.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHibernateOneManyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneManyMappingApplication.class, args);
	}
  @Autowired
	private PostRepository postRepository;



	@Override
	public void run(String... args) throws Exception {

		Post post = new Post("one to many mapping using jpa and hibernate","one to many mapping using jpa and hibernate");

		Comment comment1=new Comment("very useful");
 Comment comment2=new Comment("information");
  Comment comment3=new Comment("great post");

  post.getComments().add(comment1);
  System.out.println(post.getComments().add(comment1));
		post.getComments().add(comment2);
		post.getComments().add(comment3);
		//System.out.println(this.postRepository.save(post));
		postRepository.save(post);

	}
}
