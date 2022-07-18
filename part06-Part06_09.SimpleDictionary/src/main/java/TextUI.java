/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
import java.util.Scanner;

public class TextUI {
    private SimpleDictionary  dictionary ;
    private Scanner scanner;
    
    public TextUI(Scanner scanner ,SimpleDictionary dictionary){
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    
    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if (word.contains("end")) {
                System.out.println("Bye bye! ");
                break;
            }if (word.contains("add")) {
                System.out.println("Word: ");
                String newWord = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                this.dictionary.add(newWord, translation);
                
            }if (word.contains("search")){
                System.out.println("To be translated: ");
                String translated = scanner.nextLine();
                    if (this.dictionary.translate(translated) != null){
                        System.out.print("Translation: ");
                        System.out.println(this.dictionary.translate(translated));
                    }else {
                        System.out.println("Word " + translated + " was not found");
                    }
            }
            System.out.println("Unknown command ");
        }
    }
    
}
