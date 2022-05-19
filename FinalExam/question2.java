package FinalExam;
import java.util.Random;
import java.util.Scanner;

public class question2 {
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
        return valArray;
    }
    public static void findSubsequence(int[] summation){
        String consec;
        int[] sumArray = summation;
        int i;
        int maxTrio = 0;
        int trioIdx = 0;
        for(i = 0; i<sumArray.length - 2; i++ ){
            if((sumArray[i] + sumArray[i + 1] + sumArray[i + 2]) > maxTrio){
                maxTrio = (sumArray[i] + sumArray[i + 1] + sumArray[i + 2]);
                trioIdx = i;
            }
        }
        consec = (sumArray[trioIdx] + " " + sumArray[trioIdx + 1] + " " + sumArray[trioIdx + 2]);
        System.out.println(consec);
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
    
    
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        int numVals = scnr.nextInt();
        scnr.close();
        int[] values = new int[numVals];
        values = genArray(numVals);
        printArray(values);
        findSubsequence(values);
    }
}
