class HarpicRunner{
   public static void main(String args[]){
	   String color,used;
		int price;

		color="Red";
		used="bathroom";
		price=499;
		Harpic harpic1=new Harpic(color,used,price);
		System.out.println("color "+harpic1.color+" used "+harpic1.used+" price "+harpic1.price);
		
		color="blue";
		used="toilet";
		price=399;
		Harpic harpic2=new Harpic(color,used,price);
		System.out.println("color "+harpic2.color+" used "+harpic2.used+" price "+harpic2.price);
		
		color="White";
		used="kitchen";
		price=150;
		Harpic harpic3=new Harpic(color,used,price);
		System.out.println("color "+harpic3.color+" used "+harpic3.used+" price "+harpic3.price);
		
		color="black";
		used="basin";
		price=100;
		Harpic harpic4=new Harpic(color,used,price);
		System.out.println("color "+harpic4.color+" used "+harpic4.used+" price "+harpic4.price);
		
		color="green";
		used="toilet tiles";
		price=500;
		Harpic harpic5=new Harpic(color,used,price);
		System.out.println("color "+harpic5.color+" used "+harpic5.used+" price "+harpic5.price);
   }
}