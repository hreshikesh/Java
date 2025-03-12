//Customer.buy(vegetable,quantity
class Customer{
	public static void buy(String vegetable,int quantity){
		System.out.println("Running Customer");
		Shop.sell(vegetable,quantity);
	}
}