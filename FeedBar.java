import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class FeedBar extends JFrame  {
	
	public FeedBar() {
		super ("FeedBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFeel();
		//create icons
		ImageIcon loadIcon = new ImageIcon("C:/Users/GC 18/Desktop/ICON/load.gif");
		ImageIcon saveIcon = new ImageIcon("C:/Users/GC 18/Desktop/ICON/save.gif");
		ImageIcon subscribeIcon = new ImageIcon("C:/Users/GC 18/Desktop/ICON/subscribe.gif");
	    ImageIcon unsubscribeIcon = new ImageIcon("C:/Users/GC 18/Desktop/ICON/unsubscribe.gif");
		// create buttons
		JButton  load = new JButton ("Load", loadIcon);
		JButton save = new JButton ("Save", saveIcon);
		JButton subscribe = new JButton ("subscribe", subscribeIcon);
		JButton unsubscribe = new JButton ("Unsubscribe", unsubscribeIcon);
		// add button to toolbar
		JToolBar bar = new JToolBar();
		bar.add(load);
		bar.add(save);
		bar.add(subscribe);
		bar.add(unsubscribe);
		// prepare user interface
		JTextArea edit = new JTextArea(8, 40);
		JScrollPane scroll = new JScrollPane(edit);
		BorderLayout bord = new BorderLayout();
		setLayout(bord);
		add("North", bar);
		add("Center", scroll);
		pack();
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try { 
			UIManager.setLookAndFeel( 
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
					);
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.err.println("Couldn't use the system "
					+ "look and feel: " + e);
		}
	}
			
	    public static void main (String[] args) {
		    FeedBar frame = new FeedBar();  
		    }
	}
		




