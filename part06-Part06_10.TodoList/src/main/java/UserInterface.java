
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Command: ");
            String userCommand = scanner.nextLine();
            switch(userCommand){
                case "stop":
                    return;
                case"add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "remove":
                    remove();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
    
    public void add(){
        System.out.println("To add: ");
        String toAdd = scanner.nextLine();
        list.add(toAdd);
    }
    
    public void list(){
        list.print();
    }
    
    public void remove(){
        System.out.println("Which one is removed? ");
        int index = Integer.valueOf(scanner.nextLine());
        list.remove(index);
    }
}
