import java.util.Scanner;

public class LabProgram {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int arraySize = scnr.nextInt();
		float[] floatArray = new float[arraySize];
		int i = 0; // iterations for gather
		int p = 0; // iterations for print
		float currMax = 0;

		// while(i<arraySize){
		// floatArray[i] = scnr.nextFloat();
		// if(floatArray[i]>currMax){
		// currMax = floatArray[i];
		// }
		// i++;
		// }
		for (i = 0; i < arraySize; i++) {
			floatArray[i] = scnr.nextFloat();
			if ((i == 0) || (floatArray[i] > currMax)) {
				currMax = floatArray[i];
			}
		}
		for (i = 0; i < arraySize; i++) {
			System.out.printf("%.2f", (floatArray[p] / currMax));
			System.out.print(" ");
			p++;
		}
		// while (p < i) {
		// System.out.printf("%.2f", (floatArray[p] / currMax));
		// System.out.print(" ");
		// p++;
		// }
		System.out.println("");
	}
}
