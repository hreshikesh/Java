package com.xworkz.Aquarium;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/aquarium",loadOnStartup = 1)
public class AquariumServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String model=servletRequest.getParameter("model");
        String cost=servletRequest.getParameter("cost");
        String size=servletRequest.getParameter("size");
        String company=servletRequest.getParameter("company");
        String capacity=servletRequest.getParameter("capacity");


        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();

        writer.println("<html><body><h1 style=color:green;>"+model+"Aquarium of Capacity "+capacity+"L registered</body></html>");



    }
}
