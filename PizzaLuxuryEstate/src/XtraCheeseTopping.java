
public class XtraCheeseTopping extends ToppingDecorator {
	public XtraCheeseTopping(Pizza pizza) {
		this.pizza = pizza;
	}

	public String getDescription() {
		return pizza.getDescription() + ", Xtra Cheese";
	}

	public double cost() {
		return pizza.cost() + 1.00;
	}
}
