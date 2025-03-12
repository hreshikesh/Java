class AnkltRunner{
	public static void main(String args[]){
	String shop;
	String type;
	int price;
	
		shop="Lalith";
		type="Silver";
		price=4999;
		Anklet anklet1=new Anklet(shop,type,price);
		System.out.println("shop "+anklet1.shop+" type "+anklet1.type+" price "+anklet1.price);
		
		shop="Bhats silver";
		type="silver";
		price=3999;
		Anklet anklet2=new Anklet(shop,type,price);
		System.out.println("shop "+anklet2.shop+" type "+anklet2.type+" price "+anklet2.price);
		
		shop="-NA-";
		type="stell";
		price=250;
		Anklet anklet3=new Anklet(shop,type,price);
		System.out.println("shop "+anklet3.shop+" type "+anklet3.type+" price "+anklet3.price);
		
		shop="malabar";
		type="gold";
		price=10000;
		Anklet anklet4=new Anklet(shop,type,price);
		System.out.println("shop "+anklet4.shop+" type "+anklet4.type+" price "+anklet4.price);
		
		shop="joyal";
		type="Platinum";
		price=5000;
		Anklet anklet5=new Anklet(shop,type,price);
		System.out.println("shop "+anklet5.shop+" type "+anklet5.type+" price "+anklet5.price);
	}
}