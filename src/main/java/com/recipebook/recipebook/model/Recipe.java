package com.recipebook.recipebook.model;


// Lombok is a framework that tells java to create getter, setters and no args constructor
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    private int recipeId;
    private String title;
    private String description;
    private LocalDate dateAdded;
}
