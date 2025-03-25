package com.xworkz.classasparameter.Satellite;

public class Orbit {


    public void land(Satellite satellite){
        satellite.setLoadcapacity(1070);
        if(satellite.getLoadcapacity()!=0){

            System.out.println("The load capacity "+satellite.getLoadcapacity());
        }else System.err.println("pointing to 0");
    }

    public void revolve(Satellite[] satellites){
       if(satellites!=null) {
           for (Satellite satellite:satellites){
               System.out.println("Satellites weights "+satellite.getWeight());
           }
       }else System.err.println("pointing to null");
    }

    public void launch(){
        Satellite satellite=new Satellite();
        SatelliteType stype=SatelliteType.Bhaskara;
        satellite.setType(stype);
        System.out.println("Type of Satellite "+satellite.getType());
    }

    public void blast(){
        Satellite satellite1=new Satellite();
        satellite1.setCost(1000000);
        Satellite satellite2=new Satellite();
        satellite2.setCost(2000000);

        Satellite[] satellites={satellite1,satellite2};
        if(satellites!=null) {
            for (Satellite satellite : satellites) {
                System.out.println("Cost of satellite"+satellite.getCost());
            }
        }else System.err.println("pointing to null");

    }


}
