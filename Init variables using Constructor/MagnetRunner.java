class MagnetRunner{
	public static void main(String args[]){
		
	String shape;
	String strength;
	int price;
	
		shape="traingle";
		strength="bad";
		price=49;
		Magnet magnet1=new Magnet(shape,strength,price);
		System.out.println("shape "+magnet1.shape+" strength "+magnet1.strength+" price "+magnet1.price);
		
		shape="rectangle";
		strength="too bead";
		price=50;
		Magnet magnet2=new Magnet(shape,strength,price);
		System.out.println("shape "+magnet2.shape+" strength "+magnet2.strength+" price "+magnet2.price);
		
		shape="Disc";
		strength="good";
		price=150;
		Magnet magnet3=new Magnet(shape,strength,price);
		System.out.println("shape "+magnet3.shape+" strength "+magnet3.strength+" price "+magnet3.price);
		
		shape="Block";
		strength="Excellent";
		price=1000;
		Magnet magnet4=new Magnet(shape,strength,price);
		System.out.println("shape "+magnet4.shape+" strength "+magnet4.strength+" price "+magnet4.price);
		
		shape="Sphere";
		strength="good";
		price=500;
		Magnet magnet5=new Magnet(shape,strength,price);
		System.out.println("shape "+magnet5.shape+" strength "+magnet5.strength+" price "+magnet5.price);
	}
}