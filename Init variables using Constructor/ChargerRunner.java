class ChargerRunner{
	public static void main(String args[]){
		String company,type;
		int price;

		company="Samsung";
		type="C";
		price=400;
		Charger charger1=new Charger(company,type,price);
		System.out.println("company "+charger1.company+" type "+charger1.type+" price "+charger1.price);
		
		company="MI";
		type="Usb";
		price=250;
		Charger charger2=new Charger(company,type,price);
		System.out.println("company "+charger2.company+" type "+charger2.type+" price "+charger2.price);
		
		company="Apple";
		type="ligthing";
		price=1500;
		Charger charger3=new Charger(company,type,price);
		System.out.println("company "+charger3.company+" type "+charger3.type+" price "+charger3.price);
		
		company="Apple";
		type="C";
		price=1500;
		Charger charger4=new Charger(company,type,price);
		System.out.println("company "+charger4.company+" type "+charger4.type+" price "+charger4.price);
		
		company="RealME";
		type="B";
		price=500;
		Charger charger5=new Charger(company,type,price);
		System.out.println("company "+charger5.company+" type "+charger5.type+" price "+charger5.price);
		
	}
}
		
		
	