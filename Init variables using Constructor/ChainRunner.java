class ChainRunner{
	public static void main(String args[]){
	String shop;
	String type;
	int price;
	
		shop="Gandori ";
		type="Silver";
		price=4999;
		Chain chain1=new Chain(shop,type,price);
		System.out.println("shop "+chain1.shop+" type "+chain1.type+" price "+chain1.price);
		
		shop="Xworkz";
		type="silver";
		price=3999;
		Chain chain2=new Chain(shop,type,price);
		System.out.println("shop "+chain2.shop+" type "+chain2.type+" price "+chain2.price);
		
		shop="Simran";
		type="stell";
		price=250;
		Chain chain3=new Chain(shop,type,price);
		System.out.println("shop "+chain3.shop+" type "+chain3.type+" price "+chain3.price);
		
		shop="malabar";
		type="gold";
		price=10000;
		Chain chain4=new Chain(shop,type,price);
		System.out.println("shop "+chain4.shop+" type "+chain4.type+" price "+chain4.price);
		
		shop="joyal";
		type="Platinum";
		price=5000;
		Chain chain5=new Chain(shop,type,price);
		System.out.println("shop "+chain5.shop+" type "+chain5.type+" price "+chain5.price);
	}
}