import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public static void main(String[] args) {
		int width = 30;
		Robot robot = new Robot("mini", 0, 500);
		robot.setPenWidth(5);
		robot.setSpeed(100);
		robot.setWindowColor(Color.BLACK);
		
		drawHouse(robot, 100, width, Color.RED);
		drawGrass(robot, width);

		for (int i = 0; i < 10; i++) {
			drawHouse(robot, (i+1)*30, width, Color.GREEN);
			drawGrass(robot, width);
		}

		drawHouse(robot, "small", Color.BLUE);
		drawGrass(robot, width);
		drawHouse(robot, "medium", Color.BLUE);
		drawGrass(robot, width);
		drawHouse(robot, "large", Color.BLUE);
		drawGrass(robot, width);		
	}
	
	public static void drawGrass(Robot robot, int width) {
		robot.setPenColor(new Color(0x008800));
		robot.setAngle(90);
		robot.penDown();
		robot.move(width);
		robot.penUp();
	}
	
	public static void drawHouse(Robot robot, int height, int width, Color color) {
		if (height < 250) {
			System.out.println("peaked " + height);
			drawHouse(robot, height, width, true, color);
		} else {
			System.out.println("flat " + height);
			drawHouse(robot, height, width, false, color);
		}
			
	}
	
/*	public static void drawHouse(Robot robot, int height, int width, Color color) {
		robot.setAngle(0);
		robot.setPenColor(color);
		robot.penDown();
		robot.move(height);
		robot.turn(90);
		robot.move(width);
		robot.turn(90);
		robot.move(height);
		robot.penUp();
	}*/
	
	public static void drawHouse(Robot robot, int height, int width, boolean pointyRoof, Color color) {
		robot.setAngle(0);
		robot.setPenColor(color);
		robot.penDown();
		robot.move(height - width/2);

		if (pointyRoof) {
			drawPointyRoof(robot, width, color);
		} else {
			drawFlatRoof(robot, width, color);
		}
		
		robot.move(height - width/2);
		robot.penUp();		
	}	

	public static void drawHouse(Robot robot, String size, Color color) {
		int width = 30;
		int height = 0;
		boolean pointyRoof = true;
		
		if (size.equals("small")) {
			height = 60;
		} else if (size.equals("medium")) {
			height = 120;
		} else if (size.equals("large")) {
			height = 250;
			pointyRoof = false;
		}
		
		drawHouse(robot, height,  width, pointyRoof, color);
	}
	
	public static void drawFlatRoof(Robot robot, int width, Color color) {
		robot.move(width/2);
		robot.turn(90);
		robot.move(width);
		robot.turn(90);
		robot.move(width/2);
	}
	
	public static void drawPointyRoof(Robot robot, int width, Color color) {
		robot.turn(45);
		// use pythagorean theorem to get distance for sloped roof
		Double d = Math.sqrt(width/2*width/2 + width/2*width/2);
		int roofDistance = d.intValue();
		robot.move(roofDistance);
		robot.turn(90);
		robot.move(roofDistance);
		robot.turn(45);
	}
}
