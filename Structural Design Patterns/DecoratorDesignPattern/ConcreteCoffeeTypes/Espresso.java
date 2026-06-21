package DecoratorDesignPattern.ConcreteCoffeeTypes;

import DecoratorDesignPattern.Coffee;

public class Espresso implements Coffee {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
