//Shop.sell(vegetable,quantity
class Shop{
	public static void sell(String vegetable,int quantity){
		System.out.println("Running Shop");
		Agent.purchase(vegetable,quantity);
	}
}