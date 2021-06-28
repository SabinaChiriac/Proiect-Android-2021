package com.example.bibliotecaonline.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bibliotecaonline.R;
import com.example.bibliotecaonline.interfaces.OnBookItemClick;
import com.example.bibliotecaonline.library.Book;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<Book> bookList;
    OnBookItemClick onBookItemClick;

    public BookAdapter(ArrayList<Book> bookList, OnBookItemClick onBookItemClick) {
        this.bookList = bookList;
        this.onBookItemClick = onBookItemClick;
    }

    public BookAdapter(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.book_cell, parent, false);
        BookViewHolder bookViewHolder = new BookViewHolder(view);

        Log.e("BookAdapter", "onCreateViewHolder");

        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Book book = (Book)bookList.get(position);
        ((BookViewHolder) holder).bind(book);
    }

    @Override
    public int getItemCount() {
        return this.bookList.size();
    }

    class BookViewHolder extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView author;
        private TextView gender;
        private TextView publishing_year;
        private TextView description;
        private View view;

        BookViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            author = view.findViewById(R.id.author);
            author = view.findViewById(R.id.gender);
            author = view.findViewById(R.id.year);
            description = view.findViewById(R.id.description);
            this.view = view;
        }

        void bind(Book book) {
            title.setText(book.getTitle());
            author.setText(book.getAuthor());
            gender.setText(book.getGender());
            publishing_year.setText(book.getPublishing_year());
            description.setText(book.getDescription());

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onBookItemClick != null) {
                        onBookItemClick.onClick(book);
                    }
                }
            });
        }
    }
}

