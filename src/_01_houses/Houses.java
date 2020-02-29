package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob = new Robot();
		Robot.setWindowSize(1000, 500);
		rob.setSpeed(10000);
		rob.miniaturize();
		rob.setX(50);
		rob.setY(450);
		for(int i=0; i<9; i++) {
		Random ran=new Random();
		int r=ran.nextInt(300)+50;
		drawHouse1(rob, 100,"red");
		}
	}
	public static void spikedRoof(Robot bob) {
		bob.turn(45);
		bob.move(10);
		bob.turn(90);
		bob.move(10);
		bob.turn(45);
	}
	public static void flatRoof(Robot bob) {
		bob.turn(90);
		bob.move(30);
		bob.turn(90);
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
	public static void drawHouse1(Robot bob, String height) {
		if(height.equals("small")) {
			drawHouse(bob, 50);
		}else if(height.equals("medium")) {
			drawHouse(bob, 125);
		}else if(height.equals("big")) {
			drawHouse(bob, 225);
		}
	}
	public static void drawHouse1(Robot bob,int height, String color) {
		Random ran=new Random();
		int r=ran.nextInt(300)+50;
		if(color.equals("red")) {
			bob.penDown();
			bob.setPenColor(1000,0, 0);
			bob.move(r);
			if(r<150) {
				spikedRoof(bob);
			}else if(r<200&&r>150){
				flatRoof(bob);
			}else {
				flatRoof(bob);
			}
			bob.move(r);
			bob.turn(-90);
			bob.setPenColor(0, 1000, 0);
			bob.move(30);
			bob.turn(-90);
		}else if(color.equals("green")) {
			bob.penDown();
			bob.setPenColor(0,1000, 0);
			bob.move(r);
			if(r<150) {
				spikedRoof(bob);
			}else if(r<200&&r>150){
				flatRoof(bob);
			}else {
				flatRoof(bob);
			}
			bob.move(r);
			bob.turn(-90);
			bob.setPenColor(0, 1000, 0);
			bob.move(30);
			bob.turn(-90);
		}else {
			bob.penDown();
			bob.setPenColor(0,0, 1000);
			bob.move(r);
			if(r<150) {
				spikedRoof(bob);
			}else if(r<200&&r>150){
				flatRoof(bob);
			}else {
				flatRoof(bob);
			}
			bob.move(r);
			bob.turn(-90);
			bob.setPenColor(0, 1000, 0);
			bob.move(30);
			bob.turn(-90);
		}
}
}
