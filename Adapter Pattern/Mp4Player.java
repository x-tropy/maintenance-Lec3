public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // MP4 播放器不处理 VLC，什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("正在播放 MP4 文件：" + fileName);
    }
}
