package DecoratorDesignPattern.CoffeeDecorators.ConcreteDecorators;

import DecoratorDesignPattern.Coffee;
import DecoratorDesignPattern.CoffeeDecorators.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " milk";
    }

    @Override
    public double cost() {
        return super.cost() + 0.5;
    }


}
