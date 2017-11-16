package fibonacci;

// Fibonacci Sequence - Enter a number and have the program generate the Fibonacci sequence to that number or to the Nth number.

public class fib {
	// return number at n
	public static int NthTerm( int n ) {
		if ( n == 1 ) {
			return 0;
		} else if ( n == 2 ) {
			return 1;
		} else {
			return NthTerm(n-1) + NthTerm(n-2);
		}
	}
	// print whole sequence up to n
	public static void fibSeq( int n ) {
		int[] seq = new int[n];
		if ( n == 1 ) {
			System.out.print("0");
		} else if ( n == 2 ) {
			System.out.print("0, 1");
		} else {
			for (int i = 1; i <= n; i++) {
				System.out.print(NthTerm(i));
				if (i != n) {
					System.out.print(", ");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int x = 20;
		System.out.println(NthTerm(x));
		fibSeq(x);
	}

}
