package designmode.adapter;

/**
 * mp4 具体类
 *
 * @author cxc
 * @date 2018/12/10 15:32
 */
public class Mp4 implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("暂无MP3功能");

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放MP4" + fileName);
    }
}
