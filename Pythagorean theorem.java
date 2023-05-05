import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		int whatSide;
		
		Scanner scanner = new Scanner(System.in);
		//Hypotnuse
		
		System.out.println("If you want to find the hypotnuse, press 1\n"+"If you want to find the side of X press 2\n"+"If you want to find Y, press 3");
		whatSide = scanner.nextInt();
		
		if(whatSide == 1) {
			System.out.println("Enter side x: ");
			x = scanner.nextDouble();
			System.out.println("Enter side y: ");
			y = scanner.nextDouble();
			
			z = Math.sqrt((x*x) + (y*y));
			
			System.out.println("The hypotnuse is: "+z);
		} else if(whatSide == 2) {
			System.out.println("Enter side y: ");
			y = scanner.nextDouble();
			System.out.println("Enter side z: ");
			z = scanner.nextDouble();
			
			x = Math.sqrt((z*z) - (y*y));
			System.out.println("The X is: "+x);
		} else if(whatSide == 3) {
			System.out.println("Enter side x: ");
			x = scanner.nextDouble();
			System.out.println("Enter side z: ");
			z = scanner.nextDouble();
			
			y = Math.sqrt((z*z) - (x*x));
			System.out.println("The Y is: "+y);
		} else {
			System.out.println("(404) Error\nNot Inside Parameters ");
		}
		
		
		
		
		
		
	}

}
