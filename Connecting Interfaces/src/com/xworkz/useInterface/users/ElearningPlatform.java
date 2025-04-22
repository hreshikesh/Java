package com.xworkz.useInterface.users;

import com.xworkz.useInterface.interfaces.CourseContent;

public class ElearningPlatform {
    private CourseContent obj;

    public ElearningPlatform(CourseContent obj) {

        this.obj = obj;
    }

    public void use() {

        if (obj != null) {
            obj.teachTopic();
        } else {
            System.err.println("CourseContent is null");
        }
    }
}