package com.example.recyclerviewwithmultipleviewtype.ui.adapter

sealed class HomeRecyclerViewItem {

    class Title(
        val id : Int,
        val title: String,
    ) : HomeRecyclerViewItem()

    class Movie(
        val id : Int,
        val title:String,
        val thumbnail : String,
        val release_date : String
    ) : HomeRecyclerViewItem()

    class Director(
        val id : Int,
        val name : String,
        val avatar : String,
        val movie_count : Int
    ) : HomeRecyclerViewItem()
}
