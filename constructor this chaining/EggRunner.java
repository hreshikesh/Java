class EggRunner {
    public static void main(String args[]) {
        Egg e1=new Egg();
        e1.display();
        System.out.println("========================================");
        
        Egg e2=new Egg("Ostritch Egg");
        e2.display();
        System.out.println("========================================");
        
        Egg e3=new Egg("Ostritch Egg",12);
        e3.display();
        System.out.println("========================================");
        
        Egg e4=new Egg("Ostritch Egg",12,"Extra Large");
        e4.display();
        System.out.println("========================================");
        
        Egg e5=new Egg("Ostritch Egg",12,"Extra Large","Chicken Farm");
        e5.display();
        System.out.println("========================================");
        
        Egg e6=new Egg("Ostritch Egg",12,"Extra Large","Chicken Farm",true);
        e6.display();
        System.out.println("========================================");
        
        Egg e7=new Egg("Ostritch Egg",12,"Extra Large","Chicken Farm",true,"A+");
        e7.display();
        System.out.println("========================================");
    }
}