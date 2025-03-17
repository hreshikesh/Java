class TomatoRunner{
	public static void main(String args[]){
		
		
		
		Tomato tomato=new Tomato();
		tomato.display();
		 System.out.println("========================================");
		
		Tomato tomato1=new Tomato("Vegetable");
		tomato1.display();
		 System.out.println("========================================");
		
		Tomato tomato2=new Tomato("Vegetable",25);
		tomato2.display();
		 System.out.println("========================================");
		
		Tomato tomato3=new Tomato("Vegetable",25,"Red");
		tomato3.display();
		 System.out.println("========================================");
		
		Tomato tomato4=new Tomato("Vegetable",25,"Red","India");
		tomato4.display();
		 System.out.println("========================================");
		
		Tomato tomato5=new Tomato("Vegetable",25,"Red","India",3);
		tomato5.display();
		 System.out.println("========================================");
		
		Tomato tomato6=new Tomato("Vegetable",25,"Red","India",3,"Big Bazaar");
		tomato6.display();
		 System.out.println("========================================");
		
		
		
		
	}
}