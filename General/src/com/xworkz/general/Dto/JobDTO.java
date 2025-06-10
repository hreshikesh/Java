package com.xworkz.general.Dto;

import java.io.Serializable;

public class JobDTO implements Serializable {
    private String name;
    private String email;
    private String education;
    private String skill;
    private String expectedSalary;
    private String experience;

    public JobDTO() {
        System.out.println("No-arg constructor called");
    }
    @Override
    public String toString() {
        return "JobDTO{" +
                "education='" + education + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", skill='" + skill + '\'' +
                ", expectedSalary='" + expectedSalary + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }

    public JobDTO(String name, String email, String education, String skill, String expectedSalary, String experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skill = skill;
        this.expectedSalary = expectedSalary;
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(String expectedSalary) {
        this.expectedSalary = expectedSalary;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


}
