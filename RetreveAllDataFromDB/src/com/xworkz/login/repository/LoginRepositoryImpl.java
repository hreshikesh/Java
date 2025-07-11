package com.xworkz.login.repository;

import com.xworkz.login.dto.LoginDto;

import java.sql.*;
import java.util.ArrayList;

public class LoginRepositoryImpl implements LoginRepository{
//save to db
    @Override
    public void save(LoginDto loginDto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";
            Connection connection=DriverManager.getConnection(url,user,password);
            String sql="insert into login value (?,?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            preparedStatement.setInt(1,0);
            preparedStatement.setString(2, loginDto.getName());
            preparedStatement.setString(3, loginDto.getEmail());
            preparedStatement.setLong(4, loginDto.getMobile());
            preparedStatement.setString(5, loginDto.getAddress());

            Timestamp timestamp=new Timestamp(System.currentTimeMillis());
            preparedStatement.setTimestamp(6,timestamp);

            preparedStatement.executeUpdate();


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }


//retreive the data
    @Override
    public ArrayList<LoginDto> retrive() {
        ArrayList<LoginDto> list = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/general";
            String user = "root";
            String password = "hrishi@sql";

            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "select * from login";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int fetchedId = resultSet.getInt("id");
                String fetchedName = resultSet.getString("name");
                String fetchedEmail = resultSet.getString("email");
                long fetchedMobile = resultSet.getLong("mobile");
                String fetchedAddress = resultSet.getString("address");
                Timestamp timestamp = resultSet.getTimestamp("recorded_at");

                LoginDto dto = new LoginDto(fetchedId, fetchedName, fetchedEmail, fetchedMobile, fetchedAddress, timestamp);
                list.add(dto);
            }

        }
        catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

        return list;
    }
}

