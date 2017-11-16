public class Collatz {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		if (n > 1) {
			int steps = 0;
			while (n != 1) {
				if (n % 2 ==0) {
					System.out.println(steps + ". " + n + " is even");
					System.out.println(n + " / 2 = " + n/2);
					n /= 2;	
					
				} else {
					System.out.println(steps + ". " + n + " is odd");
					System.out.println(n + " * 3 + 1 = " + (n*3 +1) );
					n = n*3 +1;
				}
				steps++;
			}
			System.out.println("It took " + steps + " steps to get to 1");
		} else {
			System.out.println("Number is already 1 or less than 1");
		}
	}
}
