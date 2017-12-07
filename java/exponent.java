import java.util.Scanner;

//Fast Exponentiation - Ask the user to enter 2 integers a and b and output a^b (i.e. pow(a,b)) in O(lg n) time complexity. 

public class exponent {
	//recursive
	public static int equals(int a, int b) {
		if (b == 0) {
			return 1;
		} else if (b == 1){
			return a;			
		}
		else {
			return a * equals(a, b-1);
		}
	}
	
	//non-recursive
	public static int equals(int a, int b) {
		int a1 = a;
		for(int i = 0; i < b; i++){
			a *= a1;			
		}
		return a;
	}	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the base of the exponent: ");
		int a = s.nextInt();
		System.out.print("Enter the power to raise it to: ");
		int b = s.nextInt();
		int c = equals(a, b);
		int d = equalsR(a, b);
		System.out.println(a + "^" + b + " = " + c);
		System.out.print(a + "^" + b + " = " + d + " (recursive)";
	}
}
