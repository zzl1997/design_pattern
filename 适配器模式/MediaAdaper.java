package 适配器模式;

public class MediaAdaper implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaper(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer=new Mp4Player();
        }else if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer=new VlcPlayer();
        }

    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);

        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);

        }
    }
}
