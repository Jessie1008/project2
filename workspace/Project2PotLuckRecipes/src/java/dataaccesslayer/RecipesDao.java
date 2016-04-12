/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccesslayer;

import java.util.List;
import transferobjects.Recipe;

/**
 * Interface of accessing recipes from database.
 * 
 * @author Chunyan Wang, Jian Liu, Qing Zhang, Zhe Huang
 * @version 1.0.0 Date April 11, 2016
 * @since 1.8.0_73
 * 
 * @see java.util.List;
 * @see transferobjects.Recipe;
 */
public interface RecipesDao {
    List<Recipe> getAllRecipes();
    Recipe getRecipeById(Integer recipeId);
    void addRecipe(Recipe recipe);
    void updateRecipe(Recipe recipe);
    void deleteRecipe(Recipe recipe);
}
