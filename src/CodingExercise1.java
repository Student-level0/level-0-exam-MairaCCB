import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

	public static void main(String[] args) {
		Robot r = new Robot();
		// 3. ask the user what color they would like the Robot to draw
		String color = JOptionPane.showInputDialog("What color would you like your shape to be?(blue or red)");
		// 4. use an if/else statement to set the pen color that the user requested
		// (minimum of 2 colors)
		if(color.equals("blue")) {
			r.setPenColor(Color.BLUE);
		}
		else if(color.equals("red")) {
			r.setPenColor(Color.RED);
		}
		// 2. set the pen width to 10
		r.setPenWidth(10);
		// 1. make the Robot draw a shape
		r.miniaturize();
		r.penDown();
		r.setSpeed(20);
		for (int x = 1; x < 5; x++) {
			r.move(50);
			r.turn(90);
		}
	}

}
