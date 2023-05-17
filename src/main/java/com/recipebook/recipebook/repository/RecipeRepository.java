package com.recipebook.recipebook.repository;

import com.recipebook.recipebook.model.Recipe;

import java.util.List;
import java.util.Map;

public interface RecipeRepository {

    void initialiseRecipes();

    Map<Integer, Recipe> getAllRecipes();

    Recipe getTaskById(int recipeId);

    boolean deleteRecipeById(int id);
}
