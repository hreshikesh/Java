class Color{
	
	String name;
	int price;
	String code;
	String form;
	boolean glitter;
	char grade;
	
	Color(){
		System.out.println("Color Properties");
	}
	Color(String name){
		this();
		this.name=name;
	}
	Color(String name,int price){
		this(name);
		this.price=price;
	}
	Color(String name,int price,String code){
		this(name,price);
		this.code=code;
	}
	Color(String name,int price,String code,String form){
		this(name,price,code);
		this.form=form;
	}
	Color(String name,int price,String code,String form,boolean glitter){
		this(name,price,code,form);
		this.glitter=glitter;
	}
	Color(String name,int price,String code,String form,boolean glitter,char grade){
		this(name,price,code,form,glitter);
		this.grade=grade;
	}
	 void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Code: " + this.code);
        System.out.println("Form: " + this.form);
        System.out.println("Glitter: " + this.glitter);
        System.out.println("Grade: " + this.grade);
    }
	


}