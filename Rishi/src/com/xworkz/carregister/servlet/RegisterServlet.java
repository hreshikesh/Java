package com.xworkz.carregister.servlet;

import com.xworkz.carregister.dto.RegisterDto;
import com.xworkz.carregister.service.RegisterService;
import com.xworkz.carregister.service.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/submit",loadOnStartup = 1)
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName=req.getParameter("userName");
        String carName=req.getParameter("name");
        String manufacture=req.getParameter("manufacture");
        String company=req.getParameter("company");
        String carType=req.getParameter("carType");
        String showroom=req.getParameter("showroom");
        String password=req.getParameter("password");
        String confirm=req.getParameter("conform");

        int manufactureYear=Integer.parseInt(manufacture);



        System.out.println("Car Name "+carName+" manufacture "+manufacture+" company "+company+" car Type "+carType+" showroom "+showroom);


        RegisterDto registerDto=new RegisterDto();
        registerDto.setCarName(carName);
        registerDto.setManufacture(manufactureYear);
        registerDto.setCompany(company);
        registerDto.setCarType(carType);
        registerDto.setShowroom(showroom);
        registerDto.setUserName(userName);
        registerDto.setPassword(password);
        registerDto.setConform(confirm);



        System.out.println(registerDto);


        RegisterService registerService=new RegisterServiceImpl();
        String result=registerService.validateAndSave(registerDto);

        if(result.equals("true")){

            req.setAttribute("dto",registerDto);
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("result.jsp");
            requestDispatcher.forward(req,resp);

        }else System.err.println("Error in validating and saving data");







    }
}
