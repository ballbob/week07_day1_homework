package com.codeclan.movieschart;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 13/03/2017.
 */

public class ChartsTest {

    Movie movie1;
    Movie movie2;
    Movie movie3;
    Charts charts;

    @Before
    public void before(){
        movie1 = new Movie("Titenic","Romentic horrur",1);
        movie2 = new Movie("Spiddermin","Period drama",2);
        movie3 = new Movie("Goan Wi E Wind","Holstcore",3);
        charts = new Charts();
    }

    @Test
    public void canGetLengthandChartStartsEmpty(){
      assertEquals(0,charts.getLength());
    }

    @Test
    public void canAddFilmAtRank(){
        charts.addAtRank(movie1);
        assertEquals(1,charts.getLength());
    }

    @Test
    public void canRetrieveRanking(){
        charts.addAtRank(movie1);
        charts.addAtRank(movie2);
        charts.addAtRank(movie3);
        assertEquals(1,charts.getMovieRanking(0));
        assertEquals(2,charts.getMovieRanking(1));
        assertEquals(3,charts.getMovieRanking(2));
    }

}
