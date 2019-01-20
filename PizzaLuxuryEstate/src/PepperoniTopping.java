
public class PepperoniTopping extends ToppingDecorator {
	public PepperoniTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Pepperoni";
	}

	public double cost() {
		return pizza.cost() + 0.10;
	}
}
