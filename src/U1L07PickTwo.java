 
import java.util.Arrays;
public class U1L07PickTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int [] oneTen = {1, 3, 4, 7, 6, 2, 9, 8, 10};
		
		int total = 55;
		int sum = oneTen[0] + oneTen[1] + oneTen[2] + oneTen[3] + oneTen[4] + oneTen[5] + oneTen[6] + oneTen[7] + oneTen[8];
		if (sum != total) {
			int answer = total - sum;
			System.out.println(answer);
		}
		
		
		
		
		/*int [] array = {1, 2, 3, 4};
		int i = 0;
		//move the last index to the front (In this array: index(3) moves to index (0)
		//repeat this process but increment the index that index(3) moves to until it = the length of the array
		//With help from Pei Pei Barth Wu and Izzy Hammer
		
		for (i = 0; i < array.length/2; i++) {
			int num = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = array [i];
			//System.out.println(Arrays.toString(array));
			
		}
	
		System.out.println(Arrays.toString(array));
		*/
		
		
		
	}

}