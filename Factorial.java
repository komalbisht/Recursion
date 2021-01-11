package recursion;

public class Factorial {

	public static void main(String[] args) {

		int ans = RecursiveFact(4);
		
		System.out.println(ans);
		
		int sum = IterativeFact(5);
		
		System.out.println(sum);
	}
	
	public static int RecursiveFact(int num) {
		
		if (num == 0 ) {
			return 1;
		}
		
		return num * RecursiveFact(num - 1);
	}
	
	
	public static int IterativeFact(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		int fact=1;
		
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		
		return fact;
	}

}
