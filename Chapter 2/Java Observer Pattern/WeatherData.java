import java.util.Observable;

public class WeatherData extends Observable {
    
    float humidity;
    float temperature;
    float pressure;

    public WeatherData() {}

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void measuremetsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;

        measuremetsChanged();
    }

}
