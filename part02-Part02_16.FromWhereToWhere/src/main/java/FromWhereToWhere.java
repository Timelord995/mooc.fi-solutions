
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to? ");
        int input = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Where from? ");
        int start = Integer.valueOf(scanner.nextLine());
        
        for (int i = start; i <= input; i++) {
            if (input >= start) { 
                System.out.println(i);
            }
        }
    }
}
