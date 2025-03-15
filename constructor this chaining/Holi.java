class Holi{
	
	
	String color;
	int price;
	String month;
	int nopeople ;
	String dj;
	String quality;
	
	
	Holi(){
		System.out.println("balloon properties");
	}
	Holi(String color){
		this();
		this.color=color;
	}
	Holi(String color,int price){
		this(color);
		this.price=price;
	}
	Holi(String color,int price,String month){
		this(color,price);
		this.month=month;
	}
	Holi(String color,int price,String month,int nopeople ){
		this(color,price,month);
		this.nopeople =nopeople ;
	}
	Holi(String color,int price,String month,int nopeople ,String dj){
		this(color,price,month,nopeople );
		this.dj=dj;
	}
	Holi(String color,int price,String month,int nopeople ,String dj,String quality){
		this(color,price,month,nopeople ,dj);
		this.quality=quality;
	}
	
	
	void display(){
		System.out.println("Color "+this.color);
		System.out.println("price "+this.price);
		System.out.println("month "+this.month);
		System.out.println("Gas "+this.nopeople );
		System.out.println("Size "+this.dj);
		System.out.println("Quality "+this.quality);
		
	}
}