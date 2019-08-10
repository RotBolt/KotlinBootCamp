package io.dagger.moviekotlin

data class Movie(
    val name:String,
    val year:Int,
    val rating:Double,
    val genre:List<String>,
    val author:String
)


val marvelMovies = listOf(
    Movie("Captain America: Civil War", 2016, 4.5, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Thor:Ragnarok", 2017, 4.8, listOf("Mythology", "Adventure"), "Anthony Russo"),
    Movie("Iron Man 2", 2013, 4.7, listOf("Action", "Sci-fi"), "Anthony Russo"),
    Movie("Iron Man 3", 2015, 4.8, listOf("Sci-fi"), "Anthony Russo"),
    Movie("Avengers", 2012, 4.5, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Avengers: Age of Ultron", 2015, 4.5, listOf("Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Avengers: Infinity War", 2018, 4.8, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo"),
    Movie("Avengers: EndGame", 2019, 4.9, listOf("Action", "Sci-fi", "Adventure"), "Anthony Russo")
)






