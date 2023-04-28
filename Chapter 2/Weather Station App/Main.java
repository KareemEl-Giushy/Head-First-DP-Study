class Main {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        new HeatIndexDisplay(weatherData);

        try{

            
            weatherData.changeMeasurements(10, 23, 15);
            
            Thread.sleep(1000);
            
            weatherData.changeMeasurements(6, 25, 10);
      
            Thread.sleep(1000);
      
            weatherData.changeMeasurements(8, 26, 6);
      
            Thread.sleep(1000);
      
            weatherData.changeMeasurements(26, 30, 3);
      
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}