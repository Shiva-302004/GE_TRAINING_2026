package org.gevernova.JavaEightFeatures.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DayLightSaving {
    public static void main(String[] args) {
        ZoneId zone=ZoneId.systemDefault();
        ZonedDateTime now= ZonedDateTime.now(zone);

        boolean isDST=zone.getRules().isDaylightSavings(now.toInstant());

        System.out.println("Daylight Saving Active: " + isDST);
    }
}
