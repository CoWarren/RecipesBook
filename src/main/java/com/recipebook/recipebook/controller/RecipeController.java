package com.recipebook.recipebook.controller;

import com.recipebook.recipebook.model.Recipe;
import com.recipebook.recipebook.service.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("/recipes")
@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public @ResponseBody Map<String, Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    @GetMapping("{recipeId}")
    public @ResponseBody Recipe getRecipeById(@PathVariable("recipeId") String recipeId){
        return recipeService.getRecipeById(recipeId);
    }

    @PostMapping()
    public @ResponseBody ResponseEntity<String> createRecipe(@RequestBody Recipe recipe){
        if (recipeService.createRecipe(recipe) == null) {
            return ResponseEntity.badRequest().build(); // Failed to create recipe
        }
        return ResponseEntity.ok("Recipe created successfully");
    }

    // @PathVariable, annotation that replaces usage of "{id}" curly brackets
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRecipeById(@PathVariable("id") String recipeId) {
        // Find the recipe with the given ID and remove it from the list
        if (!recipeService.deleteRecipeById(recipeId)) {
            return ResponseEntity
                    .notFound()
                    .build(); // Recipe with the given ID not found
        }
        return ResponseEntity.ok("Recipe deleted successfully");
    }


}


