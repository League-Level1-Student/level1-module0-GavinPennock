package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String URL = "https://i.pinimg.com/originals/62/7f/89/627f89ef694002c3d8b912a96b9f76ef.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component component;
		// 3. use the "createImage()" method below to initialize your Component
		component = createImage(URL);
		// 4. add the image to the quiz window
		quizWindow.add(component);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog(null, "is the animal more of a horse or a shark?");
		// 7. print "CORRECT" if the user gave the right answer
		if (answer.equals("horse")) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!");
		} else {
			JOptionPane.showMessageDialog(null, "incorrect!!!");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(component);
		// 10. find another image and create it (might take more than one line
		// of code)
		String URL2 = "https://puppybunnyguineapretty.files.wordpress.com/2013/06/photoshopchimera-4.jpg";
		// 11. add the second image to the quiz window
		Component component2;
		component2 = createImage(URL2);
		quizWindow.add(component2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answer2=JOptionPane.showInputDialog("is this animal more normal than the last?");
		// 14+ check answer, say if correct or incorrect, etc.
if(answer2.equals("they are both equally strange")) {
	JOptionPane.showMessageDialog(null, "you smaort");
}else {
	JOptionPane.showMessageDialog(null, "they are equally strange.");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
