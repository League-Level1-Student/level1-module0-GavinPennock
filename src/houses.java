import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	public static void main(String[] args) {
		Robot rob = new Robot();
		Robot.setWindowSize(1000, 500);
		rob.setSpeed(10000);
		rob.miniaturize();
		rob.setX(50);
		rob.setY(450);
		for(int i=0; i<9; i++) {
		Random ran=new Random();
		int r=ran.nextInt(300)+50;
		drawHouse(rob, "big");
		}
	}
	
	public static void drawHouse(Robot bob, int height) {
		bob.penDown();
		bob.setPenColor(128, 70, 0);
		bob.move(height);
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
		bob.move(height);
		bob.turn(-90);
		bob.setPenColor(0, 1000, 0);
		bob.move(30);
		bob.turn(-90);
	}
	public static void drawHouse(Robot bob, String height) {
		if(height.equals("small")) {
			drawHouse(bob, 50);
		}else if(height.equals("medium")) {
			drawHouse(bob, 125);
		}else if(height.equals("big")) {
			drawHouse(bob, 225);
		}
	}
	}

