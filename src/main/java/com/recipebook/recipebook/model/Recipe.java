package com.recipebook.recipebook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// Lombok is a framework that tells java to create getter, setters and no args constructor
import java.time.LocalDate;
import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class Recipe {
    private String title;

    private String description;

    private LocalDate dateAdded;

    public Recipe(String title, String description, LocalDate dateAdded){
        this.title = title;
        this.description = description;
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dateAdded=" + dateAdded +
                '}';
    }

}
