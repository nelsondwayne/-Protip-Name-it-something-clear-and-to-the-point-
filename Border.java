import java.awt.*;
import javax.swing.*;

public class Border extends JFrame {

	public Border() {
		super("Border");
		setSize(240, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLookAndFee1();
		setLayout(new BorderLayout());
		JButton nButton = new JButton("North");
		JButton sButton = new JButton("South");
		JButton eButton = new JButton("East");
		JButton wButton = new JButton("West");
		JButton cButton = new JButton("Center");
		add (nButton, BorderLayout.NORTH);
		add(sButton, BorderLayout.SOUTH);
		add(eButton, BorderLayout.EAST);
		add(wButton, BorderLayout.WEST);
		add(cButton, BorderLayout.CENTER);
        setVisible(true);
	}

	private void setLookAndFee1() {
		// TODO Auto-generated method stub
		
	}
}

	
