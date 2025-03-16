class WaterBallRunner{
    public static void main(String args[]){
        WaterBall wb1=new WaterBall();
        wb1.display();
        System.out.println("========================================");
        
        WaterBall wb2=new WaterBall("Green");
        wb2.display();
        System.out.println("========================================");
        
        WaterBall wb3=new WaterBall("Green","Sphere");
        wb3.display();
        System.out.println("========================================");
        
        WaterBall wb4=new WaterBall("Green","Sphere","179ml");
        wb4.display();
        System.out.println("========================================");
        
        WaterBall wb5=new WaterBall("Green","Sphere","179ml","Medium");
        wb5.display();
        System.out.println("========================================");
        
        WaterBall wb6=new WaterBall("Green","Sphere","179ml","Medium",50);
        wb6.display();
        System.out.println("========================================");
        
        WaterBall wb7=new WaterBall("Green","Sphere","179ml","Medium",50,true);
        wb7.display();
        System.out.println("========================================");
    }
}
