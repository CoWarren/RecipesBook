package com.recipebook.recipebook.controller;

import com.recipebook.recipebook.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("/api/recipes")
@RestController
public class RecipeController {

    private final List<Recipe> recipes; // List to store recipes (in-memory representation)

    public RecipeController() {
        recipes = new ArrayList<>();
        // Add some sample recipes for testing
        recipes.add(new Recipe(24, "Pancakes", "Flour, milk, eggs", LocalDate.of(1999,2, 1)));
    }

    @GetMapping
    public @ResponseBody List<Recipe> getAllRecipes() {
        return recipes;
    }

    // @PathVariable, annotation that replaces usage of "{id}" curly brackets
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRecipe(@PathVariable("id") int id) {
        // Find the recipe with the given ID and remove it from the list
        for (Recipe recipe : recipes) {
            if (recipe.getId() == id) {
                recipes.remove(recipe);
                return ResponseEntity.ok("Recipe deleted successfully");
            }
        }
        return ResponseEntity
                .notFound()
                .build(); // Recipe with the given ID not found
    }
}

