package dp.AdaptorDesignPattern;

public class AudioPlayer implements MediaPlayer {
	
	@Override
	public void play(String audioType, String fileName) {
		
		Adaptor adaptor = new Adaptor(audioType);
		
		adaptor.play(audioType, fileName);
		
		
	}

}
