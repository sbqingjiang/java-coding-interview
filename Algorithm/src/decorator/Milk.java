package decorator;

public class Milk extends Decorator {
	private String description = "add milk";
	private Beverage beverage=null;
	public Milk(Beverage beverage) {
		this.beverage=beverage;
	}
	public String getDescription() {
		return beverage.getDescription()+"milk";
	}
	public double getPrice(){
		return beverage.getPrice()+20;
	}
}
