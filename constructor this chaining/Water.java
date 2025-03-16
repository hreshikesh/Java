class Water{
	String form;
	String source;
	String type;
	int quantity;
	String location;
	boolean isPolluted;
	
	Water(){
		System.out.println("Water Details");
	}
	Water(String form){
		this();
		this.form=form;
	}
	Water(String form,String source){
		this(form);
		this.source=source;
	}
	Water(String form,String source,String type){
		this(form,source);
		this.type=type;
	}
	Water(String form,String source,String type,int quantity){
		this(form,source,type);
		this.quantity=quantity;
	}
	Water(String form,String source,String type,int quantity,String location){
		this(form,source,type,quantity);
		this.location=location;
	}
	Water(String form,String source,String type,int quantity,String location,boolean isPolluted){
		this(form,source,type,quantity,location);
		this.isPolluted=isPolluted;
	}
	
	void display(){
		System.out.println("Water Form:"+this.form);
		System.out.println("Water Source:"+this.source);
		System.out.println("Water type:"+this.type);
		System.out.println("Water quantity:"+this.quantity);
		System.out.println("Water location:"+this.location);
		System.out.println("Water polluted:"+this.isPolluted);
		
	}
}