package design.patterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorMain {
    private DecoratorMain(){}
    public static void main() {
        Coffee simpleCoffee = new SimpleCoffee();
        log.info(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());//Simple Coffee $5.0

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());// left to right
        log.info(milkCoffee.getDescription() + " $" + milkCoffee.getCost());// Simple Coffee, Milk $6.5

        Coffee milkSugarCoffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        log.info(milkSugarCoffee.getDescription() + " $" + milkSugarCoffee.getCost());// Simple Coffee, Sugar, Milk $7.0
    }
}
