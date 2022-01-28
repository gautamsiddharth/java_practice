package day6;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class PredefinedClass {
    public static void main(String[] args) {
        double randomNumber = Math.random();
        Logger.getGlobal().info(String.valueOf(randomNumber));


        Date date = new Date();
        Logger.getGlobal().info(String.valueOf(date));

        LocalDate localDate = LocalDate.now();
        Logger.getGlobal().info(String.valueOf(localDate));

        LocalTime localTime = LocalTime.now();
        Logger.getGlobal().info(String.valueOf(localTime));

        LocalDateTime localDateTime = LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf(localDateTime));

        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));

        //Dateformatter
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm a");
        String formattedDate = dateFormatter.format(localDateTime);
        Logger.getGlobal().info(String.valueOf(formattedDate));




    }
}
