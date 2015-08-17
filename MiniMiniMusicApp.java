

import javax.sound.midi.*;

public class MiniMiniMusicApp {
	public static void main (String[] arguments) {
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
	} // close main
	
	public void play(){ 
		try { 
			 Sequencer player = MidiSystem.getSequencer();
             player.open();
            
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            
            // music played as messages-set the instrument,
            // set the message (music note), add it to the track, set the seq
            // start the player
            
            
            // -- message 192 says change the instrument
            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, 102, 0); // - default is piano, 102 is sax
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);
            
            // 144 = message type
            // 1 = channel - musician 1
            // 44 = note to play (0 - 127 low to high)
            // 100 = velocity(how hard and fast to press the key
            
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 1); // duration
            track.add(noteOn);  // start playing
            
            ShortMessage b = new ShortMessage();
            a.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);  // stop playing
            
            player.setSequence(seq);
            player.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	} // end play
} // class close
		
            
            
            
            
            
            

