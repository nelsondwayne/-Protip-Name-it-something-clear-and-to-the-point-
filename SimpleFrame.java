import javax.swing.*;

public class SimpleFrame extends JFrame {
	public SimpleFrame() {
	super ("My 1st frame");
    setSize(300, 100);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLookAndFeel();
	setVisible(true);
}
private static void setLookAndFeel() {
	try {
		UIManager.setLookAndFeel(
				"com.un.java.swing.plaf.nimbus.NimbusLookAndFeel"
				);
	} catch (Exception exc) {
		//ignoree error
	}
}
public static void main (String[] srguments) {
	setLookAndFeel();
	SimpleFrame sf = new SimpleFrame();
	}

}

	