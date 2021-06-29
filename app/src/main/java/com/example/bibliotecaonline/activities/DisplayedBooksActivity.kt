package com.example.bibliotecaonline.activities

import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bibliotecaonline.Constants.Companion.ARG_FB_BOOK
import com.example.bibliotecaonline.R
import com.example.bibliotecaonline.adapters.BookAdapter
import com.example.bibliotecaonline.data.BookRepository
import com.example.bibliotecaonline.library.BookItemElement
import com.example.bibliotecaonline.library.entities.BookItemElementFB
import java.sql.Connection
import java.util.ArrayList
import kotlin.collections.forEach as forEach1

class DisplayedBooksActivity : AppCompatActivity() {

    private val bookRepository  = BookRepository()
    private var progressBar: ProgressBar? = null

    private val bookList by lazy {
        ArrayList<BookItemElement>()
    }

   // private lateinit var database: DatabaseReference

    private var bookAdapter: BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_displayed_books)

        //database = Firebase.database.reference
        setupViews()

    }

    override fun onStart() {
        super.onStart()

      //  database.addValueEventListener(bookListener)
    }

    override fun onStop() {
        super.onStop()

       // database.removeEventListener(bookListener)
    }

    private fun setupViews() {
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.rv_books)
        val layoutManager: LinearLayoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        //recyclerView.LayoutManager = layoutManager

       // bookAdapter = BookAdapter(bookList)
        recyclerView.adapter = bookAdapter
    }


//    val bookListener = object : ValueEventListener {
//        fun onDataChange(dataSnapshot: DataSnapshot) {
//            bookList.clear()
//
//            val booksSnapshot = dataSnapshot.child(ARG_FB_BOOK)
//            booksSnapshot?.children?.forEach1 { itemSnapshot ->
//                val bookItemFB = itemSnapshot.getValue(BookItemElementFB::class)
//                bookItemFB?.convert()?.let { bookItem ->
//                    bookList.add(bookItem.convert())
//                }
//            }
//
//            bookAdapter?.notifyDataSetChanged()
//            // ...
//        }
//
//    }
}