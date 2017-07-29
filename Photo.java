package com.company;

/**
 * Created by randkill on 5/21/17.
 */
public class Photo extends File
{
    Photo(String name, PhotoType type, String description, String address, int size        //photo class constructor
            , Date date1, Date date2, Dimensions dimensions) {
        this.Name = name;
        this.Type = type;
        this.Descriptions = description;
        this.Address = address;
        this.Size = size;
        this.Date1 = date1;
        this.Date2 = date2;
        this.Dimensions = dimensions;
    }

    private String Name;        //photo class atributes
    private PhotoType Type;
    private String Descriptions;
    private String Address;
    private int Size;
    private Date Date1 = new Date();
    private Date Date2 = new Date();
    private Dimensions Dimensions;

    @Override
    public String toString() {
        return "photo\n" +Name + "\n" + Size +"\n" + Date1 + Date2 + Address +"\n" + Descriptions + "\n" + Dimensions +"\n" + Type;
    }

    public void setName(String name) {
        this.Name = name;
    }



    public void setDescription(String description) {
        this.Descriptions = description;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setSize(int size) {
        this.Size = size;
    }

    public void setCDate(Date date1) {
        this.Date1 = date1;
    }

    public void setMDate(Date date2) {
        this.Date2 = date2;
    }
    public String getName() {
        return Name;
    }

    public Enum getType()
    {
        return Type;
    }
    public String getDescriptions()
    {
        return Descriptions;
    }
    public String getAddress()
    {
        return Address;
    }
    public int getSize()
    {
        return Size;
    }
    public void getCDate()
    {
        Date1.toString();
    }
    public void getMDate()
    {
        Date2.toString();
    }
}
