package design.pattern.factory_method_pattern.service;

import design.pattern.factory_method_pattern.factory.SandwichFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichServiceImpl implements SandwichService {

  @Autowired
  private List<SandwichFactory> sandwichFactories;

  @Override
  public void getSandwich(String option, String type) {
    SandwichFactory sandwichFactory = sandwichFactories.stream()
        .filter(value -> value.getClass().getSimpleName().equals(option))
        .findAny()
        .orElseThrow(() -> new RuntimeException("Sandwich option not found"));

    sandwichFactory.orderSandwich(type);
  }
}
