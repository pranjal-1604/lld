package DecoratorDesignPattern;

import DecoratorDesignPattern.CoffeeDecorators.CoffeeDecorator;
import DecoratorDesignPattern.CoffeeDecorators.ConcreteDecorators.MilkDecorator;
import DecoratorDesignPattern.CoffeeDecorators.ConcreteDecorators.SugarDecorator;
import DecoratorDesignPattern.CoffeeDecorators.ConcreteDecorators.VanillaDecorator;
import DecoratorDesignPattern.ConcreteCoffeeTypes.Cappuchino;
import DecoratorDesignPattern.ConcreteCoffeeTypes.Espresso;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new Cappuchino();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription());
        System.out.println(coffee.cost());
        Coffee anotherCoffee  = new Espresso();
        anotherCoffee = new VanillaDecorator(anotherCoffee);
        anotherCoffee = new MilkDecorator(anotherCoffee);
        System.out.println(anotherCoffee.getDescription());
        System.out.println(anotherCoffee.cost());
        }
    }

