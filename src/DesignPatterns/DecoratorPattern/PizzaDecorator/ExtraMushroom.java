package DesignPatterns.DecoratorPattern.PizzaDecorator;

import DesignPatterns.DecoratorPattern.BasePizza.AbstractBasePizza;

public class ExtraMushroom extends AbstractPizzaDecorator{
    public ExtraMushroom(AbstractBasePizza pizza) {
        super(pizza);
    }

    @Override
    public int cost() {
        return this.pizza.cost() + 30;
    }
}
