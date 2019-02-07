package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class robotGraffiti {
	public static void main(String[] args) {
		Robot megaman = new Robot();
		megaman.hide();
		megaman.setSpeed(10);
		megaman.penDown();
		megaman.setRandomPenColor();
		megaman.turn(-90);
		megaman.move(100);
		megaman.turn(90);
		megaman.move(100);
		megaman.turn(90);
		megaman.move(100);
	}

}
