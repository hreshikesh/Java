class BalloonRunner{
	public static void main(String args[]){
		

		
		Balloon balloon=new Balloon();
		balloon.display();
		System.out.println("========================================");
		
		Balloon balloon1=new Balloon("Red");
		balloon1.display();
		System.out.println("========================================");
		
		Balloon balloon2=new Balloon("Red",10);
		balloon2.display();
		System.out.println("========================================");
		
		Balloon balloon3=new Balloon("Red",10,"Sphere");
		balloon3.display();
		System.out.println("========================================");
		
		Balloon balloon4=new Balloon("Red",10,"Sphere","Helium");
		balloon4.display();
		System.out.println("========================================");
		
		Balloon balloon5=new Balloon("Red",10,"Sphere","Helium",'L');
		balloon5.display();
		System.out.println("========================================");
		
		Balloon balloon6=new Balloon("Red",10,"Sphere","Helium",'L',"Bad");
		balloon6.display();
		System.out.println("========================================");
		
	}
}