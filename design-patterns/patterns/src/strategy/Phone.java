/**
 * author: akhilpathivada
 * time: 05/05/24 10:13
 */
package strategy;

public class Phone implements Device {

    @Override
    public void getDevice() {
        System.out.println("Playing video on Phone");
    }
}
