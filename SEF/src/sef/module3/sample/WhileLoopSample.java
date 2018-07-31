package sef.module3.sample;

public class WhileLoopSample {
	
	public static void main(String[] args) {
	
		System.out.println("While Loop");
		int counter = 0;
		while(counter < 10){
			System.out.println("The value of counter is : " + counter);
			int j = 0;
			while(j < 10) {
				j++;
				System.out.println("The value of counter J is : " + j);

			};
			counter++;		
		}
		
		System.out.println("\n\nDo-While Loop");
		counter = 0;
		do {
		
			System.out.println("The value of counter is : " + counter);
			counter++;		
		}while(counter < 10);
	}
}
