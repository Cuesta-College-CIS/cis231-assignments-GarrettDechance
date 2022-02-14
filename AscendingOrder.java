import java.util.Random;
public class AscendingOrder {
    public static void main(String [] args){
        Random randGen = new Random();
        int x = randGen.nextInt(100);
        int y = randGen.nextInt(100);
        int z = randGen.nextInt(100); 
        
        System.out.println("Generated Random Numbers: " + x + ", " + y + ", " + z);
        if(x >= y && y >= z){
            System.out.println("Sorted Order: " + z + ", " + y + ", " + x);
        }
        else if(x >= z && y <= z){
            System.out.println("Sorted Order: " + y + ", " + z + ", " + x);
        }
        else if(y >= x && x >= z){
            System.out.println("Sorted Order: " + z + ", " + x + ", " + y);
        }
        else if(y >= z && x <= z){
            System.out.println("Sorted Order: " + x + ", " + z + ", " + y);
        }
        else if(z >= x && x >= y){
            System.out.println("Sorted Order: " + y + ", " + x + ", " + z);
        }
        else if(z >= y && x <= y){
            System.out.println("Sorted Order: " + x + ", " + y + ", " + z);
        }
    }
}
