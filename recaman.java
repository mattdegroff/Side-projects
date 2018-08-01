import java.util.*;

public class recaman{
	public static void main(String []args){
        int length = 4;
        int[] sequence = new int[length];
        ArrayList used = new ArrayList();
	
        for (int i = 0; i < length; i++) {          
			if (i == 0) {
                sequence[i] = 0;
                used.add(sequence[i]);
	        } else if ((sequence[i-1] - i) < 0 || used.contains(sequence[i-1] - i)) {	
                sequence[i] = sequence[i-1] + i;
		        used.add(sequence[i]);
  	        } else {	
                sequence[i] = sequence[i-1] - i;
                used.add(sequence[i]);
			}
			System.out.println(i+1 + " - " + sequence[i]);        
		}
	}
}