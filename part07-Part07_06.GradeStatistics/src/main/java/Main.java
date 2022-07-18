
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int count = 0;
        int countPass = 0;
        int sum = 0;
        int sumPass = 0;
        ArrayList<Integer> points = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops: ");
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1){
                break;
            } else if (number >= -1 && number <= 101){
                sum += number;
                count++;
                points.add(number);
                if (number >= 50){
                    sumPass += number;
                    countPass++;
                }
            }
                
        }
        
        Statistics stats = new Statistics();
        stats.pointAvarages(count, sum);
        stats.averagePass(countPass, sumPass);
        stats.passPercentage(countPass, count);
        stats.gradeDistribution(points);
        
        
    }
}