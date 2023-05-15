package com.recipebook.recipebook.service;

import com.recipebook.recipebook.model.Recipe;
import com.recipebook.recipebook.repository.InMemoryRecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Annotation must be implemented for Spring Boot to autowire inMemoryRepository
public class RecipeService {
    private final InMemoryRecipeRepository inMemoryRecipeRepository;


    public RecipeService(InMemoryRecipeRepository inMemoryRecipeRepository) {
        this.inMemoryRecipeRepository = inMemoryRecipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        return inMemoryRecipeRepository.getAllRecipes();
    }

    public boolean deleteRecipeById(int recipeId) {
        return inMemoryRecipeRepository.deleteRecipeById(recipeId);
    }
}
