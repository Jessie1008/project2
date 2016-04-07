/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.util.List;
import transferobjects.Ingredient;

/**
 *
 * @author Jessie
 */
public interface IngredientsDao {
    
    	List<Ingredient> getAllIngredients();
	Ingredient getIngredientById(int ingredient_id);
	void addIngredient(Ingredient ingredient);
	void updateIngredient(Ingredient ingredient);
	void deleteIngredient(Ingredient ingredient);
    
}
