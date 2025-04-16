package com.xworkz.Interface.External.Implementation1;

import com.xworkz.Interface.Internal.Rules.CollegeRule;
import com.xworkz.Interface.Internal.Rules.JavaRules;

public class CollegeStudent implements JavaRules, CollegeRule {

    @Override
    public void maintainDiscipline() {
        System.out.println("CollegeStudent maintainDiscipline is important");
    }

    @Override
    public void respectFaculty() {
        System.out.println("CollegeStudent respectFaculty is important");

    }

    @Override
    public void participateInActivities() {
        System.out.println("CollegeStudent participateInActivities is important");

    }

    @Override
    public void capital() {
        System.out.println("CollegeStudent capital is important");

    }

    @Override
    public void objectName() {
        System.out.println("CollegeStudent objectName is important");

    }

    @Override
    public void indentation() {
        System.out.println("CollegeStudent indentation is important");

    }
}
