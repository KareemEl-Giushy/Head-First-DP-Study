class CurrentConditionDisplay implements IObserver, IDisplayElement {
    
    float temperature;
    float humidity;
    ISubject sub = null;

    public CurrentConditionDisplay() {}

    public CurrentConditionDisplay(ISubject sub) {
        this.sub = sub;
        this.sub.registerObserver(this);
    }

    public void update(float humidity, float temp, float pressure) {
        temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display () {
        System.out.println(String.format("The Temperature is: %f and Humidity: %f", temperature, humidity));
    }
}
