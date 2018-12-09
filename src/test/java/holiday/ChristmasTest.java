package holiday;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ChristmasTest {

    @Test
    public void todayIsNotChristmas () {
        final Christmas christmas = new Christmas();
        assertThat(christmas.isChristmas(), is(false));
    }
}
