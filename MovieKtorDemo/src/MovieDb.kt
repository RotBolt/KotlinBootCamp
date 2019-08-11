package com.movie

data class Movie(
    val name: String,
    val year: Int,
    val rating: Float,
    val genre: List<String>,
    val director: String? = null
)


 val marvelMovies = listOf(
    Movie("Captain America: Civil War", 2016, 4.5f, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Thor:Ragnarok", 2017, 4.8f, listOf("Mythology", "Adventure"), "Anthony Russo"),
    Movie("Iron Man 2", 2013, 4.7f, listOf("Action", "Sci-fi"), "Anthony Russo"),
    Movie("Iron Man 3", 2015, 4.8f, listOf("Sci-fi"), "Anthony Russo"),
    Movie("Avengers", 2012, 4.5f, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Avengers: Age of Ultron", 2015, 4.5f, listOf("Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Avengers: Infinity War", 2018, 4.8f, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Avengers: EndGame", 2019, 4.9f, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo")
)