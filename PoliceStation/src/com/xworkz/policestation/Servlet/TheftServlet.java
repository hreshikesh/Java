package com.xworkz.policestation.Servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/theft",loadOnStartup = 1)
public class TheftServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name=servletRequest.getParameter("name");
        String age=servletRequest.getParameter("age");
        String mobile=servletRequest.getParameter("mobile");
        String address=servletRequest.getParameter("address");
        String location=servletRequest.getParameter("location");
        String lostItem=servletRequest.getParameter("lost");
        String lostOn=servletRequest.getParameter("lostOn");

        servletRequest.setAttribute("name", name);
        servletRequest.setAttribute("age", age);
        servletRequest.setAttribute("mobile", mobile);
        servletRequest.setAttribute("address", address);
        servletRequest.setAttribute("location", location);
        servletRequest.setAttribute("lostItem", lostItem);
        servletRequest.setAttribute("lostOn", lostOn);


        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("TheftResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);











    }
}
