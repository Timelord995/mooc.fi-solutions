/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Container {
    private int liquid;
    
    public Container(){
        this.liquid = 0;
    }
    
    public int contains(){
        return liquid;
    }
    
    public void add(int amount){
        if (this.liquid + amount <= 100 && amount >= 0){
            liquid = liquid + amount;
        } else{
            liquid = 100;
        }
    }
    
    public void remove(int amount){
        if(liquid- amount >= 0 && liquid - amount <= 100){
            liquid = liquid - amount;
        } else{
            liquid = 0; 
        }    
    }
    
    public String toString(){
        return liquid + "/100";
    }
    
    public void setLiquidAmount(int liquid){
        this.liquid = liquid;
    }
}
