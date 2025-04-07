package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.School;
import com.xworkz.isarelation.Internal.Student;

public class SchoolLife {
    public void stress(School school){
        school.study();
        school.exam();
        school.play();
        school.lunchBreak();
        school.teacherMeeting();
        if(school instanceof Student){
            System.out.println("in Student");
            Student student=(Student) school;
            student.homework();
        }

    }
}
