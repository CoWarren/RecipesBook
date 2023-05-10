package com.recipebook.controller;

import com.recipebook.model.Recipe;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("")
public class RecipeController {

        private List<Recipe> recipes; // List to store recipes (in-memory representation)

        public RecipeController() {
            recipes = new ArrayList<>();
            // Add some sample recipes for testing
            recipes.add(new Recipe("Pancakes", "Flour, milk, eggs", "Mix ingredients and cook on a pan"));
            recipes.add(new Recipe("Spaghetti Bolognese", "Ground beef, tomatoes, pasta", "Cook beef, add tomatoes, serve with pasta"));
        }

        @GetMapping
        public List<Recipe> getAllRecipes() {
            return recipes;
        }

    }
