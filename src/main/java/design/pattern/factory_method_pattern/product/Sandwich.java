package design.pattern.factory_method_pattern.product;

public abstract class Sandwich {
  String name;
  String bread;
  String fillings;

  public void prepare(){
    System.out.println("Preparing " + name);
    System.out.println("Toasting " + bread);
    System.out.println("Applying Fillings " + fillings);
  };

  public void bake(){
    System.out.println("Baking for 20 to 25 mins");
  }

  public void cut(){
    System.out.println("Cutting breads into diagonal slices");
  }

  public void box(){
    System.out.println("Place sandwich in boxes");
  }
}
