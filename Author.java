package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public class Author
{
    private String Authorname;
    private String Authorgender;
    private String Authorgenre;
    private int Authorage;
    Author()
    {

    }
    Author(String authorname , String authorgender , String authorgenre , int authorage)
    {
        this.Authorgender = authorgender;
        this.Authorgenre =authorgenre;
        this.Authorname = authorname;
        this.Authorage = authorage;
    }

    @Override
    public String toString() {
        return Authorname + "\n" + Authorgender + "\n"+ Authorgenre + "\n" + Authorage ;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public String getAuthorgender() {
        return Authorgender;
    }

    public String getAuthorgenre() {
        return Authorgenre;
    }

    public int getAuthorage() {
        return Authorage;
    }
}