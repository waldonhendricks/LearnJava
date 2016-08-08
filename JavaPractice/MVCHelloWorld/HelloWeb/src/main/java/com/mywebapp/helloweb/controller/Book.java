/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mywebapp.helloweb.controller;

/**
 *
 * @author anu
 */
public class Book {

    private String isbn;
    private String title;
    private String author;
    private int price;

    public Book() {
    }

    public Book(String isbn, String title,String author, int price) {
        this.isbn=isbn;
        this.title=title;
        this.author=author;
        this.price=price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    
    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
    
}
