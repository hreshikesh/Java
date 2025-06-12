package com.xworkz.general.Servlet;

import com.xworkz.general.Dto.DeathDto;
import com.xworkz.general.Service.DeathService;
import com.xworkz.general.Service.DeathServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/death",loadOnStartup = 1)
public class DeathServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String cause = req.getParameter("cause");
        String dateTime = req.getParameter("dateTime");
        String age = req.getParameter("age");
        String certified = req.getParameter("certified");
        String hospitalName = req.getParameter("hospitalName");
        String mannerofdeath = req.getParameter("mannerofdeath");

        DeathDto deathDto = new DeathDto(name, cause, dateTime, age, certified, hospitalName, mannerofdeath);
        System.out.println("DeathDto: " + deathDto);


        DeathService deathService= new DeathServiceImpl();
        deathService.validateAndSave(deathDto);


    }
}
