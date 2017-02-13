

public class CookerApp {

	public static void main(String[] args) {
		
		Cooker mycooker = new Cooker();
		mycooker.cook();
		
		Cooker myGrill = new Grill();
		myGrill.cook();
		
		Cooker myPizzaOven = new PizzaOven();
		myPizzaOven.cook();
		
		Cooker myStove = new Stove();
		myStove.cook();
		
	}

	 

}
