class WaterBall{
	String color;
	String shape;
	String waterQuantity;
	String size;
	int price;
	boolean isColorWater;
	
	WaterBall(){
        System.out.println("WaterBall properties");
    }
    
    WaterBall(String color){
        this();
        this.color=color;
    }
    
    WaterBall(String color,String shape){
        this(color);
        this.shape=shape;
    }
    
    WaterBall(String color,String shape,String waterQuantity){
        this(color,shape);
        this.waterQuantity=waterQuantity;
    }
    
    WaterBall(String color,String shape,String waterQuantity,String size){
        this(color,shape,waterQuantity);
        this.size=size;
    }
    
    WaterBall(String color,String shape,String waterQuantity,String size,int price){
        this(color,shape,waterQuantity,size);
        this.price=price;
    }
    
    WaterBall(String color,String shape,String waterQuantity,String size,int price,boolean isColorWater){
        this(color,shape,waterQuantity,size,price);
        this.isColorWater=isColorWater;
    }
    
    void display(){
        System.out.println("Color:" +this.color);
        System.out.println("Shape:" +this.shape);
        System.out.println("Water Quantity:" +this.waterQuantity);
        System.out.println("Size:" +this.size);
        System.out.println("Price:" +this.price);
        System.out.println("Is Color Water:" +this.isColorWater);
    }
}
	
	
