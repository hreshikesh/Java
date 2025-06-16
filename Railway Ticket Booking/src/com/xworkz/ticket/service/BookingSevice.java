package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.BookingDto;

public interface BookingSevice {
    public String validateAndSave(BookingDto bookingDto);
}
