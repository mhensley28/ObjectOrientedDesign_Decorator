
public abstract class Pizza {
	//public enum Size { SMALL, MEDIUM, LARGE };
	Size size = Size.SMALL;
	String description = "Unknown Pizza";
  
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
 
	public abstract double cost();
}
