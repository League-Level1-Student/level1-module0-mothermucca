/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	
	public static void main(String[] args) {
		new CutenessTV().createUI();
	}

	JButton duckButton = new JButton();
	JButton frogButton = new JButton();
	JButton fluffyUnicornButton = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		duckButton.setText("Duck!");
		frogButton.setText("Frog!");
		fluffyUnicornButton.setText("Fluffy Unicorn!");
		duckButton.addActionListener(this);
		frogButton.addActionListener(this);
		fluffyUnicornButton.addActionListener(this);
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(fluffyUnicornButton);
		frame.pack();
		frame.setTitle("Cuteness TV");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(duckButton)) {
			showDucks();
		} else if ( buttonPressed.equals(frogButton)) {
			showFrog();
		} else {
			showFluffyUnicorns();
		}

	}

	
	void showDucks() {
	     playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
	     playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
	     playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI("https://youtu.be/" + videoID + "?autoplay=1");
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}

