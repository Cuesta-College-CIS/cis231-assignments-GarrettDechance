import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class programmingquiz2_2 {
    public static int[] constructArray(Scanner scnr){
        Random randGen = new Random();
        int N = scnr.nextInt(); 
        int [] n1 = new int[N];
        for(int i = 0; i < N; i++){
            n1[i] = randGen.nextInt(100);
        }
        return n1;
    }
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }
    public static int findMoreEvens(int[] n1, int[] n2){
        int even1 = 0;
        int even2 = 0;
        int result = 0;
        for(int i = 0; i < n1.length; i++){
            int numCheck1 = n1[i];
            if(numCheck1 % 2 == 0){
                even1++;
            }
        }
        for(int i = 0; i < n2.length; i++){
            int numCheck2 = n2[i];
            if(numCheck2 % 2 == 0){
                even2++;
            }
        }
        if(even1 > even2){
            result = 1;
        }
        else if(even2 > even1){
            result = 2;
        }
        return result;
    }
    public static int findGreatest(int[] n1, int[] n2){
        int greatVal1 = 0;
        int idxGreatVal1 = 0;
        int greatVal2 = 0;
        int idxGreatVal2 = 0;
        int greatValArray = 0;
        int tmp = 0;
        for(int i = 0; i < n1.length; i++){
            int numCheck1 = n1[i];
            if(numCheck1 > greatVal1){
                greatVal1 = numCheck1;
                idxGreatVal1 = i;
            }
        }

        tmp = n1[n1.length-1];
        n1[n1.length-1] = n1[idxGreatVal1];
        n1[idxGreatVal1] = tmp;

        for(int i = 0; i < n2.length; i++){
            int numCheck2 = n2[i];
            if(numCheck2 > greatVal2){
                greatVal2 = numCheck2;
                idxGreatVal2 = i;
            }
        }
        tmp = n2[n2.length-1];
        n2[n2.length-1] = n2[idxGreatVal2];
        n2[idxGreatVal2] = tmp;

        if(greatVal1 > greatVal2){
            greatValArray = 1;
        }
        else if(greatVal2 > greatVal1){
            greatValArray = 2;
        }
        return greatValArray;
    }
    public static void main(String[]args){
        Scanner scnr = new Scanner(System.in);
        int [] array1;
        array1 = constructArray(scnr);
        printArray(array1);

        int [] array2;
        array2 = constructArray(scnr);
        printArray(array2);

        int result = findMoreEvens(array1, array2);
        if(result > 0){
            System.out.println("Array " + result + " contains more even numbers.");
        }
        else {
            System.out.println("Both arrays have the same amount of even numbers");
        }

        int res = findGreatest(array1, array2);
        if(res == 1){
            System.out.println("Array " + res + " has the greatest value: " + array1[array1.length-1]);
        }
        else if (res == 2){
            System.out.println("Array " + res + " has the greatest value: " + array2[array2.length-1]);
        }
        else if(res == 0){
            System.out.println("A tie has occured");
        }

    }
}
