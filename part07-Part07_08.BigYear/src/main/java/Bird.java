
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
public class Bird {
    private String name;
    private String latinName;
    private int observation;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String getBirdName(){
        return name;
    }
    
    public String getBirdLatinName(){
        return latinName;
    }
    
    public void addObservation(){
        this.observation ++;
    }
    
    public int getObservation(){
        return this.observation;
    }
    
    public String toString(){
        return this.getBirdName() + " (" + this.getBirdLatinName() +"): " +this.getObservation() + " observations";
    }
    
}
