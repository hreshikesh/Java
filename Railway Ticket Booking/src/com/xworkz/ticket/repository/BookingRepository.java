package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.BookingDto;
import com.xworkz.ticket.service.BookingSevice;

public interface BookingRepository {
    public void save(BookingDto bookingDto);
}
