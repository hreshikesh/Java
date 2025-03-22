package com.xworkz.references;

public class Experience {

    ExperienceDetail experienceDetails;
    Experience(ExperienceDetail experienceDetails){
        this.experienceDetails=experienceDetails;
    }



    void experienceDisplay(){
        System.out.println("Experience details");

            if(this.experienceDetails!=null){
                this.experienceDetails.expDisplay();
            }
            else System.err.println("Pointing to null");


    }
}
