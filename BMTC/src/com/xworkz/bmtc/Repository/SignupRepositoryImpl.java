package com.xworkz.bmtc.Repository;

import com.xworkz.bmtc.Dto.SignUpDto;

import java.sql.*;

public class SignupRepositoryImpl implements SignupRepository {
    @Override
    public void save(SignUpDto signUpDto) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String userName="root";
            String password="hrishi@sql";
            Connection connection= DriverManager.getConnection(url,userName,password);

            String sql="insert into signup_table (signup_id,userId,email,password,created_at) values(?,?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2, signUpDto.getUserId());
            preparedStatement.setString(3,signUpDto.getEmail());
            preparedStatement.setString(4,signUpDto.getPassword());

            Timestamp timestamp=new Timestamp(System.currentTimeMillis());
            preparedStatement.setTimestamp(5,timestamp);

            preparedStatement.execute();


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
