class GunRunner{
    public static void main(String args[]){
        System.out.println("========================================");
        
        Gun g1=new Gun();
        g1.display();
        System.out.println("========================================");
        
        Gun g2=new Gun("AK-47");
        g2.display();
        System.out.println("========================================");
        
        Gun g3=new Gun("AK-47",700f);
        g3.display();
        System.out.println("========================================");
        
        Gun g4=new Gun("AK-47",700f,"Rifle");
        g4.display();
        System.out.println("========================================");
        
        Gun g5=new Gun("AK-47",700f,"Rifle",215);
        g5.display();
        System.out.println("========================================");
        
        Gun g6=new Gun("AK-47",700f,"Rifle",215,"Gold & Wood");
        g6.display();
        System.out.println("========================================");
        
        Gun g7=new Gun("AK-47",700f,"Rifle",215,"Gold & Wood",5);
        g7.display();
        System.out.println("========================================");
    }
}
