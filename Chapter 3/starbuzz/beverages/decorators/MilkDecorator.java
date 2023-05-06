package beverages.decorators;
import beverages.Beverage;

public class MilkDecorator extends CondimentDecorator{
    
    float costTall = .10f;
    float costGrande = .15f;
    float costVenti = .20f;

    
    public MilkDecorator(Beverage b) {
        this.beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public float cost() {
        if (getSize() == Size.TALL) {

            return costTall + beverage.cost();
        
        }else if (getSize() == Size.GRADNE) {
            
            return costGrande + beverage.cost();
        
        }else {

            return costVenti + beverage.cost();
        }
        
    }

}
