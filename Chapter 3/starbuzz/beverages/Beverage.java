package beverages;
public abstract class Beverage {

    public enum Size {TALL, GRADNE, VENTI}
    Size size = Size.TALL;

    String description = "Unknown Description";
    // float cost;
    
    public String getDescription() {
        return description + ", " + size;
    }

    public Size getSize() {

        return size;
    }

    public void setSize(Size s) {
        size = s;
    }

    public abstract float cost();
}
