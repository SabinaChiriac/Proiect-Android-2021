package com.example.bibliotecaonline.data.tasks;

import android.os.AsyncTask;

import com.example.bibliotecaonline.data.BookDataBase;
import com.example.bibliotecaonline.data.BookRepository;
import com.example.bibliotecaonline.library.entities.BookItem;

import java.util.List;

public class GetBookByTitleTask extends AsyncTask<String, Void, Void> {
    private BookDataBase bookDataBase;
    private BookRepository.OnGetBookListener listener;

    public GetBookByTitleTask(BookDataBase bookDataBase, BookRepository.OnGetBookListener listener){
        this.bookDataBase = bookDataBase;
        this.listener = listener;
    }

    @Override
    protected Void doInBackground(String... titles) {
        bookDataBase.bookDAO().getByTitle(titles[0]);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        listener.onSuccess();
    }
}
