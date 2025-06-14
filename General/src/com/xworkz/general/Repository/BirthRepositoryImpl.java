package com.xworkz.general.Repository;


import com.xworkz.general.Dto.BirthDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BirthRepositoryImpl implements BirthRepository {


    @Override
    public void save(BirthDto birthDto) {
        System.out.println("Saving BirthDto");
        try {
//load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/general";
            String user = "root";
            String password = "hrishi@sql";
//setup connection
            Connection connection = DriverManager.getConnection(url, user, password);
//prepare statement
            String sql = "insert into birth_table values (0,'" + birthDto.getBirthId() + "','" + birthDto.getHospital() + "','" + birthDto.getFatherName() + "','" + birthDto.getMotherName() + "','" + birthDto.getDatetime() + "','" + birthDto.getDoctorName() + "','" + birthDto.getNurseName() + "','" + birthDto.getHospitalType() + "')";
            Statement statement = connection.createStatement();
            //execute
            statement.executeUpdate(sql);

            System.out.println("Connection established successfully" + connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }


}
