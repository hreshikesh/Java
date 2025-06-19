package com.xworkz.ticket.service;

import com.xworkz.ticket.dto.BookingDto;
import com.xworkz.ticket.repository.BookingRepository;
import com.xworkz.ticket.repository.BookingRepositoryImpl;

public class BookingServiceImpl implements BookingSevice {
    @Override
    public String validateAndSave(BookingDto bookingDto) {

        if(bookingDto!=null){
            String name=bookingDto.getName();

            if(name==null||name.length()<3||name.length()>30){

                return "Name is invalid";
            }

            System.out.println("Validating the data.....");
            BookingRepository bookingRepository=new BookingRepositoryImpl();
            bookingRepository.save(bookingDto);
            System.out.println("Saved data Successfully..");

        }
        return "data saved";

    }
}
