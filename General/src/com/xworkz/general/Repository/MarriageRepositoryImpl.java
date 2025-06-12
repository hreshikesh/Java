package com.xworkz.general.Repository;

import com.xworkz.general.Dto.MarriageDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MarriageRepositoryImpl implements MarriageRepository {

    @Override
    public void save(MarriageDto marriageDto) {
        System.out.println("MarriageDto saved: " + marriageDto);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";
            Connection connection= DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
