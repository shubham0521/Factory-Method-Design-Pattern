package design.pattern.factory_method_pattern.product;

public class ClubNonVegSandwich extends Sandwich{

  public ClubNonVegSandwich() {
    name = "Club Non Veg Sandwich";
    bread = "Brown Bread";
    fillings = "filled with veggies and choice of customer with extra fried chicken strips";
  }

  @Override
  public void bake() {
    System.out.println("bake for more than 40 minutes");
  }
}
