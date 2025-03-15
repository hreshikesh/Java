class Balloon{
	
	
	String color;
	int price;
	String shape;
	String gas;
	char size;
	String quality;
	
	
	Balloon(){
		System.out.println("balloon properties");
	}
	Balloon(String color){
		this();
		this.color=color;
	}
	Balloon(String color,int price){
		this(color);
		this.price=price;
	}
	Balloon(String color,int price,String shape){
		this(color,price);
		this.shape=shape;
	}
	Balloon(String color,int price,String shape,String gas){
		this(color,price,shape);
		this.gas=gas;
	}
	Balloon(String color,int price,String shape,String gas,char size){
		this(color,price,shape,gas);
		this.size=size;
	}
	Balloon(String color,int price,String shape,String gas,char size,String quality){
		this(color,price,shape,gas,size);
		this.quality=quality;
	}
	
	
	void display(){
		System.out.println("Color "+this.color);
		System.out.println("price "+this.price);
		System.out.println("shape "+this.shape);
		System.out.println("Gas "+this.gas);
		System.out.println("Size "+this.size);
		System.out.println("Quality "+this.quality);
		
	}
}