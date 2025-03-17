class HoliRunner{
	
	
public static void main(String args[]){

		Holi holi=new Holi();
		holi.display();
		System.out.println("========================================");
		
		Holi holi1=new Holi("Purple");
		holi1.display();
		System.out.println("========================================");
		
		Holi holi2=new Holi("Purple",100);
		holi2.display();
		System.out.println("========================================");
		
		Holi holi3=new Holi("Purple",100,"MArch");
		holi3.display();
		System.out.println("========================================");
		
		Holi holi4=new Holi("Purple",100,"March",50);
		holi4.display();
		System.out.println("========================================");
		
		Holi holi5=new Holi("Purple",100,"MArch",50,"DJ VAibhav");
		holi5.display();
		System.out.println("========================================");
		
		Holi holi6=new Holi("Purple",100,"MArch",50,"DJ VAibhav","Excellent");
		holi6.display();
		System.out.println("========================================");
		
	
}
	
	
}