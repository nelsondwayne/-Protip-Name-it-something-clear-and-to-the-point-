package swing;
import javax.swing.*;

public class IconFrame extends JFrame {
	JButton load, save, subscribe, unsubscribe;
	
   public IconFrame() {
	   super("Icon Frame");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   JPanel panel = new JPanel ();
	   //create icons
	  ImageIcon loadIcon = new ImageIcon("C:/Users/GC 18/Desktop/Icons");
	  ImageIcon saveIcon = new ImageIcon("C:/Users/GC 18/Desktop/Icons");
	  ImageIcon subscribeIcon = new ImageIcon("C:/Users/GC 18/Desktop/Icons");
	  ImageIcon unsubscribeIcon = new ImageIcon("C:/Users/GC 18/Desktop/Icons");
      // create buttons
	  load = new JButton ("load", loadIcon);
	  save = new JButton ("Save", saveIcon);
	  subscribe = new JButton ("subcribe", subscribeIcon);
	unsubscribe = new JButton ("unsubscribe, unsubscribeIcon");
	//add buttons to panel
	panel.add(load);
	panel.add(save);
	panel.add(subscribe);
	panel.add(unsubscribe);
	// add the panel to a frame
	add(panel);
	pack();
	setVisible(true);
   }
   public static void main (String[] agruments){
	   IconFrame ike = new IconFrame();
	   
			}
			
	}
