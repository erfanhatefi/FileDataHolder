package com.company;

/**
 * Created by randkill on 6/24/17.
 */
public enum Genre {

    ACTION("action"),
    ROMANCE("romance"),
    DRAMAA("drama"),
    THRILLER("thriller"),
    COMEDY("comedy"),
    DOCUMANTRY("documantry"),
    SCIENCEFICTION("sciencefiction");


    private String Genre;


    Genre(String sciencefiction) {

    }


    private void setGenre(String Genre)
    {
        this.Genre = Genre;
    }
    public String getGenre()
    {
        return Genre;
    }
}
