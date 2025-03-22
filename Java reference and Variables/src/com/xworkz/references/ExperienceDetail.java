package com.xworkz.references;

public class ExperienceDetail {
     Company company;
     int expYear;
     String expPosition;
     Education[] education;
     House house;

     ExperienceDetail(Company company, String expPosition, int expYear, Education[] education,House house){
         this.company=company;
         this.expPosition=expPosition;
         this.expYear=expYear;
         this.education=education;
         this.house=house;
     }
     void expDisplay(){
         if(this.company!=null){
             this.company.companyDisplay();
         }else System.err.println("Pointing to null");
         System.out.println("Experience Poistion "+this.expPosition);
         System.out.println("Experience year "+this.expYear);
         System.out.println("Education details ");
         for(Education ref:education){
             if(ref!=null){
                 ref.educationDisplay();
             }else System.err.println("Pointing to null");
         }
         if(house!=null){
             house.houseDisplay();
         }else System.err.println("Pointing to null");




     }
}
