package decorator;

public class Test {
  public static void main(String[] args) {
	Beverage beverage= new CoffeBean2();
	beverage = new Milk(beverage);
	System.out.println(beverage.getDescription()+" "+beverage.getPrice());
}
}
