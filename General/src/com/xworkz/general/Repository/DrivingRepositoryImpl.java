package com.xworkz.general.Repository;

import com.xworkz.general.Dto.DrivingDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DrivingRepositoryImpl implements DrivingRepository{
    @Override
    public void save(DrivingDto drivingDto) {
        System.out.println("Saving DrivingDto");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";
            Connection connection= DriverManager.getConnection(url, user, password);

            String sql="insert into driving_table values(0,'"+drivingDto.getApplicantName()+"','"+drivingDto.getAddress()+"','"+drivingDto.getMobile()+"','"+drivingDto.getAppliedDate()+"','"+drivingDto.getVehicleType()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Connection established successfully"+connection);


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }



}
