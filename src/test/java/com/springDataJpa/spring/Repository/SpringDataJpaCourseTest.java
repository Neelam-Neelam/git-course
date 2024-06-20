package com.springDataJpa.spring.Repository;

import com.springDataJpa.spring.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringDataJpaCourseTest {

    @Autowired
    private SpringDataJpaCourse springDataJpaCourse;

    @Test
    void saveMethod(){
        //create product
        Product product=new Product();
        product.setName("product 1");
        product.setDescription("product description");
        product.setPrice(new BigDecimal("100.00"));
        product.setSku("100ABC");
        product.setActive(true);
        product.setImageUrl("product1.jpg");
        //save product
        Product saveProduct=springDataJpaCourse.save(product);
        //display product info
        System.out.println(saveProduct.getId());
        System.out.println(saveProduct.toString());
    }

    @Test
    void updateUsingSaveMethod() {
//find or retrieve an entity by id
        Long id = 1L;
        Product product = springDataJpaCourse.findById(id).get();
        //update entity information
        product.setName("updated product name");
        product.setDescription("updated product description");
        product.setPrice(new BigDecimal("100.00"));
        product.setSku("100ABC");
        product.setActive(true);
        product.setImageUrl("updated product image url");

        //save updated entity
        Product updateProduct = springDataJpaCourse.save(product);
        System.out.println(updateProduct.getId());
        System.out.println(updateProduct.toString());

    }
       @Test
       void findByIdMethod(){
        Long Id=1L;
        Product product=springDataJpaCourse.findById(Id).get();

    }

    @Test
    void saveAllMethod(){
         Product product2=new Product();
         product2.setName("product 2");
         product2.setDescription("product 2 description");
         product2.setPrice(new BigDecimal("100.00"));
         product2.setSku("100ABCD");
         product2.setActive(true);
         product2.setImageUrl("product2.jpg");
        Product product3=new Product();
        product3.setName("product 3");
        product3.setDescription("product 3 description");
        product3.setPrice(new BigDecimal("100.00"));
        product3.setSku("100ABCDE");
        product3.setActive(true);
        product3.setImageUrl("product3.jpg");
        springDataJpaCourse.saveAll(List.of(product2,product3));

    }
   @Test
    void findAllMethod() {
       List<Product> productList = springDataJpaCourse.findAll();
productList.forEach((p)-> {
    System.out.println(p.getName());
});

   }
   @Test
   void deleteMethod(){
        Long id = 1L;
        springDataJpaCourse.deleteById(id);
   }
@Test
   void deleteAllMethod(){
        //find an entity by id
       Long id=2L;
      Product product= springDataJpaCourse.findById(id).get();
       //delete entity
       springDataJpaCourse.delete(product);
   }



}