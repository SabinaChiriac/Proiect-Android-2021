package com.example.bibliotecaonline.profile;

import  com.example.bibliotecaonline.library.Book;

import java.util.ArrayList;

public class User {

    private String ID;
    private String NAME;
    private String ADDRESS;
    private String DATE_OF_BIRTH;
    private String EMAIL;

    private ArrayList<Book>Want_To_Read=new ArrayList<Book>();
    private ArrayList<Book>Read=new ArrayList<Book>();
    private ArrayList<Book>Currently_Reading=new ArrayList<Book>();

    public String getID() { return ID; }
    public String GetNAME() { return NAME;}
    public String GetADDRESS() {return ADDRESS;}
    public String GetDATE_OF_BIRTH() { return DATE_OF_BIRTH;}
    public String getEMAIL() { return EMAIL; }
    public ArrayList<Book> getCurrently_Reading() { return Currently_Reading; }
    public ArrayList<Book> getRead() { return Read; }
    public ArrayList<Book> getWant_To_Read() { return Want_To_Read; }

    public void setID(String ID) { this.ID = ID; }
    public void setNAME(String name) { this.NAME =name; }
    public void setADDRESS(String address) { this.ADDRESS =address; }
    public void setDATE_OF_BIRTH(String date_of_birth) { this.DATE_OF_BIRTH =date_of_birth; }
    public void setEMAIL(String email) { this.EMAIL=email; }
    public void setCurrently_Reading(ArrayList<Book> currently_Reading) { Currently_Reading = currently_Reading; }
    public void setRead(ArrayList<Book> read) { Read = read; }
    public void setWant_To_Read(ArrayList<Book> want_To_Read) { Want_To_Read = want_To_Read; }

    public void ADD_Book_to_CurrentlyReading(Book new_book) {
        Currently_Reading.add(new_book);
        if(Want_To_Read.contains(new_book))
        {
            Want_To_Read.remove(new_book);
        }
    }
    public void ADD_Book_to_WantToRead(Book book){
        Want_To_Read.add(book);
    }
    public void ADD_Book_to_Read(Book book){
        Read.add(book);
        if(Currently_Reading.contains(book)){
            Currently_Reading.remove(book);
        }
        else
            if(Want_To_Read.contains(book)){
                Want_To_Read.remove(book);
            }
    }
    public void REMOVE_Book_from_CurrentlyReading(Book book){
        if(Currently_Reading.contains(book)){
            Currently_Reading.remove(book);
        }
    }
    public void REMOVE_Book_from_WantToRead(Book book){
        if(Want_To_Read.contains(book)){
            Want_To_Read.remove(book);
        }
    }
    public void REMOVE_Book_from_Read(Book book){
        if(Read.contains(book)){
            Read.remove(book);
        }
    }
    public void CHANGE_Name(String new_Name){
        this.NAME=new_Name;
    }
    public void CHANGE_Address(String new_Address){
        this.ADDRESS=new_Address;
    }
    





}
