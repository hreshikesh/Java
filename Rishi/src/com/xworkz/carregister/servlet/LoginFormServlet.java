package com.xworkz.carregister.servlet;

import com.xworkz.carregister.dto.LoginDto;
import com.xworkz.carregister.service.LoginService;
import com.xworkz.carregister.service.LoginServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/save",loadOnStartup = 1)
public class LoginFormServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("userName");
        String password=req.getParameter("password");

        LoginDto loginDto=new LoginDto();
        loginDto.setUserName(username);
        loginDto.setPassword(password);

        LoginService loginService=new LoginServiceImpl();
       String result= loginService.validateAndSave(loginDto);
       if(result.equals("true")){
           req.setAttribute("dto",loginDto);
           RequestDispatcher requestDispatcher=req.getRequestDispatcher("loginsucess.jsp");
           requestDispatcher.forward(req,resp);

       }
       else if(result.equals("false")){

           RequestDispatcher requestDispatcher=req.getRequestDispatcher("loginfail.jsp");
           requestDispatcher.forward(req,resp);

       }




        System.out.println(loginDto);








    }
}
