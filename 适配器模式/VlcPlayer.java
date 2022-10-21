package 适配器模式;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("playing hifi Vlc");

    }

    @Override
    public void playMp4(String fileName) {

    }
}
