package beverages.decorators;

import java.util.HashMap;
import java.util.Map;
import beverages.Beverage;

public class MochaDecorator extends CondimentDecorator{
    
    Map<Size, Float> cost = new HashMap<Size, Float>();

    public MochaDecorator(Beverage b) {
        beverage = b;
        cost.put(Size.TALL, 0.99f);
        cost.put(Size.GRADNE, 1.f);
        cost.put(Size.VENTI, 1.5f);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        if(getSize() == Size.TALL){ 

            return cost.get(Size.TALL) + beverage.cost();

        }else if (getSize() == Size.GRADNE){

            return cost.get(Size.GRADNE) + beverage.cost();

        }else {

            return cost.get(Size.VENTI) + beverage.cost();
        }

    }

}
