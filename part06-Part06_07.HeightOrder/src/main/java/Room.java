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

public class Room {
    private ArrayList<Person> person;
    
    public Room(){
        this.person = new ArrayList<>();
    }
    
    public void add(Person person){
        this.person.add(person);
    }
    
    public boolean isEmpty(){
        if (person.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
    
    public ArrayList<Person> getPersons(){
        return person;
    }
    
    public Person shortest(){
        if (this.person.isEmpty()) {
        return null;
        }
        
        Person shortest = this.person.get(0);
        for (Person prs: this.person){
            if (shortest.getHeight() > prs.getHeight()){
                shortest = prs;
            }
        }
        
        return shortest;
    }
    
    public Person take(){
        if (this.person.isEmpty()) {
        return null;
        }
        
        Person shortest = this.person.get(0);
        for (Person prs: this.person){
            if (shortest.getHeight() > prs.getHeight()){
                shortest = prs;
            }
        }
        person.remove(shortest);
        return shortest;
        
    }
    
}
