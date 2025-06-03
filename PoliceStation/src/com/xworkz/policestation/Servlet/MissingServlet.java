package com.xworkz.policestation.Servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/missing", loadOnStartup = 1)
public class MissingServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String name= servletRequest.getParameter("name");
        String age= servletRequest.getParameter("age");
        String gender= servletRequest.getParameter("gender");
        String mobile= servletRequest.getParameter("mobile");
        String address= servletRequest.getParameter("address");
        String location= servletRequest.getParameter("location");
        String bodyMark= servletRequest.getParameter("mark");
        String language= servletRequest.getParameter("language");


        servletRequest.setAttribute("name", name);
        servletRequest.setAttribute("age", age);
        servletRequest.setAttribute("gender",gender);
        servletRequest.setAttribute("mobile", mobile);
        servletRequest.setAttribute("address", address);
        servletRequest.setAttribute("location", location);
        servletRequest.setAttribute("bodyMark", bodyMark);
        servletRequest.setAttribute("language", language);


        RequestDispatcher requestDispatcher = servletRequest.getRequestDispatcher("MissingResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
