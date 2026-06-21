package DecoratorDesignPattern.CoffeeDecorators.ConcreteDecorators;

import DecoratorDesignPattern.Coffee;
import DecoratorDesignPattern.CoffeeDecorators.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " sugar";
    }

    @Override
    public double cost() {
        return super.cost() + 0.25;
    }
}
