class RatPoisonRunner{
	
	public static void main(String args[]){
	String company;
	int poisonAmount;
	int price;
	
		company="Poke";
		poisonAmount=40;
		price=400;
		RatPoison poison1=new RatPoison(company,poisonAmount,price);
		System.out.println("company "+poison1.company+" poisonAmount "+poison1.poisonAmount+" price "+poison1.price);
		
		company="Delot";
		poisonAmount=10;
		price=399;
		RatPoison poison2=new RatPoison(company,poisonAmount,price);
		System.out.println("company "+poison2.company+" poisonAmount "+poison2.poisonAmount+" price "+poison2.price);
		
		company="Harpic";
		poisonAmount=50;
		price=799;
		RatPoison poison3=new RatPoison(company,poisonAmount,price);
		System.out.println("company "+poison3.company+" poisonAmount "+poison3.poisonAmount+" price "+poison3.price);
		
		company="Lizeol";
		poisonAmount=45;
		price=300;
		RatPoison poison4=new RatPoison(company,poisonAmount,price);
		System.out.println("company "+poison4.company+" poisonAmount "+poison4.poisonAmount+" price "+poison4.price);
		
		company="Finol";
		poisonAmount=499;
		price=500;
		RatPoison poison5=new RatPoison(company,poisonAmount,price);
		System.out.println("company "+poison5.company+" poisonAmount "+poison5.poisonAmount+" price "+poison5.price);
	}
}