package com.company;


/**
 * Created by randkill on 5/21/17.
 */
public class Ebook extends File
{
    Ebook(String name, EbookType type, String description, String address, int size        //photo class constructor
            , Date date1, Date date2 , int pages , Author author , String domain)
    {
        this.Name = name;
        this.Type = type;
        this.Descriptions = description;
        this.Address = address;
        this.Size = size;
        this.Date1 = date1;
        this.Date2 = date2;
        this.Author = author;
        this.Domain = domain;
        this.Pages = pages;
    }
    private String Domain;
    private int Pages;
    private String Name;        //Ebook class atributes
    private EbookType Type;
    private String Descriptions;
    private String Address;
    private int Size;
    private Date Date1 = new Date();
    private Date Date2 = new Date();
    private Author Author = new Author();
    //Ebook class methods
    public void setName(String name) {
        Name = name;
    }

    public String getDomain() {
        return Domain;
    }

    public int getPages() {
        return Pages;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public void setPages(int pages) {
        Pages = pages;
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

    public void setAuthor(Author author) {
        Author = author;
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

    public void getDate1() {
        Date1.toString();
    }

    public void getDate2() {
        Date2.toString();
    }

    public void getAuthor() {
        Author.toString();
    }

    @Override
    public String toString() {
        return "ebook\n" +Name + "\n" + Type + "\n" + Size + "\n" + Address + "\n" + Date1 + Date2 + Pages +"\n"+ Domain +"\n" + Author +"\n" +Descriptions ;
    }
}
