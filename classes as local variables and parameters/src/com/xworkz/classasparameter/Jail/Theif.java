package com.xworkz.classasparameter.Jail;

public class Theif {


    private Jail jail;
    public Theif(Jail jail){
        this.jail=jail;
    }

    public void theifJailName() {
        System.out.println("Jail Name"+this.jail.getName());
    }

    public void  theifJailLocation(){
        Jail jail1=new Jail();
        jail1.setLocation("jamaica");
        Jail jail2=new Jail();
        jail2.setLocation("Africa");
        Jail[] jails={jail1,jail2};
        if(jails!=null) {
            for (Jail jail : jails) {
                System.out.println("Jail location " + jail.getLocation());
            }
        }
    }

    //class as parameter
    public void noOfCells(Jail jail){
        System.out.println("Total no of jail "+jail.getTotalCells());
    }

    public void jailer(Jail[] jails){
        for(Jail jail:jails){
            System.out.println("Jailer name "+jail.getJailerName());
        }

    }
}
