package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public class Artist
{
    private String Artistname;
    private int Artistage;
    private String Artistgender;
    private String Artistgenre;
    Artist()
    {

    }
    Artist(String artistname ,String artistgender , String artistgenre , int artistage)
    {
        this.Artistname = artistname;
        this.Artistgender = artistgender;
        this.Artistgenre = artistgenre;
        this.Artistage = artistage;
    }

    @Override
    public String toString() {
        return Artistname + "\n" + Artistgender + "\n" + Artistgenre + "\n" + Artistage ;
    }

    public String getArtistname() {
        return Artistname;
    }

    public int getArtistage() {
        return Artistage;
    }

    public String getArtistgender() {
        return Artistgender;
    }

    public String getArtistgenre() {
        return Artistgenre;
    }
}