class NailPolishRunner 
{
    public static void main(String args[]){
        System.out.println("========================================");
        
        NailPolish np1=new NailPolish();
        np1.display();
        System.out.println("========================================");
        
        NailPolish np2=new NailPolish("Lakme");
        np2.display();
        System.out.println("========================================");
        
        NailPolish np3=new NailPolish("Lakme","Red");
        np3.display();
        System.out.println("========================================");
        
        NailPolish np4=new NailPolish("Lakme","Red",299.0f);
        np4.display();
        System.out.println("========================================");
        
        NailPolish np5=new NailPolish("Lakme","Red",299.0f,"Glitter");
        np5.display();
        System.out.println("========================================");
        
        NailPolish np6=new NailPolish("Lakme","Red",299.0f,"Glitter");
        np6.display();
        System.out.println("========================================");
        
        NailPolish np7=new NailPolish("Lakme","Red",299.0f,"Glitter",true);
        np7.display();
        System.out.println("========================================");
		
		NailPolish np8=new NailPolish("Lakme","Red",299.0f,"Glitter",true,true);
        np8.display();
        System.out.println("========================================");
    }
}
