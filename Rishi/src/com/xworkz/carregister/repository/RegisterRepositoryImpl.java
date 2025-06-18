package com.xworkz.carregister.repository;

import com.xworkz.carregister.dto.RegisterDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class RegisterRepositoryImpl implements RegisterRepositary{
    @Override
    public void save(RegisterDto registerDto) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";

            Connection connection= DriverManager.getConnection(url,user,password);


            String sql="insert into car_table values(0,'"+registerDto.getUserName()+"','"+registerDto.getPassword()+"','"+registerDto.getCarName()+"',"+registerDto.getManufacture()+",'"+registerDto.getCompany()+"','"+registerDto.getShowroom()+"','"+registerDto.getCarType()+"')";

            Statement statement=connection.createStatement();

            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
