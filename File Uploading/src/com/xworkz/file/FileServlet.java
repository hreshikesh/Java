package com.xworkz.file;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
@MultipartConfig(fileSizeThreshold = 1024*1024,maxFileSize = 1024*1024*10,maxRequestSize = 1024*1024*50)
@WebServlet(urlPatterns = "/upload",loadOnStartup = 1)
public class FileServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Part part=req.getPart("file");
        System.out.println(part);
        //getting the file name
        String fileName=part.getSubmittedFileName();
        System.out.println(fileName);
        //loading upload path
        String uploadPath="C:\\Users\\ailhr\\Downloads";
        File file=new File(uploadPath);
        System.out.println(file);
        //saved to directory
        part.write(file+File.separator+fileName);
        System.out.println("Sucessfully Saved");
        





    }
}
