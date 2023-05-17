package com.recipebook.recipebook.repository;

import com.recipebook.recipebook.model.Recipe;

import java.util.List;
import java.util.Map;

public interface RecipeRepository {

    void initialiseRecipes();

    Map<String, Recipe> getAllRecipes();

    Recipe getRecipeById(String recipeId);

    Recipe createRecipe(Recipe recipe);
    boolean deleteRecipeById(String recipeId);
}
