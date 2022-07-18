
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String u1 = "alex";
        String u2 = "emma";
        String p1 = "sunshine";
        String p2 = "haskell";
        
        System.out.println("Enter username: ");
        String username = String.valueOf(scanner.nextLine());
        
        System.out.println("Enter password: ");
        String password = String.valueOf(scanner.nextLine());
        
        if (username.equals(u1) && password.equals(p1)) {
            System.out.println("You have successfully logged in! ");
        } else if (username.equals(u2) && password.equals(p2)) {
            System.out.println("You have successfully logged in! ");
        } else {
            System.out.println("Incorrect username or password! ");
        }

    }
}
