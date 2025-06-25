package com.xworkz.bmtc.Repository;

import com.xworkz.bmtc.Dto.SignUpDto;

import java.sql.*;

public class SigninRepositoryImpl implements SigninRepository{
    @Override
    public SignUpDto findCredentials(String userID, String password) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String userName="root";
            String sqlPassword="hrishi@sql";
            Connection connection= DriverManager.getConnection(url,userName,sqlPassword);

            String sql="select userId,password from signup_table where userId=? and password=?";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,userID);
            preparedStatement.setString(2,password);
            ResultSet resultSet= preparedStatement.executeQuery();
            if(resultSet.next()){

                String fetchedUser=resultSet.getString("userId");
                String fetchedPassword=resultSet.getString("password");


                return new SignUpDto(fetchedUser,null,fetchedPassword,null);


            }else return null;



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }



    }
}
