package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public class Dimensions
{
    Dimensions(int lenght , int width)      //dimensions/resulation constructor
    {
        this.Lenght = lenght;
        this.Width = width;
    }
    private int Lenght;     //dimensions/resulation class atributes
    private int Width;
    public void setLenght(int lenght)       //methods for set and get
    {                                       //resulation parameters
        this.Lenght = lenght;
    }
    public void setWidth(int width)
    {
        this.Width = width;
    }
    public int getLenght()
    {
        return Lenght;
    }
    public int getWidth()
    {
        return Width;
    }

    @Override
    public String toString() {
        return Lenght +"\n" + Width;
    }
}