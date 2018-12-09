package holiday;

import java.time.LocalDateTime;
import java.time.Month;

public class Christmas {

    private final LocalDateTime dateTime;

    public Christmas(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isChristmas() {
        if (dateTime.getMonth() == Month.DECEMBER && dateTime.getDayOfMonth() == 25) {
            return true;
        }
        return false;
    }

}
