class Bucket{
    
    String color;
    int price;
    String size;
    String manufacturing;
    String shopName;
    String material;
    
    Bucket(){
        System.out.println("Bucket properties");
    }
    
    Bucket(String color){
        this();
        this.color=color;
    }
    
    Bucket(String color,int price){
        this(color);
        this.price=price;
    }
    
    Bucket(String color,int price,String size){
        this(color,price);
        this.size=size;
    }
    
    Bucket(String color,int price,String size,String manufacturing){
        this(color,price,size);
        this.manufacturing=manufacturing;
    }
    
    Bucket(String color,int price,String size,String manufacturing,String shopName){
        this(color,price,size,manufacturing);
        this.shopName=shopName;
    }
    
    Bucket(String color,int price,String size,String manufacturing,String shopName,String material){
        this(color,price,size,manufacturing,shopName);
        this.material=material;
    }
    
    void display(){
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
        System.out.println("Manufacturing: " + this.manufacturing);
        System.out.println("Shop Name: " + this.shopName);
        System.out.println("Material: " + this.material);
    }
}
