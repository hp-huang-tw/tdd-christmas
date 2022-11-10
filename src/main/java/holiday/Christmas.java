package holiday;

import java.time.LocalDate;
import java.time.Month;

public class Christmas {

    private final LocalDate dateTime;

    public Christmas(String date) {
        dateTime = LocalDate.parse(date);
    }

    public String isChristmas() {
        if (dateTime.getMonth() == Month.DECEMBER && dateTime.getDayOfMonth() == 25) {
            return "Merry Christmas!";
        }
        return "Today is Not Christmas TT";
    }

}
