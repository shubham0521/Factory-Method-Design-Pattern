package design.pattern.factory_method_pattern.product;

public class ClubVegSandwich extends Sandwich{

  public ClubVegSandwich() {
    name = "Club Veg Sandwich";
    bread = "Brown Bread";
    fillings = "filled with veggies and choice of customer";
  }

  @Override
  public void bake() {
    System.out.println("bake for more than 40 minutes");
  }
}
