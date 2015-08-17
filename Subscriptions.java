import javax.swing.*;


public class Subscriptions extends JFrame {
	String[] subs = { "0xDECAFBAD", "Cafe au Lait",
	"Hack the planet", "Ideoplex", "Inessential", "Intertwingly",
	"Markpasc", "Postneo, RC3", "Workbench" };
	Jlist subList = new JList(subs);
	
	
	super("Choose an Output Format");
	setSize(220, 150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel pane  = new JPanel();
	JLabel formatLabel = new JLabel("Output formats:");
	pane.add(formatLabel);
	pane.add(formatBox);
	add(pane);
	setVisible(true);
}
private static void setLookAndFeel() {
	try {
		UIManager.setLookAndFeel(  
				"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
				);
	} catch (Exception exc) {
		System.out.println(exc.getMessage());
	}
}

public static void main(String[] arguments) {
	FormatFrame2.setLookAndFeel();
	FormatFrame2 ff = new FormatFrame2();
}
}


	

public class Subscriptions {

}
