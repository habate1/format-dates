package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatDatesApp {
    public static void main(String[] args) {
        /*
        EXERCISE 2
        Create a Java application named format-dates. The application will get the current
        date and time and display that information in the following formats

        04/22/2026
        2026-04-22
        Wednesday, April 22, 2026
        Wednesday, Apr 22, 2026 10:02  display in GMT time
         */

        // create variable with correct formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, MMMM, dd, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy  HH:mm");

        //get the date right now



    }
}