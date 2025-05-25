package com.xworkz.Aquarium;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/fishfood", loadOnStartup = 1)
public class FishFoodServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String foodName = servletRequest.getParameter("name");


        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Fish Food Details</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Fish Food " + foodName + " Registered Successfully</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
