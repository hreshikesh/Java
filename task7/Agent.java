//Agent.purchase(vegetable,quantity)
class Agent{
	public static void purchase(String vegetable,int quantity){
		System.out.println("Running Agent");
		Broker.brokerage(vegetable,quantity);
	}
}