package io.dagger.moviekotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvList.text = getMovieString(marvelMovies)

        btnAction.setOnClickListener {
            val list = marvelMovies.filter {
                it.genre.contains("Action")
            }
            tvList.text = getMovieString(list)
        }

        btnMyth.setOnClickListener {
            val list = marvelMovies.filter {
                it.genre.contains("Mythology")
            }
            tvList.text = getMovieString(list)
        }

        btn4_7.setOnClickListener {
            val list = marvelMovies.filter {
                it.rating >=4.7
            }
            tvList.text = getMovieString(list)
        }

        btn2016.setOnClickListener {
            val list = marvelMovies.filter {
                it.year >=2016
            }
            tvList.text = getMovieString(list)
        }

    }

    fun filter(): List<String> {
        val ml = mutableListOf<String>()
        for (i in marvelMovies) {
            val genre = i.genre
            for (g in genre) {
                if (g == "Action")
                    ml.add(i.name)
            }
        }
        return ml
    }

    fun getMovieString(list:List<Movie>): String {
        val sb = StringBuilder()
        for (movie in list) {
            sb.append("${movie.name} \n")
        }
        return sb.toString()
    }
}
