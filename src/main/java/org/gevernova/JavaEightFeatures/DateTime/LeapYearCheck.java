package org.gevernova.JavaEightFeatures.DateTime;

import java.time.Year;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year= Year.now().getValue();

        if(Year.isLeap(year)){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }
}
