package com.xworkz.general.Servlet;

import com.xworkz.general.Dto.PassPortDto;
import com.xworkz.general.Service.PassPortService;
import com.xworkz.general.Service.PassPortServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/passport", loadOnStartup = 1)
public class PassPortServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String applicantName = req.getParameter("applicantName");
        String aadar = req.getParameter("aadar");
        String address=req.getParameter("address");
        String pan = req.getParameter("pan");
        String country = req.getParameter("country");
        String state = req.getParameter("state");
        String city = req.getParameter("city");
        String pincode = req.getParameter("pincode");
        String passportType = req.getParameter("passportType");
        String paymentRef = req.getParameter("paymentRef");



        long converted_aadar= Long.parseLong(aadar);
        int converted_pincode = Integer.parseInt(pincode);

        PassPortDto passPortDto = new PassPortDto(applicantName, converted_aadar, address, pan, country, state, city, converted_pincode, passportType, paymentRef);
        System.out.println("PassPortDto: " + passPortDto);

        PassPortService passPortService=new PassPortServiceImpl();
        passPortService.validateAndSave(passPortDto);






    }
}
