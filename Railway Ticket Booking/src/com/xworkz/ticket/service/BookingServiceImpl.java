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
            bookingRepository.findId(bookingDto);
            System.out.println("Saved data Successfully..");

        }
        return "data saved";

    }


    @Override
    public BookingDto findById(int id) {
        System.out.println("Running Service for finding data by id");
        if(id<=0){
            System.out.println("id less than 0  or equals to 0");
            return null;
        }
        BookingRepository bookingRepository=new BookingRepositoryImpl();
        return bookingRepository.findId(id);



    }



}
