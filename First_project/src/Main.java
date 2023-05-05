import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		
		
		System.out.println("Alright " +name +". Please enter your age");
		int age = scanner.nextInt();
		
		
		if(age > 45) {
			System.out.println("Wow! "+ age + ", your old!");
			
		}
		String food = scanner.nextLine();
		System.out.println("Alright, what is your fav food?"+food+"Jingle");
		scanner.nextLine();
		
		System.out.println("You like " +food);  
		System.out.println("Hey "+ name);
		System.out.println("You are "+age + " years old");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
