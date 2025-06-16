package com.xworkz.ticket.servlet;

import com.xworkz.ticket.dto.BookingDto;
import com.xworkz.ticket.service.BookingServiceImpl;
import com.xworkz.ticket.service.BookingSevice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/booking",loadOnStartup = 1)

public class BookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        String age = req.getParameter("age");
        String source= req.getParameter("source");
        String destination = req.getParameter("destination");
        String date= req.getParameter("date");
        String noOfPassenger= req.getParameter("noOfPassenger");
        String coach=req.getParameter("coach");
        String idProof=req.getParameter("idProof");
        String idNo= req.getParameter("idNo");


        int passenger_age=Integer.parseInt(age);
        boolean train_coach=Boolean.parseBoolean(coach);

        BookingDto bookingDto = new BookingDto();
        bookingDto.setName(name);
        bookingDto.setAge(passenger_age);
        bookingDto.setSource(source);
        bookingDto.setDestination(destination);
        bookingDto.setDate(date);
        bookingDto.setNoOfPassenger(noOfPassenger);
        bookingDto.setCoach(coach);
        bookingDto.setIdProof(idProof);
        bookingDto.setIdNo(idNo);

        System.out.println("Booking Details:");
        System.out.println("Name: " + bookingDto.getName()+" Age"+bookingDto.getAge()+" Source"+bookingDto.getSource()+" Destination"+bookingDto.getDestination()+" Date"+bookingDto.getDate()+" No of Passenger"+bookingDto.getNoOfPassenger()+" Coach"+bookingDto.getCoach()+" IdProof"+bookingDto.getIdProof()+" IdNo"+bookingDto.getIdNo());

        BookingSevice bookingSevice=new BookingServiceImpl();

         bookingSevice.validateAndSave(bookingDto);



    }
}
