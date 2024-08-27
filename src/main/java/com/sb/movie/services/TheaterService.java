package com.sb.movie.services;

import com.sb.movie.exceptions.TheaterIsExist;
import com.sb.movie.exceptions.TheaterIsNotExist;
import com.sb.movie.request.TheaterRequest;
import com.sb.movie.request.TheaterSeatRequest;

public interface TheaterService {

    String addTheater(TheaterRequest theaterRequest) throws TheaterIsExist;

    String addTheaterSeat(TheaterSeatRequest entryDto) throws TheaterIsNotExist;
}
