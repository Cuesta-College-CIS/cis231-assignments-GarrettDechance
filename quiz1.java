
import java.util.Arrays;
import java.util.Scanner;

public class quiz1 {
	public static void main(String[] args) {
		final int CNT = 5;
		int minval; //smallest value
        int minidx = 0; //index of smallest value
        int tmp; //temporary location for swapping variables
        int holdI = 0; //lets me use local i globally //DOES NOT WORK CORRECTLY

        //Creates the array
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++)
			numbers[i] = scnr.nextInt();
        //end of array creation
        
        tmp = 0;
        for(minidx = 0; minidx < CNT; minidx++){
            minval = numbers[minidx];
            holdI = 0;
            for (int i = minidx; i < N; i++){
                if(numbers[i] < minval){
                    minval = numbers[i];
                    holdI = i;
                }
            }
            if(holdI >0){
            tmp = numbers[minidx];
            numbers[minidx] = numbers[holdI];
            numbers[holdI] = tmp;
            }
            System.out.println(Arrays.toString(numbers)); //print works correctly
        }
		scnr.close();
	}

}
