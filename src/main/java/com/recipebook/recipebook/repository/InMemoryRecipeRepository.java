package com.recipebook.recipebook.repository;

import com.recipebook.recipebook.model.Recipe;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Component
public class InMemoryRecipeRepository implements RecipeRepository {

    private final Map<String, Recipe> recipes;

    public InMemoryRecipeRepository() {
        recipes = new HashMap<>();
        initialiseRecipes();
    }

    private String generateNewRecipeId() {
        return UUID.randomUUID().toString();
    }

    public void initialiseRecipes() {
        // Add some sample recipes for testing
        Recipe recipe1 = Recipe.builder()
                .recipeId(generateNewRecipeId())
                .title("Pancakes")
                .description("Flour, milk, eggs")
                .dateAdded(LocalDate.of(1999, 2, 1))
                .build();

        Recipe recipe2 = Recipe.builder()
                .recipeId(generateNewRecipeId())
                .title("Banana & Rice")
                .description("Flour, milk, eggs")
                .dateAdded(LocalDate.of(2009, 4, 15))
                .build();

        Recipe recipe3 = Recipe.builder()
                .recipeId(generateNewRecipeId())
                .title("Gyoza Ramen")
                .description("Flour, milk, eggs")
                .dateAdded(LocalDate.of(1999, 6, 2))
                .build();

        recipes.put(recipe1.getRecipeId(), recipe1);
        recipes.put(recipe2.getRecipeId(), recipe2);
        recipes.put(recipe3.getRecipeId(), recipe3);
    }

    public Map<String, Recipe> getAllRecipes() {
        return recipes;
    }

    @Override
    public Recipe getRecipeById(String recipeId) {
        return recipes.get(recipeId);
    }

    public Recipe createRecipe(Recipe recipe){
        String recipeId = generateNewRecipeId();
        var newRecipe = Recipe.builder()
                .recipeId(recipeId)
                .title(recipe.getTitle())
                .description(recipe.getDescription())
                .dateAdded(recipe.getDateAdded())
                .build();
        recipes.put(newRecipe.getRecipeId(), newRecipe);
        return newRecipe;
    }

    @Override
    public boolean deleteRecipeById(String recipeId) {
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