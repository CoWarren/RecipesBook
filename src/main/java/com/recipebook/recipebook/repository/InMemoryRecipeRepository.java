package com.recipebook.recipebook.repository;

import com.recipebook.recipebook.model.Recipe;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Component
public class InMemoryRecipeRepository {

    private final List<Recipe> recipes;

    public InMemoryRecipeRepository() {
        recipes = new ArrayList<>();
        initialiseRecipes();

    }

    public void initialiseRecipes() {
        // Add some sample recipes for testing
        recipes.add(new Recipe(1, "Pancakes", "Flour, milk, eggs", LocalDate.of(1999, 2, 1)));
        recipes.add(new Recipe(2, "Banana & Rice", "Flour, milk, eggs", LocalDate.of(2009, 4, 15)));
        recipes.add(new Recipe(3, "Gyoza Ramen", "Flour, milk, eggs", LocalDate.of(1999, 6, 2)));


    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }

    public boolean deleteRecipeById(int id) {
        ListIterator<Recipe> iterator = recipes.listIterator();
        while (iterator.hasNext()) {
            Recipe recipe = iterator.next();
            if (recipe.getRecipeId() == id) {
                iterator.remove();
                return true; // Deletion successful
            }
        }
        return false; // Recipe with the given ID not found
    }
}