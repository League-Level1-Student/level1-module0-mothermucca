/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
	public static void main(String[] args) {
		new SoundEffectsMachine().createUI();
	}

	JButton drumButton = new JButton();
	JButton cymbalButton = new JButton();
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drumButton.setText("Drum!");
		cymbalButton.setText("Cymbals!");
		drumButton.addActionListener(this);
		cymbalButton.addActionListener(this);
		panel.add(drumButton);
		panel.add(cymbalButton);
		frame.pack();
		frame.setTitle("Sound Effects Machine");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(drumButton)) {
			playSound("drum.wav");
		} else {
			playSound("cymbal.wav");
		}

	}

	
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();
	}
}


