package com.xworkz.general.Repository;

import com.xworkz.general.Dto.PassPortDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PassportRepositoryImpl implements PassportRepository {

    @Override
    public void save(PassPortDto passPortDto) {
        System.out.println("Saving passport details: " + passPortDto);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/general";
            String user="root";
            String password="hrishi@sql";
            Connection connection= DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully"+connection);

            String sql = "INSERT INTO passport_table VALUES (0, '" + passPortDto.getApplicantName() + "', " + passPortDto.getAadar() + ", '" + passPortDto.getAddress() + "', '" + passPortDto.getPan() + "', '" + passPortDto.getCountry() + "', '" + passPortDto.getState() + "', '" + passPortDto.getCity() + "', " + passPortDto.getPincode() + ", '" + passPortDto.getPassportType() + "', '" + passPortDto.getPaymentRef() + "')";
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
