package DecoratorDesignPattern.CoffeeDecorators;

import DecoratorDesignPattern.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() ;
    }

    @Override
    public double cost() {
        return coffee.cost();
    }
}
