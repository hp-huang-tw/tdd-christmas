package holiday;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class Christmas {

    public boolean isChristmas() {
        final Instant now = Instant.now();
        final LocalDateTime dateTime = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        if (dateTime.getMonth() == Month.DECEMBER && dateTime.getDayOfMonth() == 25) {
            return true;
        }
        return false;
    }

}
