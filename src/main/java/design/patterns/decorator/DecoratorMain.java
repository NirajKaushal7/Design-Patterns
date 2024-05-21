package design.patterns.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorMain {
    private DecoratorMain(){}
    public static void main() {
        Coffee simpleCoffee = new SimpleCoffee();
        log.info(simpleCoffee.getDescription() + " $" + simpleCoffee.getCost());

        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        log.info(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        Coffee milkSugarCoffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        log.info(milkSugarCoffee.getDescription() + " $" + milkSugarCoffee.getCost());
    }
}
