//Broker.brokerage(vegetable,quantity)
class Broker{
	public static void brokerage(String vegetable,int quantity){
		System.out.println("Running brokage");
		Farmer.farm(vegetable,quantity);
	}
}