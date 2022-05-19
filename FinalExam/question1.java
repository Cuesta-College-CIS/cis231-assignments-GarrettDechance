package FinalExam;
import java.util.Scanner;
import java.util.Random;

public class question1 {
    public static int[] genArray(int size){
        int[] valArray = new int[size];
        Random randGen = new Random();
        int i;
        int currVal = 0;
        if(size % 2 == 1){
            for(i = 0; i < size; i++){
                currVal = randGen.nextInt(100);
                valArray[i] = currVal;
            }
        }
        else{
            System.out.println("Please provide an odd number");
        }
        return valArray;
    }
    public static int[] medSort(int[] array){
        int [] sortedArray = array;
        int greatVal = 0;
        int greatIdx = 0;
        int tmp = 0;
        int i;
        int j;
        for(i = 0; i < sortedArray.length; i++){
            greatVal = 0;
            for(j = 0; j < sortedArray.length - i; j++){
                if(sortedArray[j] > greatVal){
                    greatIdx = j;
                    greatVal = sortedArray[j];
                }
            }
            tmp = sortedArray[sortedArray.length-1-i];
            sortedArray[sortedArray.length-1-i] = greatVal;
            sortedArray[greatIdx] = tmp;
        }
        return sortedArray;
    }
    public static void printArray(int[] values){
        int i;
        int numVals = values.length;
        for(i = 0; i < numVals; i++){
            if(i < numVals - 1){
            System.out.print("" + values[i] + ", ");
            }
            else if(i == numVals - 1){
                System.out.println("" + values[i]);
            }
        }
    }
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        int numVals = scnr.nextInt();
        scnr.close();
        int medIdx = numVals/2;
        int[] values = new int[numVals];
        values = genArray(numVals);
        printArray(values);
        values = medSort(values);
        System.out.println("The median value is: "+ values[medIdx]);
    }
}
