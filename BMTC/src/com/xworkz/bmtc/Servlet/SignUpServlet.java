package com.xworkz.bmtc.Servlet;

import com.xworkz.bmtc.Dto.SignUpDto;
import com.xworkz.bmtc.Service.SignUpService;
import com.xworkz.bmtc.Service.SignupServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/submit", loadOnStartup = 1)
public class SignUpServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userID = req.getParameter("userID");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        SignUpDto signUpDto = new SignUpDto(userID, email, password, confirmPassword);

        SignUpService bmtcService = new SignupServiceImpl();
        String result = bmtcService.validate(signUpDto);

        req.setAttribute("userId", signUpDto.getUserId());
        req.setAttribute("email", signUpDto.getEmail());
        req.setAttribute("password", signUpDto.getPassword());
        req.setAttribute("confirm", signUpDto.getConfirmPassword());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignUp.jsp");

//        if(result.equals("userId invalid")){
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignUp.jsp");
//            requestDispatcher.forward(req,resp);
//            req.setAttribute("resultUserId",result);
//
//        }
//
//        else if(result.equals("email do not have @")){
//            req.setAttribute("resultEmail",result);
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignUp.jsp");
//            requestDispatcher.forward(req,resp);
//
//        }
//        else if (result.equals("password not matching")){
//            req.setAttribute("resultPassword",result);
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignUp.jsp");
//            requestDispatcher.forward(req,resp);
//        }
//
//        else if(result.equals("saved")){
//            req.setAttribute("resultSave",result);
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignUp.jsp");
//            requestDispatcher.forward(req,resp);
//        }
//        else if(result.equals("not saved")){
//            req.setAttribute("resultFail",result);
//            RequestDispatcher requestDispatcher=req.getRequestDispatcher("SignUp.jsp");
//            requestDispatcher.forward(req,resp);
//        }
//
//
//
//

        switch (result) {
            case "userId invalid":
                req.setAttribute("resultUserId", result);
                requestDispatcher.forward(req, resp);
                break;
            case "email is empty":
                req.setAttribute("resultEmail", result);
                requestDispatcher.forward(req, resp);
                break;
            case "password not matching":
                req.setAttribute("resultPassword", result);
                requestDispatcher.forward(req, resp);
                break;
            case "saved":
                req.setAttribute("userId","");
                req.setAttribute("email", "");
                req.setAttribute("password", "");
                req.setAttribute("confirm", "");
                req.setAttribute("resultSave", "Saved Successfully");
                requestDispatcher.forward(req, resp);
                break;
            case "not saved":
                req.setAttribute("resultFail", result);
                requestDispatcher.forward(req, resp);
                break;

        }
    }
}
