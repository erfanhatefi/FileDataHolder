package com.company;


/**
 * Created by randkill on 5/21/17.
 */
public class Audio extends File
{
    Audio(String name, AudioType type, String description, String address, int size
            , Date date1, Date date2 , int duration , Artist artist)
    {
        this.Name = name;
        this.Type = type;
        this.Descriptions = description;
        this.Address = address;
        this.Size = size;
        this.Date1 = date1;
        this.Date2 = date2;
        this.Artist = artist;
        this.Duration = duration;

    }
    private String Name;        //photo class atributes
    private AudioType Type;
    private String Descriptions;
    private String Address;
    private int Size;
    private Date Date1 = new Date();
    private Date Date2 = new Date();
    private Artist Artist = new Artist();
    private int Duration;

    @Override
    public String toString() {
        return "audio\n" +Name +"\n" + Type + "\n" + Descriptions + "\n" + Address + "\n" + Size + "\n" + Date1  + Date2  + Artist +"\n" + Duration ;
                //"Audio{" + "Name='" + Name + '\'' + ", Type=" + Type + ", Descriptions='" + Descriptions + '\'' + ", Address='" + Address + '\'' + ", Size=" + Size + ", Date1=" + Date1 + ", Date2=" + Date2 + ", Artist=" + Artist + '}';
    }

    public void setName(String name) {
        this.Name = name;
    }


    @Override
    public void setDescription(String description) {

    }

    public void setDescriptions(String descriptions) {
        this.Descriptions = descriptions;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setSize(int size) {
        this.Size = size;
    }

    @Override
    public void setCDate(Date date1) {

    }

    @Override
    public void setMDate(Date date2) {

    }

    public void setDate1(Date date1) {
        Date1 = date1;
    }

    public void setDate2(Date date2) {
        Date2 = date2;
    }

    public void setArtist(Artist artist) {
        Artist = artist;
    }

    public String getName() {
        return Name;
    }



    public String getDescriptions() {
        return Descriptions;
    }

    public String getAddress() {
        return Address;
    }

    public int getSize() {
        return Size;
    }

    public void getDate1() {
        Date1.toString();
    }

    public void getDate2() {
        Date2.toString();
    }

    public void getArtist() {
        Artist.toString();
    }
    public void setDuration(int duration)
    {
        this.Duration = duration;
    }
    public int getDuration()
    {
        return Duration;
    }
}