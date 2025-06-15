package com.xworkz.general.Repository;

import com.xworkz.general.Dto.JobDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JobRepositoryImpl implements JobRepository {

    @Override
    public void save(JobDTO jobDTO) {
        System.out.println("Successfully saved JobDTO");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";
            Connection connection= DriverManager.getConnection(url, user, password);

            String sql="insert into job_table values(0,'"+jobDTO.getName()+"','"+jobDTO.getEmail()+"','"+jobDTO.getEducation()+"','"+jobDTO.getExpectedSalary()+"','"+jobDTO.getExperience()+"')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

            System.out.println("Connection established successfully"+connection);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
