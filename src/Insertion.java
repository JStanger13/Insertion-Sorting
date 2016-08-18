
import java.util.Arrays;

public class Insertion {
	public static void main (String [] args){
		int[] setArray  = {10, 2, 18, 13, 9, 7, 11};
		int i = 1;	
		int Counter = 0;
			for (i = 1; i < setArray.length; i++){
					int x = 0;
					int j =  i;
					while(j > 0 && setArray[j] < setArray[j-1]){
						x = setArray[j-1];
						setArray[j-1] = setArray[j];
						setArray[j] = x;
						j = j - 1;
						Counter = Counter + 1;

						//System.out.println("The value of j is" +" " + j);//
					}
					/*System.out.println(i);
					System.out.println(j);
					System.out.println(Arrays.toString(setArray));*/
				}
			System.out.println(Arrays.toString(setArray));
			System.out.println("It took you " + Counter + " swaps!!");
	}
}
