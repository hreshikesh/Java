package com.xworkz.general.Servlet;

import com.xworkz.general.Dto.BirthDto;
import com.xworkz.general.Service.BirthServiceImpl;
import com.xworkz.general.Service.BirthService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/birth", loadOnStartup = 1)
public class BirthServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String birthId = req.getParameter("birthId");
        String datetime = req.getParameter("datetime");
        String doctorName = req.getParameter("doctorName");
        String fatherName = req.getParameter("fatherName");
        String hospital = req.getParameter("hospital");
        String hospitalType = req.getParameter("hospitalType");
        String motherName = req.getParameter("motherName");
        String nurseName = req.getParameter("nurseName");

        BirthDto birthDto = new BirthDto(birthId, datetime, doctorName, fatherName, hospital, hospitalType, motherName, nurseName);
        System.out.println("BirthDto: " + birthDto);


        BirthService service=new BirthServiceImpl();
        service.validateandsave(birthDto);

    }
}
