package com.xworkz.classasparameter.IdCard;

public class College {


    public void wear(IdCard idCard){
        if(idCard!=null){
            System.out.println("The material is "+idCard.getMaterial());
        }else System.err.println("Pointing to null");
    }

    public void remove(IdCard[] idCards){
        if(idCards!=null) {
            for (IdCard idCard : idCards) {
                System.out.println("The weight of id is " + idCard.getWeight());
            }
        }
    }

    public void print(){
        IdCard idCard=new IdCard();
        String [] colors={"Red","yellow","white"};
        idCard.setColors(colors);
        for(String color: idCard.getColor())
            System.out.println("The colors of the idcard is "+color);

    }

    public void destroy(){
        IdCard idCard1=new IdCard();
        idCard1.setDesignedBy("Praksh");
        IdCard idCard2=new IdCard();
        idCard2.setDesignedBy("Preetham");
        IdCard [] idCards={idCard1,idCard2};
        for(IdCard idCard:idCards){
            System.out.println("The designer "+idCard.getDesignedBy());
        }
    }
}
