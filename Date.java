package com.company;

/**
 * Created by randkill on 5/1/17.
 */
public class Date
{
    Date(int day , int month , int year)    //date constructor
    {

        setDay(day);
        setMonth(month);
        setYear(year);

    }
    Date()
    {

    }

    @Override
    public String toString() {
        return Year + "\n" + Month + "\n" + Day + "\n";
    }

    private int Day;        //date class atributes
    private int Month;
    private int Year;
    public void setDay(int day)     //day setter mehtod
    {
        if(day>=1 && day <=30)
        {
            this.Day = day;
        }
    }
    public void setMonth(int month)     //month setter method
    {
        if(month>=1 && month<=12)
        {
            this.Month = month;
        }
    }
    public void setYear(int year)       //year setter method
    {
        if(year>=1900 && year<=3000)
        {
            this.Year = year;
        }
    }
    public int getDay()     //day getter method
    {
        return Day;
    }
    public int getMonth()       //month getter method
    {
        return Month;
    }
    public int getYear()        //year getter method
    {
        return Year;
    }
}