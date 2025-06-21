package com.xworkz.ticket.servlet;

import com.xworkz.ticket.dto.BookingDto;
import com.xworkz.ticket.service.BookingServiceImpl;
import com.xworkz.ticket.service.BookingSevice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/booking", loadOnStartup = 1)

public class BookingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String source = req.getParameter("source");
        String destination = req.getParameter("destination");
        String date = req.getParameter("date");
        String noOfPassenger = req.getParameter("noOfPassenger");
        String coach = req.getParameter("coach");
        String idProof = req.getParameter("idProof");
        String idNo = req.getParameter("idNo");


        int passenger_age = Integer.parseInt(age);
        boolean train_coach = Boolean.parseBoolean(coach);

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
        System.out.println("Name " + bookingDto.getName() + " Age " + bookingDto.getAge() + " Source " + bookingDto.getSource() + " Destination " + bookingDto.getDestination() + " Date " + bookingDto.getDate() + " No of Passenger " + bookingDto.getNoOfPassenger() + " Coach " + bookingDto.getCoach() + " IdProof " + bookingDto.getIdProof() + " IdNo " + bookingDto.getIdNo());

        BookingSevice bookingSevice = new BookingServiceImpl();

        String result = bookingSevice.validateAndSave(bookingDto);


        if (!result.equals("Data Saved")) {
            req.setAttribute("dto", bookingDto);
            req.setAttribute("result", result);
        }


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("Booking.jsp");
        requestDispatcher.forward(req, resp);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int convertedId = Integer.parseInt(id);


        System.out.println("Converted " + convertedId);


        BookingSevice bookingService = new BookingServiceImpl();
        BookingDto bookingDto = bookingService.findById(convertedId);
        System.out.println(bookingDto);
        req.setAttribute("name","name");
        req.setAttribute("age","age");
        req.setAttribute("source","source");
        req.setAttribute("destination","destination");
        req.setAttribute("coach","coach");
        req.setAttribute("passenger","no of passenger");

        req.setAttribute("result","Result");



        if (bookingDto == null) {
            String message="data not found";
            req.setAttribute("failMessage",message);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("search.jsp");
            requestDispatcher.forward(req,resp);

        } else {
            String message="data  found";
            req.setAttribute("message",message);
            req.setAttribute("dto",bookingDto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("search.jsp");
            requestDispatcher.forward(req,resp);


        }



    }
}
