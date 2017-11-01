package Decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
