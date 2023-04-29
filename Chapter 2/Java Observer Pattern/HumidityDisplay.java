import java.util.Observable;
import java.util.Observer;

public class HumidityDisplay implements Observer{
    
    Observable sub;
    float humidity;

    public HumidityDisplay() {}

    public HumidityDisplay(Observable sub) {
        this.sub = sub;
        sub.addObserver(this);
    }
    
    public void update(Observable sub, Object x) {
        if(sub instanceof WeatherData) {
            WeatherData wd = (WeatherData)sub;
            humidity = wd.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Humidity is around: " + humidity);
    }
}
