package com.xworkz.carregister.repository;

import com.xworkz.carregister.dto.LoginDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginRepositoryImpl implements LoginRepository {

    @Override
    public void save(LoginDto loginDto) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/general";
            String user = "root";
            String password = "hrishi@sql";

            Connection connection = DriverManager.getConnection(url, user, password);


            String sql = "insert into login_table values(0,'" + loginDto.getUserName() + "','" + loginDto.getPassword() + "')";

            Statement statement = connection.createStatement();

            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

