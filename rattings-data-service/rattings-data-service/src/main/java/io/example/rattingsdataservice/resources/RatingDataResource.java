package io.example.rattingsdataservice.resources;

import io.example.rattingsdataservice.model.Rating;
import io.example.rattingsdataservice.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rattingsdata")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRatting(@PathVariable("movieId")String movieId){
        return new Rating(movieId, 5); }


        @RequestMapping("user/{userId}")
        public UserRating getUserRatting(@PathVariable("userId")String userId){
            List<Rating> ratings = Arrays.asList(
                    new Rating("1234", 5),
                    new Rating("5678", 4)
            );
            UserRating userRating = new UserRating();
            userRating.setUserRating(ratings);
            return userRating;
        }
}
