import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String movie = scanner.nextLine();
            if (movie.isEmpty()) {
                break;
            }
            System.out.print("Duration ");
            int dura = Integer.valueOf(scanner.nextLine());
            
            
            programs.add(new TelevisionProgram(movie, dura));
        }
        System.out.println("");
        System.out.print("Program's maximum duration? ");
        int maxDurat = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram movie: programs) {
            if (movie.getDuration() <= maxDurat) {
                System.out.println(movie);
            }
        }
    
        
    }
}
