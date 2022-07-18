/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Timer {
    private ClockHand sec;
    private ClockHand hun;
    
    public Timer(){
        this.sec = new ClockHand(60);
        this.hun = new ClockHand(100);
       
    }
    
    public void advance(){
        hun.advance();
        
        if (this.hun.value() == 0){
            this.sec.advance();
        }
        
    }
    
    public String toString(){
        return sec + ":" + hun;
    }
}
