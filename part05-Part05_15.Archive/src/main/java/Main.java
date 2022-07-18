
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
 
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if(identifier.isEmpty()){
                break;
            }
 
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if(name.isEmpty()){
//                Item item = new Item(identifier);
//                if(items.contains(item)){
//                    continue;
//                }
//                items.add(item);
                break;
            }
            Item completeItem = new Item(identifier, name);
 
            if(items.contains(completeItem)){
                continue;
            }
            items.add(completeItem);
        }
        System.out.println("==Items==");
        for(Item item : items){
            System.out.println(item);
        }
 
    }
}