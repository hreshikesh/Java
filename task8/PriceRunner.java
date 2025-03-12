public class PriceRunner{
	public static void main(String args[]){
		
		String foodItem="EggOmlet";
		int price=FoodPrice.price(foodItem);
		System.out.println("Food Item "+foodItem+" Price "+price);
		
		
		
		foodItem="Biriyani";
		price=FoodPrice.price(foodItem);
		System.out.println("Food Item "+foodItem+" Price "+price);
	}
	
	
	
	
}