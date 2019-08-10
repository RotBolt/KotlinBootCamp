
fun main() {
//    println("Hello")
//
//    val name = "Rohan"
//    var tech = "Kotlin"
//    tech = "C++"
//    println("My name is $name")

//    dataTypeDemo()

   // mathAction()
//    countTo(10)

    val list = mutableListOf("Action")
    list.add("Scifi")
    val movie = Movie("Iron Man",2008,4.3,
        listOf("Action","Sci-fi"),"Anthony russo")

    println(movie.name)

    for (movie in marvelMovies){
        println(movie)
    }
}


