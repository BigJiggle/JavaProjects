import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");
		
		JOptionPane.showMessageDialog(null, "Hello " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Now, " + name + " Enter your age"));
		
		if(age>45) {
			JOptionPane.showMessageDialog(null, "Wow, you're " +age + " years old. " + " You're old!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You're " + age + " years old. " + "Pretty young, I guess.");
		}
		
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Now, " + name + " Enter your height(cm)"));
		
		if(height>70) {
			JOptionPane.showMessageDialog(null, "Wow,you are " +height +" centimeters tall "+ "you're tall for being " +age + " years old! ");
		}
		else {
			JOptionPane.showMessageDialog(null, "You're " + height + " centimeters tall ");
		}
		
		
		
	}

}
