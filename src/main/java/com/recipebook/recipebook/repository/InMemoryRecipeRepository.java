package com.recipebook.recipebook.repository;

import com.recipebook.recipebook.model.Recipe;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryRecipeRepository implements RecipeRepository {

    private final Map<Integer, Recipe> recipes;

    public InMemoryRecipeRepository() {
        recipes = new HashMap<>();
        initialiseRecipes();
    }

    public void initialiseRecipes() {
        // Add some sample recipes for testing
        Recipe recipe1 = new Recipe(1, "Pancakes", "Flour, milk, eggs", LocalDate.of(1999, 2, 1));
        Recipe recipe2 = new Recipe(2, "Banana & Rice", "Flour, milk, eggs", LocalDate.of(2009, 4, 15));
        Recipe recipe3 = new Recipe(3, "Gyoza Ramen", "Flour, milk, eggs", LocalDate.of(1999, 6, 2));

        recipes.put(recipe1.getRecipeId(), recipe1);
        recipes.put(recipe2.getRecipeId(), recipe2);
        recipes.put(recipe3.getRecipeId(), recipe3);
    }

    public Map<Integer, Recipe> getAllRecipes() {
        return recipes;
    }

    @Override
    public Recipe getRecipeById(int recipeId) {
        return recipes.get(recipeId);
    }

    @Override
    public boolean deleteRecipeById(int id) {
//        ListIterator<Recipe> iterator = recipes.listIterator();
//        while (iterator.hasNext()) {
//            Recipe recipe = iterator.next();
//            if (recipe.getRecipeId() == id) {
//                iterator.remove();
//                return true; // Deletion successful
//            }
//        }
        return false; // Recipe with the given ID not found
    }
}