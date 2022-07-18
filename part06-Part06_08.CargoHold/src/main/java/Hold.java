
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
public class Hold {
    private ArrayList<Suitcase> suitcase;
    private int maxWeight = 0;
    
    public Hold(int maxWeight){
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (holdWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcase.add(suitcase);   
        } 

    }
    
    public int holdWeight() {
        int holdWeight = 0;
        for (Suitcase element : suitcase) {
            holdWeight += element.totalWeight();
        }
        return holdWeight;
    }
    
    public void printItems(){
        for (Suitcase element : suitcase) {
            element.printItems();
        }

    }

    
    public String toString(){
        return suitcase.size() + " suitcases (" + this.holdWeight() + " kg)";
    }
}
