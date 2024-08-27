package com.sb.movie.services;

import com.sb.movie.exceptions.ShowDoesNotExists;
import com.sb.movie.request.ShowRequest;
import com.sb.movie.request.ShowSeatRequest;

public interface ShowService {

    String addShow(ShowRequest showRequest);

    String associateShowSeats(ShowSeatRequest showSeatRequest) throws ShowDoesNotExists;
}
