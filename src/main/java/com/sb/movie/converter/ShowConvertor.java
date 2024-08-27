package com.sb.movie.converter;

import com.sb.movie.entities.Show;
import com.sb.movie.request.ShowRequest;

public class ShowConvertor {

    public static Show showDtoToShow(ShowRequest showRequest) {
        Show show = Show.builder()
                .time(showRequest.getShowStartTime())
                .date(showRequest.getShowDate())
                .build();

        return show;
    }
}
