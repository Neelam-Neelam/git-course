package io.javabrains.movie_catalog_service.resources;

import io.javabrains.movie_catalog_service.model.CatalogItem;
import io.javabrains.movie_catalog_service.model.Movie;
import io.javabrains.movie_catalog_service.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        RestTemplate restTemplate = new RestTemplate();
        //get all rated movie ids
        List<Rating> ratings= Arrays.asList(
                new Rating("1234",4),
                new Rating("5678",3)
        );
       return  ratings.stream().map(rating-> {

                 Movie movie=restTemplate.getForObject("http://localhost:8081/movies/"+rating.getMovieId(), Movie.class);
                   assert movie != null;
                   return new CatalogItem(movie.getName(), "hello", rating.getRating());
                 })
             .collect(Collectors.toList());
        //for each movie id,call movie info service and get details

        //put them all together



    }

}
