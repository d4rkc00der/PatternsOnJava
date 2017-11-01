package Decorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;
    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
