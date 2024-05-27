/**
 * author: akhilpathivada
 * time: 27/05/24 09:25
 */
package observer;

public class Demo {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        CurrentWeatherConditionsDisplay currentWeatherConditionsDisplay = new CurrentWeatherConditionsDisplay(weatherStation);
        AverageTemperatureDisplay averageTemperatureDisplay = new AverageTemperatureDisplay(weatherStation);

        weatherStation.change(20, 10);
        weatherStation.change(10, 50);
    }
}
