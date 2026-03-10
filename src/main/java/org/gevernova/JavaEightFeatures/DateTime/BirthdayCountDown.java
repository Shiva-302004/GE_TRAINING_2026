package org.gevernova.JavaEightFeatures.DateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCountDown {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(today.getYear(), 7, 30);
        if(birthday.isBefore(today)){
            birthday = birthday.plusYears(1);
        }
        System.out.println(ChronoUnit.DAYS.between(today, birthday));
    }
}
