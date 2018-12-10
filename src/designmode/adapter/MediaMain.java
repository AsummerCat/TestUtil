package designmode.adapter;

/**
 * 适配器测试demo
 * @author cxc
 * @date 2018/12/10 15:37
 */
public class MediaMain {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("vlc", "呵呵呵");
        audioPlayer.play("mp3", "呵呵呵");
        audioPlayer.play("mp3", "呵呵呵");
        audioPlayer.play("mp4", "呵呵呵");

    }
}
