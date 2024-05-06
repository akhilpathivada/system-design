/**
 * author: akhilpathivada
 * time: 05/05/24 10:21
 */
package strategy;

public class Demo {

    public static void main(String[] args) {
        VideoPlayer videoPlayer = new PhoneVideoPlayer(new Phone(), new Res480p());
        videoPlayer.displayVideo();

        videoPlayer = new TVVideoPlayer(new TV(), new Res720p());
        videoPlayer.displayVideo();
    }
}
