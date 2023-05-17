package com.recipebook.recipebook.model;


// Lombok is a framework that tells java to create getter, setters and no args constructor
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
public class Recipe {

    private String recipeId;
    private String title;
    private String description;
    private LocalDate dateAdded;
}
