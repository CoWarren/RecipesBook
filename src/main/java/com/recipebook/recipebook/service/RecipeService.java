package com.recipebook.recipebook.service;

import com.recipebook.recipebook.model.Recipe;
import com.recipebook.recipebook.repository.InMemoryRecipeRepository;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service // Annotation must be implemented for Spring Boot to autowire inMemoryRepository
public class RecipeService {
    private final InMemoryRecipeRepository inMemoryRecipeRepository;


    public RecipeService(InMemoryRecipeRepository inMemoryRecipeRepository) {
        this.inMemoryRecipeRepository = inMemoryRecipeRepository;
    }

    public Map<String,Recipe> getAllRecipes() {
        return inMemoryRecipeRepository.getAllRecipes();
    }

    public Recipe getRecipeById(String recipeId) {
        return inMemoryRecipeRepository.getRecipeById(recipeId);
    }

    public Recipe createRecipe(Recipe recipe) {
        return inMemoryRecipeRepository.createRecipe(recipe);
    }

    public boolean deleteRecipeById(String recipeId) {
        return inMemoryRecipeRepository.deleteRecipeById(recipeId);
    }


}
