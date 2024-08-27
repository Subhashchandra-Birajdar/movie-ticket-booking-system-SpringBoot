package com.sb.movie.converter;

import com.sb.movie.entities.Movie;
import com.sb.movie.request.MovieRequest;

public class MovieConvertor {
    
    public static Movie movieDtoToMovie(MovieRequest movieRequest) {
        Movie movie = Movie.builder()
                .movieName(movieRequest.getMovieName())
                .duration(movieRequest.getDuration())
                .genre(movieRequest.getGenre())
                .language(movieRequest.getLanguage())
                .releaseDate(movieRequest.getReleaseDate())
                .rating(movieRequest.getRating())
                .build();

        return movie;
    }
}
