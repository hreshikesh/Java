package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.BookingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BookingRepositoryImpl implements BookingRepository{
    @Override
    public void save(BookingDto bookingDto) {
        System.out.println("Saving Data to DB....");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String name="root";
            String password="hrishi@sql";
            Connection connection=DriverManager.getConnection(url,name,password);



            String sql="insert into ticket_booking values(0,'"+bookingDto.getName()+"',"+bookingDto.getAge()+",'"+bookingDto.getSource()+"','"+bookingDto.getDestination()+"','"+bookingDto.getNoOfPassenger()+"','"+bookingDto.getCoach()+"','"+bookingDto.getIdProof()+"','"+bookingDto.getIdNo()+"')";

            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
