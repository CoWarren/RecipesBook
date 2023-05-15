package com.recipebook.recipebook.controller;

import com.recipebook.recipebook.model.Recipe;
import com.recipebook.recipebook.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/recipes")
@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public @ResponseBody List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    // @PathVariable, annotation that replaces usage of "{id}" curly brackets
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRecipeById(@PathVariable("id") int recipeId) {
        // Find the recipe with the given ID and remove it from the list
        if (!recipeService.deleteRecipeById(recipeId)) {
            return ResponseEntity
                    .notFound()
                    .build(); // Recipe with the given ID not found
        }
        return ResponseEntity.ok("Recipe deleted successfully");
    }
}


