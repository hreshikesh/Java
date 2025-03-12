class ChatRunner{
	public static void main(String args[]){
		
		String shopName,name;
		int price;
		shopName="Chats N Drinks";
		name="Masala Puri";
		price=40;
		Chat chat1=new Chat(shopName,name,price);
		System.out.println("Shopname "+chat1.shopName+" name "+chat1.name+" price "+chat1.price);
		
		shopName="Chats Palace";
		name="Paani Puri";
		price=25;
		Chat chat2=new Chat(shopName,name,price);
		System.out.println("Shopname "+chat2.shopName+" name "+chat2.name+" price "+chat2.price);
		
		shopName="Banglore Chats";
		name="sev Puri";
		price=40;
		Chat chat3=new Chat(shopName,name,price);
		System.out.println("Shopname "+chat3.shopName+" name "+chat3.name+" price "+chat3.price);
		
		shopName="Chats Duniya";
		name="Dahi Puri";
		price=40;
		Chat chat4=new Chat(shopName,name,price);
		System.out.println("Shopname "+chat4.shopName+" name "+chat4.name+" price "+chat4.price);
		
		shopName="Chats n Masala";
		name="Maggi chat";
		price=50;
		Chat chat5=new Chat(shopName,name,price);
		System.out.println("Shopname "+chat5.shopName+" name "+chat5.name+" price "+chat5.price);
		
	}
}