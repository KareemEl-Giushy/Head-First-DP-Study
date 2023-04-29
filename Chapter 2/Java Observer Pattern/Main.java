public class Main {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        new HumidityDisplay(wd);
        new ForecastDisplay(wd);
        
        try{

            wd.setMeasurements(20, 30, 40);
            
            Thread.sleep(1000);
            
            wd.setMeasurements(13, 29, 20);
            
            Thread.sleep(1000);
            
            wd.setMeasurements(10, 21, 26);
            
            Thread.sleep(1000);
            
            wd.setMeasurements(3, 18, 30);
        
        }catch (InterruptedException e) {
            System.out.println(e);
        }
    }

}
