package org.gevernova.JavaEightFeatures.DateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeConversion {
    public static void main(String[] args) {
        java.time.ZonedDateTime localTime = java.time.ZonedDateTime.now();
        ZonedDateTime otherTime =
                localTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(otherTime);
    }
}
