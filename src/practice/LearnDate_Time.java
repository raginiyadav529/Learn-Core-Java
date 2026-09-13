package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LearnDate_Time {

    public static void main(String[]args) {

        LocalDate date = LocalDate.now();
        System.out.println("Date : "+date);

        LocalTime time = LocalTime.now();
        System.out.println("Time : "+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date Time and before formatting : "+dateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatter = dateTime.format(dateTimeFormatter);
        System.out.println("After formating : "+formatter);
    }
}
