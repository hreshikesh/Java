package com.xworkz.Aquarium;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/accessories",loadOnStartup = 1)
public class AccessoriesServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String accessoryName = servletRequest.getParameter("name");
        String accessoryType = servletRequest.getParameter("type");


        servletResponse.setContentType("text/html");
        servletResponse.getWriter().println("<html>");
        servletResponse.getWriter().println("<head>");
        servletResponse.getWriter().println("<title>Accessory Details</title>");
        servletResponse.getWriter().println("</head>");
        servletResponse.getWriter().println("<body>");
        servletResponse.getWriter().println("<h1>Accessory " + accessoryName + " Registered Successfully</h1>");
        servletResponse.getWriter().println("</body>");
        servletResponse.getWriter().println("</html>");
    }
}
