package design.pattern.factory_method_pattern.factory;

import design.pattern.factory_method_pattern.product.BombayVegSandwich;
import design.pattern.factory_method_pattern.product.CheeseVegSandwich;
import design.pattern.factory_method_pattern.product.ClubVegSandwich;
import design.pattern.factory_method_pattern.product.Sandwich;
import org.springframework.stereotype.Component;

@Component
public class VegSandwich extends SandwichFactory {

  @Override
  protected Sandwich makeSandwich(String type) {
    if("BombayVegSandwich".equals(type)){
      return new BombayVegSandwich();
    } else if("CheeseVegSandwich".equals(type)){
      return new CheeseVegSandwich();
    } else if("ClubVegSandwich".equals(type)){
      return new ClubVegSandwich();
    } else {
      throw new RuntimeException("Sandwich type not support");
    }
  }
}
