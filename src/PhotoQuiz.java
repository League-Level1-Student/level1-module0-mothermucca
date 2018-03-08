/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String turtleImageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Galapagos_giant_tortoise_Geochelone_elephantopus.jpg/220px-Galapagos_giant_tortoise_Geochelone_elephantopus.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component turtleImageComponent;

		// 3. use the "createImage()" method below to initialize your Component
		turtleImageComponent = createImage(turtleImageUrl);

		// 4. add the image to the quiz window
		quizWindow.add(turtleImageComponent);

		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		String headsResponse = JOptionPane.showInputDialog("How many heads does the beast have?");
		int heads = Integer.parseInt(headsResponse);
		
		// 7. print "CORRECT" if the user gave the right answer
		// 8. print "INCORRECT" if the answer is wrong
		if (heads == 1) {
			JOptionPane.showMessageDialog(quizWindow, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(quizWindow, "INCORRECT");
		}

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(turtleImageComponent);

		// 10. find another image and create it (might take more than one line of code)
		Component dragonImageComponent = createImage("https://ffbe.kongbakpao.com/wp-content/uploads/2016/12/twoheadeddragon.png");
		// 11. add the second image to the quiz window
		quizWindow.add(dragonImageComponent);

		// 12. pack the quiz window
		quizWindow.pack();

		// 13. ask another question
		int dragonHeads = Integer.parseInt(JOptionPane.showInputDialog("How many heads does the beast have?"));
		
		// 14+ check answer, say if correct or incorrect, etc.		
		if (dragonHeads == 2) {
			JOptionPane.showMessageDialog(quizWindow, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(quizWindow, "INCORRECT");
		}


	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





