package decorator;

public class Decorator implements Beverage {
    private String description = "this is decorator";
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public double getPrice() {
		return 0;
	}

}
