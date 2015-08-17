//musical Instrument Digital Interface
import javax.sound.midi.*;

public class MusicTest {
	public void play() {
		
		try { 
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequencer");
		} catch (MidiUnavailableException ex) {
			System.out.println("Didn't get one");
		}
	}// close play
	
	public static void main (String[] args) {
		MusicTest mt = new MusicTest();
		mt.play();
		
	}

}
