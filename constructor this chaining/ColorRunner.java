class ColorRunner {
    public static void main(String args[]) {
        Color c1=new Color();
        c1.display();
        System.out.println("========================================");
        
        Color c2=new Color("Red");
        c2.display();
        System.out.println("========================================");
        
        Color c3=new Color("Red",100);
        c3.display();
        System.out.println("========================================");
        
        Color c4=new Color("Red",100,"0x100");
        c4.display();
        System.out.println("========================================");
        
        Color c5=new Color("Red",100,"0x100","Liquid");
        c5.display();
        System.out.println("========================================");
        
        Color c6=new Color("Red",100,"0x100","Liquid",true);
        c6.display();
        System.out.println("========================================");
        
        Color c7=new Color("Red",100,"0x100","Liquid",true,'A');
        c7.display();
        System.out.println("========================================");
    }
}
