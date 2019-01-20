
public class OnionTopping extends ToppingDecorator {
	public OnionTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Onion";
	}

	public double cost() {
		return pizza.cost() + 0.10;
	}
}
