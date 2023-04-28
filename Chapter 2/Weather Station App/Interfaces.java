interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();
}

interface IObserver {
    public void update(float humidity, float temp, float pressure); // What to update exactly (Needs Parameters)
}

interface IDisplayElement {
    public void display();
}