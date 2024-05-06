/**
 * author: akhilpathivada
 * time: 05/05/24 10:18
 */
package strategy;

public class TVVideoPlayer extends VideoPlayer {


    public TVVideoPlayer(Device device, Resolution resolution) {
        this.device = device;
        this.resolution = resolution;
    }

    @Override
    public void displayVideo() {
        this.getDevice().getDevice();
        this.getResolution().getResolution();
    }
}
