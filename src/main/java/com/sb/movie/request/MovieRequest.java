package com.sb.movie.request;

import com.sb.movie.enums.Genre;
import com.sb.movie.enums.Language;
import lombok.Data;

import java.sql.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}
