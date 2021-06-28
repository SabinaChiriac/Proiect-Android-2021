package com.example.bibliotecaonline.data;

import com.example.bibliotecaonline.data.tasks.GetAllBooksTask;
import com.example.bibliotecaonline.data.tasks.GetBookByTitleTask;
import com.example.bibliotecaonline.library.entities.BookItem;

import java.util.List;

public class BookRepository {
    public static interface OnSuccesListener {
        void onSuccess();
    }

    public static interface OnGetBookListener {
        void onSuccess(List<BookItem> items);

        void onSuccess();
    }

    private BookDataBase bookDataBase;

    public BookRepository(){
        bookDataBase = ApplicationController.getBookDataBase();
    }

    public void getAllBooks(OnGetBookListener listener) {
        new GetAllBooksTask(bookDataBase, listener).execute();
    }

    public void getBookByTitle(String bookItem, OnGetBookListener listener) {
        new GetBookByTitleTask(bookDataBase,  listener).execute(bookItem);
    }
}
