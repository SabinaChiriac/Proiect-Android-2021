package com.example.bibliotecaonline.library;

public class Book {

    private String Title;
    private String Author;
    private Books_Gendere Gender;
    private  String Publishing_year;
    private String Description;

    public Books_Gendere getGender() { return Gender; }
    public String getAuthor() { return Author; }
    public String getDescription() { return Description;}
    public String getPublishing_year() { return Publishing_year; }
    public String getTitle() { return Title; }

    public void setAuthor(String author) { this.Author = author; }
    public void  setTitle(String title){ this.Title=title;}
    public void setPublishing_year(String publishing_year){this.Publishing_year=publishing_year;}


}
