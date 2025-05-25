package com.xworkz.Aquarium;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/plant", loadOnStartup = 1)
public class PlantServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String plantName = servletRequest.getParameter("name");

        servletResponse.setContentType("text/html");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Plant Details</title>");
        writer.println("</head>");
        writer.println("<body>");
        writer.println("<h1>Plant " + plantName + " Registered Successfully</h1>");
        writer.println("</body>");
        writer.println("</html>");
    }
}
