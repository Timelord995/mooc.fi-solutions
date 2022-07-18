/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> strings;
    
    public Stack() {
        this.strings = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (strings.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    
    public void add(String value){
        this.strings.add(value);
    }
    
    public ArrayList<String> values(){
        return strings;
    }
    
    public String take(){
        return strings.remove(strings.size()-1);
    }
    
    
    
    
}
