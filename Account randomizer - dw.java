import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		double accounts[];
		
		accounts = new double[100];
		
		int index1 = 0;
		
		double accountAmount = random.nextDouble(60000);
		
		for(int index = 1; index < random.nextInt(100); index++){
			accounts[index] = accountAmount;
			index1++;
		}
		System.out.println("Account "+index1 +" has "+accounts[index1]);
		
		}

		
		
}
