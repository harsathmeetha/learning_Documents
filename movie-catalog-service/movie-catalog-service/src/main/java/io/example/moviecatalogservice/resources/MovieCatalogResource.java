package io.example.moviecatalogservice.resources;

import io.example.moviecatalogservice.models.CatalogItem;
import io.example.moviecatalogservice.models.Movie;
import io.example.moviecatalogservice.models.Rating;
import io.example.moviecatalogservice.models.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private WebClient.Builder webClientBuilder;


    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        UserRating ratings = restTemplate.getForObject("http://localhost:8083/rattingsdata/user/" + userId, UserRating.class);
       return ratings.getUserRating().stream().map(rating -> {
          Movie movie = restTemplate.getForObject("http://localhost:8082/movies/" + rating.getMovieId(), Movie.class);
          /* Movie movie = webClientBuilder.build()
                   .get()
                   .uri("http://localhost:8082/movies/" + rating.getMovieId())
                   .retrieve()
                   .bodyToMono(Movie.class)
                   .block();

*/
           return new CatalogItem(movie.getName(), "happy", rating.getRating());
       })
                   .collect(Collectors.toList());
       }

    }
