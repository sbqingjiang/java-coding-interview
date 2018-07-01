package decorator;

public class CoffeBean2 implements Beverage {
	private String description = "CoffeBean2";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 20;
	}

}
