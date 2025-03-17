class PichkariRunner {
    public static void main(String args[]) {
        Pichkari p1=new Pichkari();
        p1.display();
        System.out.println("========================================");
        
        Pichkari p2=new Pichkari("Red");
        p2.display();
        System.out.println("========================================");
        
        Pichkari p3=new Pichkari("Red",150);
        p3.display();
        System.out.println("========================================");
        
        Pichkari p4=new Pichkari("Red",150,"Plastic");
        p4.display();
        System.out.println("========================================");
        
        Pichkari p5=new Pichkari("Red",150,"Plastic",30);
        p5.display();
        System.out.println("========================================");
        
        Pichkari p6=new Pichkari("Red",150,"Plastic",30,"Akila");
        p6.display();
        System.out.println("========================================");
        
        Pichkari p7=new Pichkari("Red",150,"Plastic",30,"Akila","Premium");
        p7.display();
        System.out.println("========================================");
    }
}
