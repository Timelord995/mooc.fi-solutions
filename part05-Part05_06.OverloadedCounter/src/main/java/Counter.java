/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Counter {
    private int value;
    
    public Counter(int startValue){
        this.value = startValue;
    }
    
    public Counter(){
        this.value = 0;
    }
    
    public int value(){
        return this.value;
    }
    
    public void increase(){
        this.value = this.value + 1;
    }
    
    public void increase(int increaseBy){
        if (increaseBy > 0){
            this.value = this.value + increaseBy;
        }
    }
    
    public void decrease(){
        this.value = this.value - 1;
    }
    
    public void decrease(int decreasedBy){
        if (decreasedBy > 0){
            this.value = this.value - decreasedBy;
        }
    }
    
}
