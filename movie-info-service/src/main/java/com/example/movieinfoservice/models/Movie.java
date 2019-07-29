package com.example.movieinfoservice.models;

public class Movie {

    private String movieId;
    private String name;

    public Movie() {
    }

    public Movie(String movieId, String name) {
        this.movieId = movieId;
        this.name = name;
    }

    public String getMoviesId() {
        return movieId;
    }

    public void setMoviesId(String moviesId) {
        this.movieId = moviesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
