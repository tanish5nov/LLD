package DesignPatterns.DecoratorPattern.PizzaDecorator;

import DesignPatterns.DecoratorPattern.BasePizza.AbstractBasePizza;

public class ExtraOregano extends AbstractPizzaDecorator {
    public ExtraOregano(AbstractBasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 10;
    }
}
