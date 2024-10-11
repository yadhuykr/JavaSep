package classes.others;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
public class calendar {

        public static void main(String[] args) {
            ZonedDateTime dateTime = ZonedDateTime.parse("2024-09-26T00:00:00Z");

            // Format in UTC
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a z");
            System.out.println("Default UTC formatting: " + dateTime.format(formatter));

            // Format in a specific time zone (like EST)
            ZoneId estZone = ZoneId.of("Pacific/Kwajalein");
            ZonedDateTime dateTimeInEST = dateTime.withZoneSameInstant(estZone);
            System.out.println("Default EST formatting: " + dateTimeInEST.format(formatter));
        }
    }


