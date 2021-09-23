package com.example.lab2;

public class Books {
    //take the private instances;
    private String genre, author, make;
    private double price;
    private boolean digital;

    //use public constructor;
    public Books(String genre, String author, String make, double price, boolean digital) {
        setGenre(genre);
        setAuthor(author);
        setMake(make);
        setPrice(price);
        setDigital(digital);
    }

    //use of the getter and setter for genre, make, author, price and digital.
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if(genre.contains("fiction"))
            this.genre = genre;
        else
            throw new IllegalArgumentException("The second case is that book is non- fictional");

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author.length()>=10)
            this.author = author;
        else
            throw new IllegalArgumentException("is not valid. chose from these whose length is greater than 10");

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if(make != "paperless")
            this.make = make;
        else
            throw new IllegalArgumentException("otherwise the make of the book is of paper type");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 50)
            this.price = price;
        else
            throw new IllegalArgumentException("the price should be greater than zero");
    }

    public boolean isDigital() {
        return digital;
    }

    public void setDigital(boolean digital) {
        if(digital == true)
            this.digital = digital;
        else
            throw new IllegalArgumentException("the book should be first digital or not");
    }
    //use of the to string method to add sign as prefix to the price
    public String toString()
    {
        return String.format("The genre of the book is "+ genre+"%n"+"the make of the book is "+ make+ " %n"+ "the price of the book is $" + price+"%n"+" the book is make of digital? "+ digital);
    }
}
