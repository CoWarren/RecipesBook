package com.recipebook.recipebook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// Lombok is a framework that tells java to create getter, setters and no args constructor
import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
public class Recipe {

    private int recipeId;
    private String title;
    private String description;
    private LocalDate dateAdded;

    public Recipe(int recipeId, String title, String description, LocalDate dateAdded){
        this.recipeId = recipeId;
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }
}
