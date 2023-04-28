import java.util.ArrayList;

public class WeatherData implements ISubject{
    
    public ArrayList<IObserver> observers;

    float humidity;
    float temperature;
    float pressure;

    public WeatherData() {
      observers = new ArrayList<IObserver>();
    }
    
    public void registerObserver(IObserver o) {
        observers.add(o);
    }
    public void removeObserver(IObserver o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (IObserver obs : observers) {
            obs.update(humidity, temperature, pressure);   
        }
    }

    public float getHumidity() {

        return humidity;
    } 
    
    public float getTemp() {
        
        return temperature;
    }

    public float getPressure() {

        return pressure;
    }

    void measurementsChanged() {
        notifyObservers();
    }

    public void changeMeasurements(float humidity, float temperature, float pressure) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.pressure = pressure;

        measurementsChanged();
    }
}
