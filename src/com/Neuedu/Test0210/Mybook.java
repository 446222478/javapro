package com.Neuedu.Test0210;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Mybook<inputData> {
    private String name;
    private Double price;
    private String press;
    private String author;
    private String bookISBN;

    public Mybook(String name,Double price,String press,String author,String bookISBN) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Mybook{" +
                "书名=" +  name +
                ", 价格='" + price +
                ", 出版社='" + press +
                ", 作者=" + author +
                ", 书的ISBN号=" + bookISBN +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

}
