package com.example.bibliotecaonline.library.entities

import com.example.bibliotecaonline.library.Books_Gendere

data class BookItemElementFB (val title: String? = null, val author: String? = null, val gender: Books_Gendere? = null, val publishing_year: String? = null, val description: String? = null) {
    fun convert() = BookItem(title, author, gender, publishing_year, description)
}