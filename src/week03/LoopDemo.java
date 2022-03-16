package week03;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 5;
		for(int i=0; i<max; i++) {
			System.out.printf("For loop: %d\n", i);
		}
		
		int j = 0;
		while(j<max) {
			System.out.printf("While Loop: %d\n", j);
			j++;
		}
		
		int k = 0;
		do {
			System.out.printf("Do While Loop: %d\n", k);
			k++;
		}while(k<=1);
	}

}
