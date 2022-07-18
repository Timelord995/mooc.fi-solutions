
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number? ");
        int end = Integer.valueOf(scanner.nextLine());
        
        
        
        int i = start;
        int sum = 0;
        while (i <= end){
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);

    }
}
