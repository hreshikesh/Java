package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.BookingDto;

public interface BookingRepository {
    public void findId(BookingDto bookingDto);

    public BookingDto findId(int id);
}
