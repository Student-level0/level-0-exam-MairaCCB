

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
public static void main(String[] args) {
	String age = JOptionPane.showInputDialog("How old are you?");
	Integer.parseInt(age);
	int year = 2018; //- age
	JOptionPane.showMessageDialog(null, "You were born in the year "); //year

	if(age >= 30) {
	JOptionPane.showMessageDialog(null, "Your are too old to paly this game.");
}

else{
	JOptionPane.showMessageDialog(null, "You are the perfect age to play this game.");
}
}
}


