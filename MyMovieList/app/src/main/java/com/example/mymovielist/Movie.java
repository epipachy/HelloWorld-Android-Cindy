package com.example.mymovielist;
public class Movie {

    int poster;
    String title, genre, rating;

    public Movie(int poster, String title, String genre, String rating) {
        this.poster = poster;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public int getPoster() {
        return poster;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }
}