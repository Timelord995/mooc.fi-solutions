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

public class tip {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is the bill? ");
        int bill = Integer.valueOf(scanner.nextLine());
        
        if (bill >= 50){
            System.out.println("Total value is :" + (bill + (bill * 0.15)));
        } else if (bill <= 300){
            System.out.println("Total value is :" + (bill + (bill * 0.15)));
        } else {
            System.out.println("Total value is :" + (bill + (bill * 0.20)));
            
        }
    }
        
        
}

