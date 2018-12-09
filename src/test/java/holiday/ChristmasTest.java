package holiday;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDateTime;

import org.junit.Test;

public class ChristmasTest {

    private Christmas christmas;

    @Test
    public void todayIsNotChristmas () {
        final LocalDateTime dateTime = LocalDateTime.of(2018, 12, 9, 10, 10, 0);
        christmas = new Christmas(dateTime);
        assertThat(christmas.isChristmas(), is(false));
    }
}
