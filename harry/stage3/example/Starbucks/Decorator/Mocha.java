package example.Starbucks.Decorator;

import example.Starbucks.Beverage;
import example.Starbucks.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) cost += .10;
        else if (beverage.getSize() == Size.GRANDE) cost += .15;
        else if (beverage.getSize() == Size.VENTI) cost += .20;
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
