
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase(){
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latinName){
        this.birds.add(new Bird(name, latinName));
    }
    
    public void addObservation(String name){
        boolean isFound = false;
        
        for (Bird bird: birds){
            if(bird.getBirdName().equals(name)){
                bird.addObservation();
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Not a bird! ");
        }
    }
    
    public void printAll(){
        for(Bird bird: birds){
            System.out.println(bird);
        }
            
    }
    
    public void printOne(String name){
        boolean isFound = false;
        
        for (Bird bird: birds){
            if (bird.getBirdName().equals(name)){
                System.out.println(bird);
                isFound = true;
            }
        }
        
        if (!isFound){
            System.out.println("Not a bird! ");
        }
    }
    
    
}
