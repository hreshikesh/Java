class Egg{
    
    String type;
    int price;
    String size;
    String farm;
    boolean Organic;
    String grade;
    
    Egg(){
        System.out.println("Egg properties");
    }
    
    Egg(String type){
        this();
        this.type=type;
    }
    
    Egg(String type,int price){
        this(type);
        this.price=price;
    }
    
    Egg(String type,int price,String size){
        this(type,price);
        this.size=size;
    }
    
    Egg(String type,int price,String size,String farm){
        this(type,price,size);
        this.farm=farm;
    }
    
    Egg(String type,int price,String size,String farm,boolean Organic){
        this(type,price,size,farm);
        this.Organic=Organic;
    }
    
    Egg(String type,int price,String size,String farm,boolean Organic,String grade){
        this(type,price,size,farm,Organic);
        this.grade=grade;
    }
    
    void display(){
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Farm: " + this.farm);
        System.out.println("Organic: " + this.Organic);
        System.out.println("Grade: " + this.grade);
    }
}