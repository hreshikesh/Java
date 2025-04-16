package com.xworkz.Interface.External.Implementation2;

import com.xworkz.Interface.Internal.Rules.*;


public class PUCollege implements CollegeRule, Book, ExamRule, SecurityRules, Printer {


    @Override
    public void readBook() {
        System.out.println("PUCollege readBook is important");
    }

    @Override
    public void writeBook() {
        System.out.println("PUCollege writeBook is important");

    }

    @Override
    public void publishBook() {
        System.out.println("PUCollege publishBook is important");

    }

    @Override
    public void maintainDiscipline() {
        System.out.println("PUCollege maintainDiscipline is important");

    }

    @Override
    public void respectFaculty() {
        System.out.println("PUCollege respectFaculty is important");

    }

    @Override
    public void participateInActivities() {
        System.out.println("PUCollege participateInActivities is important");

    }

    @Override
    public void examAuthority() {
        System.out.println("PUCollege examAuthority is important");

    }

    @Override
    public void examSyllabus() {
        System.out.println("PUCollege examSyllabus is important");

    }

    @Override
    public void examPattern() {
        System.out.println("PUCollege examPattern is important");

    }

    @Override
    public void print() {
        System.out.println("PUCollege print is important");

    }

    @Override
    public void scan() {
        System.out.println("PUCollege scan is important");

    }

    @Override
    public void copy() {
        System.out.println("PUCollege copy is important");

    }

    @Override
    public void lockDoors() {
        System.out.println("PUCollege lockDoors is important");

    }

    @Override
    public void setAlarm() {
        System.out.println("PUCollege setAlarm is important");

    }

    @Override
    public void checkWindows() {
        System.out.println("PUCollege checkWindows is important");

    }
}
