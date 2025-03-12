class PowerBank{
	String company;
	String origin;
	int capacity;
	boolean display;
	
	public static void main(String args[]){
		PowerBank  pb1=new PowerBank ();
		pb1.company="Samsung";
		pb1.origin="India";
		pb1.capacity=10000;
		pb1.display=false;
		System.out.println("pb company "+pb1.company+" origin "+pb1.origin+" capacity "+pb1.capacity+"mah display "+pb1.display);
		
		
		
		PowerBank  pb2=new PowerBank ();
		pb2.company="MI";
		pb2.origin="China";
		pb2.capacity=15000;
		pb2.display=true;
		System.out.println("pb company "+pb2.company+" origin "+pb2.origin+" capacity "+pb2.capacity+"mah display "+pb2.display);
		
		PowerBank  pb3=new PowerBank ();
		pb3.company="realme";
		pb3.origin="Germany";
		pb3.capacity=11000;
		pb3.display=false;
		System.out.println("pb company "+pb3.company+"origin "+pb3.origin+" capacity "+pb3.capacity+"mah display "+pb3.display);
		
		
		PowerBank  pb4=new PowerBank ();
		pb4.company="POCo";
		pb4.origin="China";
		pb4.capacity=8000;
		pb4.display=false;
		System.out.println("pb company "+pb4.company+"origin "+pb4.origin+" capacity "+pb4.capacity+"mah display "+pb4.display);
		
		PowerBank  pb5=new PowerBank ();
		pb5.company="VIvo";
		pb5.origin="Tibet";
		pb5.capacity=20000;
		pb5.display=true;
		System.out.println("pb company "+pb5.company+"origin "+pb5.origin+" capacity "+pb5.capacity+"mah display "+pb5.display);
		
		
		PowerBank  pb6=new PowerBank ();
		pb6.company="Apple";
		pb6.origin="US";
		pb6.capacity=15000;
		pb6.display=true;
		System.out.println("pb company "+pb6.company+"origin "+pb6.origin+" capacity "+pb6.capacity+"mah display "+pb6.display);
		
		PowerBank  pb7=new PowerBank ();
		pb7.company="Arwon";
		pb7.origin="China";
		pb7.capacity=12999;
		pb7.display=true;
		System.out.println("pb company "+pb7.company+"origin "+pb7.origin+" capacity "+pb7.capacity+"mah display "+pb7.display);
		
		PowerBank  pb8=new PowerBank ();
		pb8.company="POLO";
		pb8.origin="Swizerland";
		pb8.capacity=12000;
		pb8.display=true;
		System.out.println("pb company "+pb8.company+"origin "+pb8.origin+" capacity "+pb8.capacity+" display "+pb8.display);
		
		PowerBank  pb9=new PowerBank ();
		pb9.company="google";
		pb9.origin="India";
		pb9.capacity=10000;
		pb9.display=false;
		System.out.println("pb company "+pb9.company+"origin "+pb9.origin+" capacity "+pb9.capacity+"mah display "+pb9.display);
		
		
		PowerBank  pb10=new PowerBank ();
		pb10.company="Asus";
		pb10.origin="Japan";
		pb10.capacity=50000;
		pb10.display=false;
		System.out.println("pb company "+pb10.company+"origin "+pb10.origin+" capacity "+pb10.capacity+" display "+pb10.display);
	}
}