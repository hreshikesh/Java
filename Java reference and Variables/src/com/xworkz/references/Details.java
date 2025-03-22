package com.xworkz.references;

public class Details {
    int bithDate;
    String birthMonth;
    int birthYear;

    Details(int birthDate,String birthMonth,int birthYear){
        this.bithDate=birthDate;
        this.birthMonth=birthMonth;
        this.birthYear=birthYear;
    }

    void detailsDisplay(){
        System.out.println("Details");
        System.out.println("Birth date "+this.bithDate );
        System.out.println("Birth month "+this.birthMonth);
        System.out.println("Birth year "+this.birthYear);
    }
}
