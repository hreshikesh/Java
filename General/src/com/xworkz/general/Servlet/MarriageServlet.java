package com.xworkz.general.Servlet;

import com.xworkz.general.Dto.MarriageDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/marriage",loadOnStartup = 1)
public class MarriageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String groomName = req.getParameter("groomName");
        String brideName = req.getParameter("brideName");
        String address = req.getParameter("address");
        String religion = req.getParameter("religion");
        String marriageDate = req.getParameter("marriageDate");
        String witness1 = req.getParameter("witness1");
        String witness2 = req.getParameter("witness2");

        MarriageDto marriageDto = new MarriageDto(address, brideName, groomName, marriageDate, religion, witness1, witness2);

        System.out.println("Marriage details received: " + marriageDto);






    }
}
