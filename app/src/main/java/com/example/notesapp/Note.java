package com.example.notesapp;

import java.util.Objects;

public class Note {
    private String title;
    private String content;

    // Default constructor
    public Note() {
    }

    // Constructor with parameters
    public Note(String title, String content) {
        this.title = title;
        this.content = content;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Override equals() and hashCode()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if they are the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Check for null and class type
        Note note = (Note) obj; // Cast to Note
        return Objects.equals(title, note.title) && Objects.equals(content, note.content); // Compare fields
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content); // Create a hash based on fields
    }
}
