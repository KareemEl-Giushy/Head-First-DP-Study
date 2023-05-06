import beverages.*;
import beverages.Beverage.Size;
import beverages.decorators.*;

class Main {
    public static void main(String[] args) {
        // System.out.println("Hello, Kareem");

        Beverage b1 = new DarkRoasted("Dark Roasted Coffee");
        b1 = new MochaDecorator(b1);
        b1 = new MochaDecorator(b1);
        b1 = new MilkDecorator(b1);
    

        System.out.println(b1.getDescription() + " $" + b1.cost());

        
        Beverage b2 = new DarkRoasted("Dark Roasted Coffee", Size.GRADNE);
        b2 = new MochaDecorator(b2);
        b2 = new MochaDecorator(b2);
        b2 = new MilkDecorator(b2);

        System.out.println(b2.getDescription() + " $" + b2.cost());

        
        Beverage b3  = new DarkRoasted("Dark Roasted Coffee", Size.VENTI);
        b3 = new  MochaDecorator(b3);
        b3 = new  MochaDecorator(b3);
        b3 = new  MilkDecorator(b3);


        System.out.println(b3.getDescription() + " $" + b3.cost());
    
    }
}