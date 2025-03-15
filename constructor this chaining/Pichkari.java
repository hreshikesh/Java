class Pichkari {
    
    String color;
    int price;
    String material;
    int length;
    String brand;
    String quality;
    
    Pichkari(){
        System.out.println("Pichkari properties");
    }
    
    Pichkari(String color){
        this();
        this.color=color;
    }
    
    Pichkari(String color,int price){
        this(color);
        this.price=price;
    }
    
    Pichkari(String color,int price,String material){
        this(color,price);
        this.material=material;
    }
    
    Pichkari(String color,int price,String material,int length){
        this(color,price,material);
        this.length=length;
    }
    
    Pichkari(String color,int price,String material,int length,String brand){
        this(color,price,material,length);
        this.brand=brand;
    }
    
    Pichkari(String color,int price,String material,int length,String brand,String quality){
        this(color,price,material,length,brand);
        this.quality=quality;
    }
    
    void display(){
        System.out.println("Color:" + this.color);
        System.out.println("Price:" + this.price);
        System.out.println("Material:" + this.material);
        System.out.println("Length:" + this.length);
        System.out.println("Brand:" + this.brand);
        System.out.println("Quality:" + this.quality);
    }
}