package com.xworkz.carregister.servlet;

import com.xworkz.carregister.dto.RegisterDto;
import com.xworkz.carregister.service.SearchService;
import com.xworkz.carregister.service.SearchServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/search",loadOnStartup = 1)
public class SearchServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String carName=req.getParameter("carName");

        SearchService searchService=new SearchServiceImpl();
        RegisterDto registerDto=searchService.validate(carName);

        if(registerDto != null){
            System.out.println("yes");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("searchResult.jsp");
            req.setAttribute("resultSuccess","Results:");
            req.setAttribute("dto",registerDto);
            requestDispatcher.forward(req,resp);

        }else{
            System.out.println("no");
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("searchResult.jsp");
            req.setAttribute("result","Data not Found");
            requestDispatcher.forward(req,resp);

        }



    }
}
