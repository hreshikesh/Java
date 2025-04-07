package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Employee;
import com.xworkz.isarelation.Internal.Manager;

public class Office {
    public void hireManager(Employee employee){
        employee.work();
        employee.attendMeeting();
        employee.takeBreak();
        employee.submitReport();
        employee.getSalary();
        if(employee instanceof Manager){
            System.out.println("In manager");
            Manager manager=(Manager) employee;
            manager.fire();
        }
    }
}
