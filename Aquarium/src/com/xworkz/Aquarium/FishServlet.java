package com.xworkz.Aquarium;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/fish",loadOnStartup = 1)
public class FishServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String fishName=servletRequest.getParameter("name");
        String fishColor=servletRequest.getParameter("color");
        String fishLifeSpan=servletRequest.getParameter("lifeSpan");
        String fishCost=servletRequest.getParameter("cost");
        String fishType=servletRequest.getParameter("type");
        String fishSize=servletRequest.getParameter("size");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Fish Details</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Fish " + fishName + "Registered Sucessfully</h1>");
        writer.println("</body>");
        writer.println("</html>");


    }
}
