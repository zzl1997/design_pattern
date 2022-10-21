package 适配器模式;

public class AudioPlayer implements  MediaPlayer{
    MediaAdaper mediaAdaper;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing " +fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdaper =new MediaAdaper(audioType);
            mediaAdaper.play(audioType,fileName);

        }
    }
}
