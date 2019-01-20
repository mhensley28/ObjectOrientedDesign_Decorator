//import defaultpackage.Pizza.Size;

public class PizzaOrder {

	public static void main(String[] args) {
		Pizza pizza = new HandTossedPizza();
		System.out.println(pizza.getDescription() 
				+ " $" + String.format("%.2f", pizza.cost()));
 
		Pizza pizza2 = new PanPizza();
		pizza2 = new PepperoniTopping(pizza2);
		pizza2 = new BaconTopping(pizza2);
		pizza2 = new XtraCheeseTopping(pizza2);
		pizza2 = new XtraCheeseTopping(pizza2);
		System.out.println(pizza2.getDescription() 
				+ " $" + String.format("%.2f", pizza2.cost()));
 
		Pizza pizza3 = new ThinCrustPizza();
		pizza3.setSize(Size.LARGE);
		pizza3 = new PepperoniTopping(pizza3);
		pizza3 = new BaconTopping(pizza3);
		pizza3 = new OnionTopping(pizza3);
		System.out.println(pizza3.getDescription() 
				+ " $" + String.format("%.2f", pizza3.cost()));
	}

}
