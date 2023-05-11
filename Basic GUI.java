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
/* GUI VERSION
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		int whatSide = Integer.parseInt(JOptionPane.showInputDialog("If you want to find the hypotnuse, press 1\n"+"If you want to find the side of X press 2\n"+"If you want to find Y, press 3\nIf you want a random x and y for a random hypotnuse, press 4"));
		
		
		Random random = new Random();
		//Hypotnuse
		
		
		
		if(whatSide == 1) {
			x = Double.parseDouble(JOptionPane.showInputDialog("Enter X Value"));
			y = Double.parseDouble(JOptionPane.showInputDialog("Enter Y Value"));
			
			z = Math.sqrt((x*x) + (y*y));
			
			JOptionPane.showMessageDialog(null,"The hypotnuse is: "+z);
		} else if(whatSide == 2) {
			//X
			y = Double.parseDouble(JOptionPane.showInputDialog("Enter Y Value"));
			z = Double.parseDouble(JOptionPane.showInputDialog("Enter Z Value"));
			
			x = Math.sqrt((z*z) - (y*y));
			JOptionPane.showMessageDialog(null,"The X is: "+x);
		} else if(whatSide == 3) {
			//Y
			x = Double.parseDouble(JOptionPane.showInputDialog("Enter X Value"));
			z = Double.parseDouble(JOptionPane.showInputDialog("Enter Z Value"));
			
			y = Math.sqrt((z*z) - (x*x));
			JOptionPane.showMessageDialog(null,"The Y is: "+y);
		} else if(whatSide == 4) {
			int xr = random.nextInt(300);
			int yr = random.nextInt(300);
			
			z = Math.sqrt((xr*xr) + (yr*yr));
			JOptionPane.showMessageDialog(null,"The Random Hypotnuse is: "+z);
			
		}
		else {
			//Outside the parameters
			JOptionPane.showMessageDialog(null,"(404) Error\nNot Inside Parameters ");
			
		}
		
		
		
		
		
		
	}

}





*/
//Java Fizz-Buzz challenge


import java.util.Random;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*fizz buzz - whenever you land on an even number, right fizz, 
whenever you land on the left right buzz*/

class HelloWorld {}
public class Test{
    public static void main(String[] args) {
        int number = 0;
        Random random = new Random();
        
        for(int index = 0; index < 40; index++){
            
            number = random.nextInt(40);
            if(number % 2 == 0){
                System.out.println("Fizz");
            } else if(number % 3 == 0){
                System.out.println("Fizz Buzz");
            }
            else if(number % 2 == 1){
                System.out.println("Buzz");
            }
        }
        
    }
}
