package com.codeclan.movieschart;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie("Titenic","Romentic horrur",1);
    }

    @Test
    public void getTitleTest(){
        assertEquals("Titenic", movie.getTitle());
    }

    @Test
    public void getGenreTest(){

        assertEquals("Romentic horrur",movie.getGenre());
    }

    @Test
    public void getCurrentRankingTest() {
        assertEquals(1, movie.getCurrentRanking());
    }

    @Test
    public void setMovieTitleTest(){
        movie.setTitle("Titanic");
        assertEquals("Titanic",movie.getTitle());
    }

    @Test
    public void setMovieGenreTest(){
        movie.setGenre("Erotic musical");
        assertEquals("Erotic musical",movie.getGenre());
    }

    @Test
    public void setMovieRankingTest(){
        movie.setCurrentRanking(2);
        assertEquals(2,movie.getCurrentRanking());
    }

    @Test
    public void overrideDefaultStringTest(){
        assertEquals("Titenic (Romentic horrur) at 1",movie.toString());
    }
}
