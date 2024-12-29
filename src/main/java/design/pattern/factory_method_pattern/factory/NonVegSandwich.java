package design.pattern.factory_method_pattern.factory;

import design.pattern.factory_method_pattern.product.BombayNonVegSandwich;
import design.pattern.factory_method_pattern.product.CheeseNonVegSandwich;
import design.pattern.factory_method_pattern.product.ClubNonVegSandwich;
import design.pattern.factory_method_pattern.product.Sandwich;
import org.springframework.stereotype.Component;

@Component
public class NonVegSandwich extends SandwichFactory{


  @Override
  protected Sandwich makeSandwich(String type) {
    if("BombayNonVegSandwich".equals(type)){
      return new BombayNonVegSandwich();
    } else if("CheeseNonVegSandwich".equals(type)){
      return new CheeseNonVegSandwich();
    } else if("ClubNonVegSandwich".equals(type)){
      return new ClubNonVegSandwich();
    } else {
      throw new RuntimeException("Sandwich type not support");
    }
  }
}
