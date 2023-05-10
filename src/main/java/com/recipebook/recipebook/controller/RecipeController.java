package com.recipebook.recipebook.controller;

import com.recipebook.recipebook.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
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

    @DeleteMapping("/{id}")

}

