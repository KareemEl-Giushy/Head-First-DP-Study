package beverages.decorators;
import beverages.Beverage;

abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    @Override
    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
    
}
