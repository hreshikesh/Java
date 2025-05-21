package com.xworkz.actor;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/actor", loadOnStartup = 1)
public class ActorServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        String name = servletRequest.getParameter("name");
        String lang = servletRequest.getParameter("lang");
        String salary = servletRequest.getParameter("salary");
        String blockbuster = servletRequest.getParameter("blockbuster");
        String flops = servletRequest.getParameter("flops");
        String upcomingmovie = servletRequest.getParameter("upcomingmovie");
        String upcomingmovieproducer = servletRequest.getParameter("upcomingmovieproducer");
        String upcomingmoviedirector = servletRequest.getParameter("upcomingmoviedirector");
        String upcomingmoviebudget = servletRequest.getParameter("upcomingmoviebudget");

        int actorSalary = Integer.parseInt(salary);
        int actorFlops = Integer.parseInt(flops);
        int blockbusterCount = Integer.parseInt(blockbuster);
        int upcomingMovieBudget = Integer.parseInt(upcomingmoviebudget);

        System.out.println("Actor Name " + name + " Movie Langauage " + lang + " Actor Salary " + actorSalary + " Actor Blockbuster " + blockbusterCount + " Actor Flops " + actorFlops + " Upcoming Movie " + upcomingmovie + " Upcoming Movie Producer " + upcomingmovieproducer + " Upcoming Movie Director " + upcomingmoviedirector + " Upcoming Movie Budget " + upcomingMovieBudget);

        PrintWriter writer=servletResponse.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1 style=color:green;>Actor" + name + " SucessFully Registered</h1>");
        writer.println("</body>");
        writer.println("</html>");

    }
}
