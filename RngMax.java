import java.util.Random;
public class RngMax {
    public static void main(String [] args){
        Random randGen = new Random();
        int x = randGen.nextInt(10);
        int y = randGen.nextInt(10);
        int z = randGen.nextInt(10); //Variables block
        
        System.out.println("Generated Random Numbers: " + x + ", " + y + ", " + z);
        if(x > y && x > z){
            System.out.println("Greatest number: " + x);
        }
        else if(y > x && y > z){
            System.out.println("Greatest number: " + y);
        }
        else if(z > y && z > x){
            System.out.println("Greatest number: " + z);
        }
        else {
            System.out.println("Greatest number cannot be determined");
        }
    }
}
