/**
 * author: akhilpathivada
 * time: 05/05/24 10:10
 */
package strategy.netlix;

public abstract class VideoPlayer {

    Device device;

    Resolution resolution;

    abstract void displayVideo();

    public Device getDevice() {
        return device;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
