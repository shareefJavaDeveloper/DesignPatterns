package dp.AdaptorDesignPattern;

public class Adaptor implements MediaPlayer {
	
	/**
	 * This should be the adaptor class that connect media player to the latest media player to play different formats.
	 */
	
	public Adaptor() {
		
	}
	
	LatestMediaPlayer latestMediaPlayer;
	
	public Adaptor(String audioType) {
		
		if(audioType.equalsIgnoreCase("VLC")) {
			latestMediaPlayer = new VLC();
		}
		else if(audioType.equalsIgnoreCase("MP4")) {
			latestMediaPlayer = new MP4();
		}
		
	}

	@Override
	public void play(String audioType, String fileName) {
		
		latestMediaPlayer.play(fileName);
		
	}
	
	

}
