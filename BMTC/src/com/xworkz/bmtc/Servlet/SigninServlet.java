package com.xworkz.bmtc.Servlet;

import com.xworkz.bmtc.Service.SiginServiceImpl;
import com.xworkz.bmtc.Service.SigninService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signin", loadOnStartup = 1)
public class SigninServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId = req.getParameter("userID");
        String password = req.getParameter("password");

        SigninService signinService=new SiginServiceImpl();
        String result=signinService.findCredentials(userId,password);
        req.setAttribute("userId",userId);
        req.setAttribute("password",password);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("home.jsp");
        RequestDispatcher requestDispatcher1=req.getRequestDispatcher("Signin.jsp");


        switch (result){
            case "valid credentials":
                requestDispatcher.forward(req,resp);

                break;
            case "Credentials not found":
                req.setAttribute("resultNotFound",result);
                requestDispatcher1.forward(req,resp);
                break;
        }






    }
}
