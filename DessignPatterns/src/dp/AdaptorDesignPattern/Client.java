package dp.AdaptorDesignPattern;

public class Client {
	
	/**
	 * Adaptor design pattern is all about structural design pattern.
	 * This pattern allows incompatible objects to be collaborated.
	 * It mostly focus on the connecting objects which are different in nature using interfaces.
	 */
	
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("VLC","SAREGAMAPA");
		
	}

}
