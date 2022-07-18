
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            } 
        
            if (number > 0) {
                numbers = numbers + 1;
                average = average + number;
            
            } else if (number < 0) {
                numbers = numbers +1;
                average = average + number;
            }
        
        }
        System.out.println("Average of the numbers: " + average / numbers);
        
    }


}
