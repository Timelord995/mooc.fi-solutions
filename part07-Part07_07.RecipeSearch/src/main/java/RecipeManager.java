
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stjepan
 */
public class RecipeManager {
    private ArrayList<Recipe> listOfRecipes;
    
    public RecipeManager(){
        this.listOfRecipes = new ArrayList<>();
    }
    
    public void add(Recipe recipe){
        this.listOfRecipes.add(recipe);
    }
    
    public void print(){
        System.out.println("Recipes: ");
        for (Recipe recipe: this.listOfRecipes){
            System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime());
        }
        System.out.println("");
    }
    
    public void searchRecipesByName(String searchedFor){
        System.out.println("Recipes: ");
        for (Recipe recipe : this.listOfRecipes){
            if (recipe.getRecipeName().contains(searchedFor)){
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime() );
            }
        }
        System.out.println("");
    }
    
    public void searchByCookingTime(int cookingTime){
        System.out.println("Recipes: ");
        for (Recipe recipe : this.listOfRecipes){
            if (recipe.getCookingTime() <= cookingTime){
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime() );
            }
        }
        System.out.println("");
    }
    
    public void searchByIngredient(String ingredient){
        System.out.println("Recipes: ");
        for (Recipe recipe : this.listOfRecipes){
            if (recipe.getIngredients().contains(ingredient)){
                System.out.println(recipe.getRecipeName() + ", cooking time: " + recipe.getCookingTime() );
            }
        }
        System.out.println("");
    }
    
}
