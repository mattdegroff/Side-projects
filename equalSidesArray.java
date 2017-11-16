import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class Kata {
  public static int findEvenIndex(int[] arr) {
    int index = 0; //index to be returned if found
    boolean found = false; //indictes 
    for (int i = 0; i < arr.length; i++) {
      int sumLeft = 0; //resets left sum
      int sumRight = 0; // rests right sum
      for (int j = i; j > 0; j--) {  //loop to add all elements to the left of the index
        sumLeft += arr[j-1]; // sums all numbers to the left of the index being checked
      }
      for (int j = i+1; j < arr.length; j++) { // loop to add all elements to the right of the index 
        sumRight += arr[j]; // sums all elements to the right of the index being checked
      }
      if (sumLeft == sumRight) { //test if both sides are equal
        index = i; //sets index to the correct index
        found = true; //indicates a match was found
        break; //breaks the loop
      }
    }
    if (found) {
      return index; //if found, returns the index
    } else {
      return -1; //if not found, returns -1
    }
  }
}

public class KataTest {
    @Test
    public void test() {
        assertEquals(3,Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
        assertEquals(1,Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
        assertEquals(-1,Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
        assertEquals(3,Kata.findEvenIndex(new int[] {20,10,30,10,10,15,35}));
        assertEquals(-1,Kata.findEvenIndex(new int[] {-8505, -5130, 1926, -9026}));
        assertEquals(1,Kata.findEvenIndex(new int[] {2824, 1774, -1490, -9084, -9696, 23094}));
        assertEquals(6,Kata.findEvenIndex(new int[] {4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}));
    }
}
