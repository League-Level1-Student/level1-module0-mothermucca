import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		new FortuneCookie().showButton();

	}
	
	public void showButton() {
		System.out.println("Button");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String fortune = "Woohoo";
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			fortune = "A beautiful, smart, and loving person will be coming into your life.";
		} else if (rand == 1) {
			fortune = "A dubious friend may be an enemy in camouflage.";
		} else if (rand == 2) {
			fortune = "A faithful friend is a strong defense.";
		} else if (rand == 3) {
			fortune = "A feather in the hand is better than a bird in the air.";
		} else if (rand == 4) {
			fortune = "A fresh start will put you on your way.";
		}
		JOptionPane.showMessageDialog(null, fortune);
	}

}
