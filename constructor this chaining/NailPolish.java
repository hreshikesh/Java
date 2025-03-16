class NailPolish {
    String company;
	String color;
    float price;
    String type; 
    boolean isLongLasting;
	boolean isGlassBottle;
	

    NailPolish(){
        System.out.println("Nail Polish properties:");
    }

    NailPolish(String company){
        this();
        this.company=company;
    }

    NailPolish(String company,String color){
        this(company);
        this.color=color;
    }

    NailPolish(String company,String color,float price){
        this(company,color);
        this.price=price;
    }

    NailPolish(String company,String color,float price,String type){
        this(company,color,price);
        this.type=type;
    }

    NailPolish(String company,String color,float price,String type,boolean isLongLasting){
        this(company,color,price,type);
        this.isLongLasting=isLongLasting;
    }
	NailPolish(String company,String color,float price,String type,boolean isLongLasting,boolean isGlassBottle){
        this(company,color,price,type,isLongLasting);
        this.isGlassBottle=isGlassBottle;
    }

    void display(){
        System.out.println("Company:"+this.company);
        System.out.println("Color:"+this.color);
        System.out.println("Price:"+this.price);
        System.out.println("type:"+this.type);
        System.out.println("Long Lasting:"+this.isLongLasting);
		System.out.println("Glass Botte "+this.isGlassBottle);
    }
}
