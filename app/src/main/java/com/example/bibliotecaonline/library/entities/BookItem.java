package com.example.bibliotecaonline.library.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.bibliotecaonline.library.Books_Gendere;

@Entity
public class BookItem {
    @PrimaryKey(autoGenerate =  true)
    public int id;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "author")
    public String author;
    @ColumnInfo(name = "gender")
    public Books_Gendere gender;
    @ColumnInfo(name = "publishing_year")
    public String publishing_year;
    @ColumnInfo(name = "description")
    public String description;

    public BookItem(String title, String author, Books_Gendere gender, String publishing_year, String description) {
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.publishing_year = publishing_year;
        this.description = description;
    }
}
