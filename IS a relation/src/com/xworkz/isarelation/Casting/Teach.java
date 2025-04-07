package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.MathTeacher;
import com.xworkz.isarelation.Internal.Teacher;

public class Teach {
    public void appoint(Teacher teacher){
        teacher.teach();
        teacher.evaluate();
        teacher.assignHomework();
        teacher.conductExam();
        teacher.guideStudents();
        if(teacher instanceof MathTeacher){
            System.out.println("In MathTeacher");
            MathTeacher mathTeacher=(MathTeacher) teacher;
            mathTeacher.punish();
        }
    }
}
