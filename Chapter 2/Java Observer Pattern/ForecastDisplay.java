import java.util.Observable;
import java.util.Observer;

class ForecastDisplay implements Observer {

    Observable sub; // Because If I What To Unsubscribe
    float lastPressure;
    float currentPressure = 29.92f;

    public ForecastDisplay() {}

    public ForecastDisplay(Observable sub) {
        this.sub = sub;
        this.sub.addObserver(this);
    }

    public void update(Observable sub, Object x) {
        if(sub instanceof WeatherData) {
            WeatherData wd = (WeatherData) sub;
            lastPressure = currentPressure;
            currentPressure = wd.getPressure();
            display();   
        }

    }


    public void display() {
        System.out.println(String.format("Forecast is around: %.2f / %.2f", currentPressure, lastPressure));
    }

    
}