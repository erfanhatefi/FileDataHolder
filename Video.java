package com.company;

        import java.io.*;

/**
 * Created by randkill on 5/21/17.
 */
public class Video extends File
{
    Video(String name, VideoType type, String description, String address, int size
            , Date date1, Date date2 ,int duration , Genre genre , int fRate)
    {
        this.Name = name;
        this.Type = type;
        this.Descriptions = description;
        this.Address = address;
        this.Size = size;
        this.Date1 = date1;
        this.Date2 = date2;
        this.Genre = genre;
        this.Duration = duration;
        this.FrameR = fRate;
    }
    private String Name;        //Video class atributes
    private VideoType Type;
    private String Descriptions;
    private String Address;
    private int Size;
    private Date Date1 = new Date();
    private Date Date2 = new Date();
    private Genre Genre;
    private int Duration;
    private int FrameR;
    public void setName(String name) {
        this.Name = name;
    }


    @Override
    public void setDescription(String description) {

    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setSize(int size) {
        Size = size;
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

    public String getName() {
        return Name;
    }

    public Enum getType() {
        return Type;
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

    public void  getDate1() {
        Date1.toString();
    }

    public void getDate2() {
        Date2.toString();
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public int getFrameR() {
        return FrameR;
    }

    public void setFrameR(int frameR) {
        FrameR = frameR;
    }

    @Override
    public String toString() {
        return "video\n" +Name + "\n" + Size + "\n" + Address + "\n" + Date1 + Date2 + Type + "\n" + Descriptions +"\n" + Genre +"\n"+ Duration + "\n"+FrameR;
    }
}