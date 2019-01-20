
public abstract class ToppingDecorator extends Pizza{
	public Pizza pizza;
	public abstract String getDescription();
	
	public Size getSize() {
		return pizza.getSize();
	}
}
