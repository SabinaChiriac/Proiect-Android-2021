package com.example.bibliotecaonline.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.bibliotecaonline.library.entities.BookItem;
import java.util.List;

@Dao
public interface BookDAO {
    @Query("SELECT * FROM bookItem")
    List<BookItem> getAll();

    @Query("SELECT * FROM bookItem WHERE title = :itemTitle")
    void getByTitle(String itemTitle);
}
