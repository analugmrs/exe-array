import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double[] array = new double [n];
		
		for (int i=0; i<n; i++) {
			array[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += array[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("Avarage: %.2f%n", avg);

	}

}
