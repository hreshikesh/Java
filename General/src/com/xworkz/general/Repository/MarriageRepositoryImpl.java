package com.xworkz.general.Repository;

import com.xworkz.general.Dto.MarriageDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

            String sql="insert into marriage_table values(0,'"+marriageDto.getGroomName()+"','"+marriageDto.getBrideName()+"','"+marriageDto.getAddress()+"','"+marriageDto.getReligion()+"','"+marriageDto.getMarriageDate()+"','"+marriageDto.getWitness1()+"','"+marriageDto.getWitness2()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Connection established successfully"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
