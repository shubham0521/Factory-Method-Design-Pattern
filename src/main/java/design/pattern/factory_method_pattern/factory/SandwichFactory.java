package design.pattern.factory_method_pattern.factory;

import design.pattern.factory_method_pattern.product.Sandwich;

public abstract class SandwichFactory {

  public void orderSandwich(String type) {
    Sandwich sandwich;

    sandwich = makeSandwich(type);

    sandwich.prepare();
    sandwich.bake();
    sandwich.box();
  }

  protected abstract Sandwich makeSandwich(String type);
}
