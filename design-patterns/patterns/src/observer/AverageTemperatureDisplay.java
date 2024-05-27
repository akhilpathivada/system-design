/**
 * author: akhilpathivada
 * time: 27/05/24 09:18
 */
package observer;

public class AverageTemperatureDisplay implements Observer {

    private int sumOfTemperatures;

    private int totalTemperatures;

    public AverageTemperatureDisplay(Observable observable) {
        this.sumOfTemperatures = 0;
        this.totalTemperatures = 0;
        observable.registerObserver(this);
    }

    @Override
    public void update(int temperature, int humidity) {
        sumOfTemperatures += temperature;
        ++totalTemperatures;
        display();
    }

    private void display() {
        System.out.println("avg. temperature = " + sumOfTemperatures / totalTemperatures);
    }
}
