class WaterRunner{
	public static void main(String args[]){
		
		Water water=new Water();
		water.display();
		System.out.println("========================================");
		
		Water water1=new Water("liquid");
		water1.display();
		System.out.println("========================================");
		
		Water water2=new Water("liquid","Borewell");
		water2.display();
		System.out.println("========================================");
		
		Water water3=new Water("liquid","Borewell","Hardwater");
		water3.display();
		System.out.println("========================================");
		
		Water water4=new Water("liquid","Borewell","Hardwater",5);
		water4.display();
		System.out.println("========================================");
		
		Water water5=new Water("liquid","Borewell","Hardwater",5,"Banglore");
		water5.display();
		System.out.println("========================================");
		
		Water water6=new Water("liquid","Borewell","Hardwater",5,"Banglore",false);
		water6.display();
		System.out.println("========================================");
		
		
		
		
	}
}