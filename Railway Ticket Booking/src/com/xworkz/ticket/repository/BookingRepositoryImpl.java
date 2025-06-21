package com.xworkz.ticket.repository;

import com.xworkz.ticket.dto.BookingDto;

import java.sql.*;

public class BookingRepositoryImpl implements BookingRepository {
    @Override
    public void findId(BookingDto bookingDto) {
        System.out.println("Saving Data to DB....");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/general";
            String name = "root";
            String password = "hrishi@sql";
            Connection connection = DriverManager.getConnection(url, name, password);


            String sql = "insert into ticket_booking values(0,'" + bookingDto.getName() + "'," + bookingDto.getAge() + ",'" + bookingDto.getSource() + "','" + bookingDto.getDestination() + "','" + bookingDto.getNoOfPassenger() + "','" + bookingDto.getCoach() + "','" + bookingDto.getIdProof() + "','" + bookingDto.getIdNo() + "')";

            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public BookingDto findId(int id) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/general";
            String userName = "root";
            String password = "hrishi@sql";
            Connection connection = DriverManager.getConnection(url, userName, password);


            String sql = "select * from ticket_booking where ticket_id="+id;

            Statement statement = connection.createStatement();


            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String name = resultSet.getString("passenger_name");
                int age = resultSet.getInt("passenger_age");
                String source=resultSet.getString("source");
                String destination=resultSet.getString("destination");
//                String date=resultSet.getString("date");;
                String noOfPassenger=resultSet.getString("no_of_passenger");
                String coach=resultSet.getString("coach");
                String idProof=resultSet.getString("id_proof");
                String idNo=resultSet.getString("id_no");

                BookingDto bookingDto=new BookingDto(name,age,source,destination,noOfPassenger,coach,idProof,idNo);
                return  bookingDto;
            }



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return null;

    }
}
