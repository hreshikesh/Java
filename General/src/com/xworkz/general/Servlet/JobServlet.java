package com.xworkz.general.Servlet;

import com.xworkz.general.Dto.JobDTO;
import com.xworkz.general.Service.JobService;
import com.xworkz.general.Service.JobServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/job",loadOnStartup = 1)
public class JobServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name= req.getParameter("name");
        String email= req.getParameter("email");
        String education= req.getParameter("education");
        String skill= req.getParameter("skill");
        String expectedSalary= req.getParameter("expectedSalary");
        String experience= req.getParameter("experience");


        JobDTO jobDTO=new JobDTO();
        jobDTO.setName(name);
        jobDTO.setEmail(email);
        jobDTO.setEducation(education);
        jobDTO.setSkill(skill);
        jobDTO.setExpectedSalary(expectedSalary);
        jobDTO.setExperience(experience);
        System.out.println("JobDTO: " + jobDTO);


        JobService jobService=new JobServiceImpl();
        jobService.validateAndSave(jobDTO);








    }
}
