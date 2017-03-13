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

    public void add(Movie film){
        films.add(film);
    }

    public int getLength(){
        return films.size();
    }

}
