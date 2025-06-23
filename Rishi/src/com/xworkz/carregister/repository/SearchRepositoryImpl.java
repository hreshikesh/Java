package com.xworkz.carregister.repository;

import com.xworkz.carregister.dto.RegisterDto;

import java.sql.*;

public class SearchRepositoryImpl implements SearchRepositoey{


    @Override
    public RegisterDto find(String name) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";
            Connection connection= DriverManager.getConnection(url,user,password);

            String sql="select * from car_table where carname='"+name+"'";
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery(sql);

           while (resultSet.next()){
               String carName=resultSet.getString("carname");
               String userName=resultSet.getString("userName");
               String company=resultSet.getString("car_company");
               String carType=resultSet.getString("car_type");


               RegisterDto registerDto=new RegisterDto();
               registerDto.setCarName(carName);
               registerDto.setUserName(userName);
               registerDto.setCompany(company);
               registerDto.setCarType(carType);

               return registerDto;

           }



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return null;

    }
}
