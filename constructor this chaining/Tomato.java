class Tomato{
	String category;
	int price;
	String color;
	String origin;
	int quantity;
	String shopName;
	
	
	Tomato(){
		System.out.println("Tomato DEtails");
	}
	Tomato(String category){
		this();
		this.category=category;
	}
	Tomato(String category,int price){
		this(category);
		this.price=price;
	}
	Tomato(String category,int price,String color){
		this(category,price);
		this.color=color;
	}
	Tomato(String category,int price,String color,String origin){
		this(category,price,color);
		this.origin=origin;
	}
	Tomato(String category,int price,String color,String origin,int quantity){
		this(category,price,color,origin);
		this.quantity=quantity;
	}
	Tomato(String category,int price,String color,String origin,int quantity,String shopName){
		this(category,price,color,origin,quantity);
		this.shopName=shopName;
	}
	
	void display(){
		System.out.println("Category:"+category);
		System.out.println("price:"+price);
		System.out.println("color:"+color);
		System.out.println("origin:"+origin);
		System.out.println("quantity:"+quantity+"kg");
		System.out.println("shopName:"+shopName);
	}
}