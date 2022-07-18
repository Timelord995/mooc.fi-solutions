/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class Product {
    private String Name;
    private double Price;
    private int Quantity;
    
    public Product(String initialName, double initialPrice, int initialQuantity){
        this.Name = initialName;
        this.Price = initialPrice;
        this.Quantity = initialQuantity;
    }
    public void printProduct(){
        System.out.println(Name + ", " + Price + ", " + Quantity);
    }
    
}
