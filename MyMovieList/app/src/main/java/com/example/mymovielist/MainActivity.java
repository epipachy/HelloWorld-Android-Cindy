package com.example.mymovielist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerMovie;
    ArrayList<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerMovie = findViewById(R.id.recyclerMovie);

        movieList = new ArrayList<>();

        movieList.add(new Movie(
                R.drawable.deadpoetsociety,
                "Dead Poets Society",
                "Drama",
                "10/10"
        ));

        movieList.add(new Movie(
                R.drawable.prideandprejudice,
                "Pride and Prejudice",
                "Romance",
                "10/10"
        ));

        movieList.add(new Movie(
                R.drawable.spiritedaway,
                "Spirited Away",
                "Fantasy",
                "9/10"
        ));

        movieList.add(new Movie(
                R.drawable.beforesunrise,
                "Before Sunrise",
                "Romance",
                "9/10"
        ));

        movieList.add(new Movie(
                R.drawable.monster,
                "Monster",
                "Coming of Age",
                "10/10"
        ));

        movieList.add(new Movie(
                R.drawable.theautopsyofjanedoe,
                "The Autopsy of Jane Doe",
                "Horror",
                "10/10"
        ));

        movieList.add(new Movie(
                R.drawable.themanfromnowhere,
                "The Man From Nowhere",
                "Action",
                "9/10"
        ));

        movieList.add(new Movie(
                R.drawable.weapons,
                "Weapons",
                "Thriller",
                "9/10"
        ));

        MovieAdapter adapter = new MovieAdapter(movieList);

        recyclerMovie.setLayoutManager(
                new LinearLayoutManager(this)
        );

        recyclerMovie.setAdapter(adapter);
    }
}