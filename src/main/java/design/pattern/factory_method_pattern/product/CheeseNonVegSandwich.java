package design.pattern.factory_method_pattern.product;

public class CheeseNonVegSandwich extends Sandwich {

  public CheeseNonVegSandwich() {
    name = "Cheese Non Veg Sandwich";
    bread = "White Bread";
    fillings = "filled with extra mozerella cheese with extra fried chicken strips";
  }

  @Override
  public void bake() {
    System.out.println("bake for more than 30 minutes");
  }
}
