class Gun{
	String name;
	float price;
	String gunClass;
	int range;
	String material;
	double weight;
	
	 Gun(){
        System.out.println("Gun properties");
    }

    Gun(String name){
        this();
        this.name=name;
    }

    Gun(String name,float price){
        this(name);
        this.price=price;
    }

    Gun(String name,float price,String gunClass){
        this(name,price);
        this.gunClass=gunClass;
    }

    Gun(String name,float price,String gunClass,int range){
        this(name,price,gunClass);
        this.range=range;
    }

    Gun(String name,float price,String gunClass,int range,String material){
        this(name,price,gunClass,range);
        this.material=material;
    }

    Gun(String name,float price,String gunClass,int range,String material,double weight){
        this(name,price,gunClass,range,material);
        this.weight=weight;
    }

    void display(){
        System.out.println("Name:"+this.name);
        System.out.println("Price:"+this.price);
        System.out.println("Class:"+this.gunClass);
        System.out.println("Range:"+this.range +"mtrs");
        System.out.println("Material:"+this.material);
        System.out.println("Weight:"+this.weight +"kg");
    }
}