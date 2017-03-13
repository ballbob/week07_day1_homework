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

    public Movie getMovie(int index){
        return films.get(index);
    }

    public void swapRank(Movie movie1,Movie movie2){

        //first, find the index by taking the ranking they are at
        int movieOneIndex = movie1.getCurrentRanking()-1;
        int movieTwoIndex = movie2.getCurrentRanking()-1;

        //second,find the movie in the films arraylist
        Movie movieOne = getMovie(movieOneIndex);
        Movie movieTwo = getMovie(movieTwoIndex);

        //then, set their current ranking to be one anothers
        movieOne.setCurrentRanking(movieTwoIndex+1);
        movieTwo.setCurrentRanking(movieOneIndex+1);

        //finally, add them using addAtRank. Now you have changed both
        //their rank and their position in the index.
        addAtRank(movieTwo);
        addAtRank(movieOne);
    }

}
