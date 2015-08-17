import java.awt.*;
import javax.swing.*;


public class FeedBar2 extends JFrame {
	
		
		public FeedBar2() {
			super ("FeedBar 2");
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
			//create menu
			JMenuItem j1 = new JMenuItem("Load");
			JMenuItem j2 = new JMenuItem("Save");
			JMenuItem j3 = new JMenuItem("Subscribe");
			JMenuItem j4 = new JMenuItem("Unsubscribe");
			JMenuBar menubar = new JMenuBar();
			JMenu menu = new JMenu("Feeds");
			menu.add(j1);
			menu.add(j2);
			menu.addSeparator(); 
			menu.add(j3);
			menu.add(j4);
			menubar.add(menu);
			//prepare user interface
			JTextArea edit = new JTextArea(8, 40);
			JScrollPane scroll = new JScrollPane(edit);
			BorderLayout bord = new BorderLayout();
			setLayout(bord);
			add("North", bar);
			add("Center", scroll);
			setJMenuBar(menubar);
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
			    FeedBar2 frame = new FeedBar2();  
			    }
		}
			