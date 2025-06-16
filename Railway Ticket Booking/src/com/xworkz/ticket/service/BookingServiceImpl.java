package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.BookingDto;
import com.xworkz.ticket.repository.BookingRepository;
import com.xworkz.ticket.repository.BookingRepositoryImpl;

public class BookingServiceImpl implements BookingSevice {
    @Override
    public String validateAndSave(BookingDto bookingDto) {

        if(bookingDto!=null){
            System.out.println("Validating the data.....");
            BookingRepository bookingRepository=new BookingRepositoryImpl();
            bookingRepository.save(bookingDto);
            System.out.println("Saved data Successfully..");
            return "true";

        }
        return "fail";
    }
}
