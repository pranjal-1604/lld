package DecoratorDesignPattern.CoffeeDecorators.ConcreteDecorators;

import DecoratorDesignPattern.Coffee;
import DecoratorDesignPattern.CoffeeDecorators.CoffeeDecorator;

public class VanillaDecorator extends CoffeeDecorator {
    public VanillaDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " vanilla";
    }

    @Override
    public double cost() {
        return super.cost() + 0.75;
    }
}
