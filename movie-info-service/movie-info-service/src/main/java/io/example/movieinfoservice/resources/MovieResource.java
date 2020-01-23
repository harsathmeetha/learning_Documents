package io.example.movieinfoservice.resources;


import io.example.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    @RequestMapping("/{movieId}")
    public Movie getmovieInfo(@PathVariable("movieId") String movieId){
return new Movie(movieId, "singam");

    }
}
