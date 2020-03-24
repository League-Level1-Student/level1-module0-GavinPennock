package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortuneCookie implements ActionListener {
	public void showButton() {
		
		JFrame jframe=new JFrame();
		 jframe.setVisible(true);
		 JButton button = new JButton("click me");
		    jframe.add(button);
		    jframe.pack();
		    button.addActionListener(this);
	    System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		if(rand==0) {
		JOptionPane.showMessageDialog(null, "you will go to the hospital today");
		}else if(rand==1){
			JOptionPane.showMessageDialog(null, "today is a good day to stay in bed");
	}else if(rand==2) {
		JOptionPane.showMessageDialog(null, "you don't want to know");
	}else if(rand==3) {
		JOptionPane.showMessageDialog(null, "ow! why did you hit me?!");
	}else {
		JOptionPane.showMessageDialog(null, "you will get scammed");
	}
}
}
