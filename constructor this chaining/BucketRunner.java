class BucketRunner{
    public static void main(String args[]) {
        Bucket b1=new Bucket();
        b1.display();
        System.out.println("========================================");
        
        Bucket b2=new Bucket("Blue");
        b2.display();
        System.out.println("========================================");
        
        Bucket b3=new Bucket("Blue",150);
        b3.display();
        System.out.println("========================================");
        
        Bucket b4=new Bucket("Blue",150,"BIG");
        b4.display();
        System.out.println("========================================");
        
        Bucket b5=new Bucket("Blue",150,"BIG","tata");
        b5.display();
        System.out.println("========================================");
        
        Bucket b6=new Bucket("Blue",150,"BIG","tata","D-Mart");
        b6.display();
        System.out.println("========================================");
        
        Bucket b7=new Bucket("Blue",150,"BIG","tata","D-Mart","Plastic");
        b7.display();
        System.out.println("========================================");
    }
}
