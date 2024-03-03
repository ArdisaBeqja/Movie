package dev.ardisa.movies;

import Review.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
private ObjectId id;
    private String a;
private String imdbId;
private String releaseDate;
private String trailerLink;
private String poster;
private List<String>genres;
private List<String>backdrops;

@DocumentReference
private List<Review> reviewsIds;
}