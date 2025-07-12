package com.xworkz.login.servlet;

import com.xworkz.login.dto.LoginDto;
import com.xworkz.login.service.LoginService;
import com.xworkz.login.service.LoginServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/login"}, loadOnStartup = 1)

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


            String name = req.getParameter("name");
            String email = req.getParameter("email");
            String mobile = req.getParameter("mobile");
            String address = req.getParameter("address");

            long mobile_no = Long.parseLong(mobile);

            LoginDto loginDto = new LoginDto(name, email, mobile_no, address);


            LoginService loginService = new LoginServiceImpl();
            String status = loginService.validate(loginDto);
            req.setAttribute("name", name);
            req.setAttribute("email", email);
            req.setAttribute("mobile", mobile_no);
            req.setAttribute("address", address);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");


            switch (status) {
                case "null":
                    req.setAttribute("resultFail", "fail");

                    requestDispatcher.forward(req, resp);
                    break;
                case "save":
                    req.setAttribute("result", "save");
                    req.setAttribute("name", null);
                    req.setAttribute("email", null);
                    req.setAttribute("mobile", null);
                    req.setAttribute("address", null);
                    RequestDispatcher requestDispatcher1 = req.getRequestDispatcher("index.jsp");
                    requestDispatcher1.forward(req, resp);
            }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            LoginService retreiveService = new LoginServiceImpl();
            ArrayList<LoginDto> loginDtoArrayList = retreiveService.findAll();

//            loginDtoArrayList.stream().forEach(e -> System.out.println("Dtos are " + e));

            req.setAttribute("dto", loginDtoArrayList);
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("Retrieve.jsp");
            requestDispatcher.forward(req, resp);
        }






}