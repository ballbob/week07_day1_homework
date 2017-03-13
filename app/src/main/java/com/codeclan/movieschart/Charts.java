package com.codeclan.movieschart;

import java.util.ArrayList;

/**
 * Created by user on 13/03/2017.
 */

public class Charts {
    private ArrayList<Movie> films;

    public Charts(){
        films = new ArrayList<Movie>();
    }

    public int getLength(){
        return films.size();
    }

    public void addAtRank(Movie film){
        int ranking = film.getCurrentRanking() - 1;
        films.add(ranking, film);
    }

    public int getMovieRanking(int index){
        Movie film = films.get(index);
        return film.getCurrentRanking();
    }

}
