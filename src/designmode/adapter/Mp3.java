package designmode.adapter;

/**
 * mp3 具体类
 *
 * @author cxc
 * @date 2018/12/10 15:32
 */
public class Mp3 implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放MP3" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("暂无MP4功能");

    }
}
