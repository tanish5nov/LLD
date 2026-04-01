package DesignPatterns.DecoratorPattern.PizzaDecorator;

import DesignPatterns.DecoratorPattern.BasePizza.AbstractBasePizza;

public class ExtraCheese extends AbstractPizzaDecorator{

    public ExtraCheese(AbstractBasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 100;
    }
}
