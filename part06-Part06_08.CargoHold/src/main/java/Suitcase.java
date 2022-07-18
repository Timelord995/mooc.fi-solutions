
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
public class Suitcase {
    private ArrayList<Item> item;
    private int maxWeight;
     
    public Suitcase(int maxWeight){
        this.item = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
     public int totalWeight() {
        int totalWeight = 0;
        for (Item item : item) {
        totalWeight += item.getWeight();
        }
        return totalWeight;
     }
     
     public void addItem(Item item){
        if(item.getWeight() + totalWeight() <= maxWeight){
            this.item.add(item);
        } 
        
    }
    
    public void printItems(){
        for (Item element : item) {
            System.out.println(element);
        }
    }
    
    public Item heaviestItem(){
        if (this.item.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.item.get(0);
        for (Item hev: this.item){
            if (heaviest.getWeight() < hev.getWeight()){
                heaviest = hev;
            }
        }
        
        return heaviest;
    }
    
    public String toString(){
        if (item.size() == 0){
            return "no items (" + totalWeight() + " kg)"; 
        }else if (item.size() <= 1){
            return item.size() + " item" + "(" + totalWeight() + " kg)";
        }else{
            return item.size() + " items" + "(" + totalWeight() + " kg)";
        }
    }
     
    
}
