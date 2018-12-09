package holiday;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ChristmasTest {

    private Christmas christmas;

    @Test
    public void todayIsChristmas () {
        christmas = new Christmas("2018-12-25");
        assertThat(christmas.isChristmas(), is("Merry Christmas!"));
    }

    @Test
    public void todayIsNotChristmas () {
        christmas = new Christmas("2018-12-29");
        assertThat(christmas.isChristmas(), is("Today is Not Christmas TT"));
    }
}
