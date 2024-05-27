/**
 * author: akhilpathivada
 * time: 27/05/24 09:21
 */
package observer;

public class CurrentWeatherConditionsDisplay implements Observer {

    private int temperature;

    private int humidity;

    public CurrentWeatherConditionsDisplay(Observable observable) {
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("current. stats = " + temperature + ", " + humidity);
    }
}
