package decorator;

public class CoffeBean1 implements Beverage{
	private String description="CoffeBean1";

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 50;
	}

}