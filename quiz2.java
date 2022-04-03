import java.util.Arrays;
import java.util.Scanner;

public class quiz2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int L = 3; // will NOT use L. Just for the extendability.
		final int M = 3;
		final int N = 2;
		int[][] matrix1 = { { 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = { { 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();
        int[] outArray = new int[2];
        int sum;

		//matrix1[rowidx][]; use for selecting row based on user input
        for(int i = 0; i < N; i++){
            sum = 0;
            for(int j = 0; j < M; j++){
                sum += (matrix1[rowidx][j] * matrix2[j][i]);
            }
            outArray[i] = sum;
        }

        System.out.print(Arrays.toString(outArray));

	}

}