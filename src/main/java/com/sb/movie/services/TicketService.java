package com.sb.movie.services;

import com.sb.movie.request.TicketRequest;
import com.sb.movie.response.TicketResponse;

public interface TicketService {

    TicketResponse ticketBooking(TicketRequest ticketRequest);

}
