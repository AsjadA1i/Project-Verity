package com.redstone.verity;// Make sure any imports are at the top of the file
// import statements here, if any

// Class declaration
public class Quote {
    // Attributes (fields)
    private final String text;
    private final String author;
    private final int imageResource;

    // Constructor
    public Quote(String text, String author, int imageResource) {
        this.text = text;
        this.author = author;
        this.imageResource = imageResource;
    }

    // Getters
    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }

    public int getImageResource() {
        return imageResource;
    }
}
