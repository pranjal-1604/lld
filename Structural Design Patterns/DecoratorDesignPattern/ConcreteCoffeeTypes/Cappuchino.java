package DecoratorDesignPattern.ConcreteCoffeeTypes;

import DecoratorDesignPattern.Coffee;

public class Cappuchino implements Coffee {
    @Override
    public String getDescription() {
        return "Cappuchino";
    }

    @Override
    public double cost() {
        return 3.00;
    }
}
