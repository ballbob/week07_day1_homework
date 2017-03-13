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
    Charts charts;

    @Before
    public void before(){
        movie1 = new Movie("Titenic","Romentic horrur",1);
        movie2 = new Movie("Spiddermin","Period drama",2);
        charts = new Charts();
    }

    @Test
    public void canGetLengthandChartStartsEmpty(){
      assertEquals(0,charts.getLength());
    }
}
