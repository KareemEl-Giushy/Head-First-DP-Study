package beverages;
public class DarkRoasted extends Beverage{
    
    float cost = 0.11f;

    public DarkRoasted(String description, Size s) {
        this.description = description;
        this.size = s;
    }

    public DarkRoasted(String description) {
        this.description = description;
    }
    
    public DarkRoasted(float c) {
        cost = c;
    }

    public DarkRoasted(String description, float c) {
        cost = c;
        this.description = description;
    }
    
    @Override
    public float cost() {
        return cost;
    }
}
