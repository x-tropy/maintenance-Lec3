public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("正在播放 VLC 文件：" + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // VLC 播放器不处理 MP4，什么也不做
    }
}
