
import java.util.Scanner;
import java.util.ArrayList;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if(parts.length == 1){
                if(parts[0].equals("quit")){
                    break;
                }
            }else{
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                switch (command){
                    case "add":
                        if(first + amount <= 100 && amount >= 0){
                            first += amount;
                        }else{
                            first = 100;
                        }
                        break;
                    case "move":
                        if (first - amount >= 0 && amount >= 0){
                            if (second +amount <= 100){
                                if (amount <= first){
                                    first -= amount;
                                    second += amount;
                                }else{
                                    first = 0;
                                    second += amount;
                                }
                            }else {
                                first -= amount;
                                second = 100;
                            }
                        } else {
                            second += first;
                            first = 0;
                        }
                        break;
                    case "remove":
                        if (second -amount >= 0 && second - amount <= 100){
                            second -= amount;
                        }else {
                            second = 0;
                        }
                }    
            }    
        }
    }

}
