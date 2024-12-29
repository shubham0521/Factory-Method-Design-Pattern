package design.pattern.factory_method_pattern.controller;

import design.pattern.factory_method_pattern.service.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sandwich")
public class SandwichController {

  @Autowired
  private SandwichService sandwichService;

  @PostMapping("/order")
  public void speak(@RequestParam(value = "option") String option,
      @RequestParam(value = "type") String type) {
    sandwichService.getSandwich(option, type);
  }
}
