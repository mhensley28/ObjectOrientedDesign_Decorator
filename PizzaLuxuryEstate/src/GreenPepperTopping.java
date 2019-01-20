
public class GreenPepperTopping extends ToppingDecorator {
	public GreenPepperTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Green Pepper";
	}

	public double cost() {
		return pizza.cost() + 0.10;
	}
}
