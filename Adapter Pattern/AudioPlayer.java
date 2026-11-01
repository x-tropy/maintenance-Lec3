public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        // 内置支持 mp3 格式
        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("正在播放 MP3 文件：" + fileName);
        }
        // 通过适配器支持 vlc 和 mp4 格式
        else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("无效的媒体类型：" + audioType + "，不支持该格式。");
        }
    }
}
