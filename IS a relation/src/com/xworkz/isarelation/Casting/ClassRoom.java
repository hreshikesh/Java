package com.xworkz.isarelation.Casting;

import com.xworkz.isarelation.Internal.Person;
import com.xworkz.isarelation.Internal.Professor;

public class ClassRoom {
    public void teach(Person person){
        person.eat();
        person.sleep();
        person.walk();
        person.talk();
        person.breathe();
        if(person instanceof Professor){
            System.out.println("In Professor");
            Professor professor=(Professor) person;
            professor.letcure();
        }
    }
}
