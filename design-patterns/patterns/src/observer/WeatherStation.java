/**
 * author: akhilpathivada
 * time: 14/05/24 12:50
 */
package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private final List<Observer> observers;

    private int temperature;

    private int humidity;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity));
    }

    public void change(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }
}
