package com.xworkz.general.Servlet;

import com.xworkz.general.Dto.DrivingDto;
import com.xworkz.general.Service.DrivingService;
import com.xworkz.general.Service.DrivingServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/driving",loadOnStartup = 1)
public class DrivingServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String applicantName = req.getParameter("applicantName");
        String address = req.getParameter("address");
        String mobile = req.getParameter("mobile");
        String appliedDate = req.getParameter("appliedDate");
        String vehicleType = req.getParameter("vehicleType");


        DrivingDto drivingDto = new DrivingDto(address, applicantName, appliedDate, mobile, vehicleType);
        System.out.println("Received DrivingDto: " + drivingDto);


        DrivingService drivingService=new DrivingServiceImpl();
        drivingService.validateAndSave(drivingDto);


    }
}
