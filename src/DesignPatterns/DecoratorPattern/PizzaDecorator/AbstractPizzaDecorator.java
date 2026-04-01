package DesignPatterns.DecoratorPattern.PizzaDecorator;

import DesignPatterns.DecoratorPattern.BasePizza.AbstractBasePizza;

public abstract class AbstractPizzaDecorator extends AbstractBasePizza {
    private AbstractPizzaDecorator(){};

    public AbstractBasePizza pizza;
    public AbstractPizzaDecorator(AbstractBasePizza pizza) {
        this.pizza = pizza;
    }
}