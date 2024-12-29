package design.pattern.factory_method_pattern.product;

public class CheeseVegSandwich extends Sandwich {

  public CheeseVegSandwich() {
    name = "Cheese Veg Sandwich";
    bread = "White Bread";
    fillings = "filled with extra mozerella cheese";
  }

  @Override
  public void bake() {
    System.out.println("bake for more than 30 minutes");
  }
}
