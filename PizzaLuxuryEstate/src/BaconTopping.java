
public class BaconTopping extends ToppingDecorator {
	public BaconTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Bacon";
	}

	public double cost() {
		return pizza.cost() + 0.15;
	}
}
