package com.xworkz.weather;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/weather",loadOnStartup = 1)
public class WeatherServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String location= servletRequest.getParameter("location");
        String capturedBy= servletRequest.getParameter("capture");
        String temperature= servletRequest.getParameter("temp");
        String date= servletRequest.getParameter("date");



        servletRequest.setAttribute("location", location);
        servletRequest.setAttribute("capture", capturedBy);
        servletRequest.setAttribute("temp", temperature);
        servletRequest.setAttribute("date", date);

        RequestDispatcher requestDispatcher= servletRequest.getRequestDispatcher("WeatherResult.jsp");
        requestDispatcher.forward(servletRequest, servletResponse);
    }
}
