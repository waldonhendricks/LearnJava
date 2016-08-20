package com.learnmvc.spring;

public class Success {

   private String isbn;
   private String title;
   private String author;
   private String price;

   public Success() {
   }

   public Success(String isbn, String title,String author, String price) {
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
   
   public String getPrice() {
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
   
   public void setPrice(String price){
       this.price = price;
   }
   
}