package day7;

import java.util.Locale;
import java.util.logging.Logger;

public class StringPractice {
    public static void main(String[] args) {

        //  String name = new String("Sid");
        String name = "Sid Gautam";

        String lowerCaseString = name.toLowerCase();
        Logger.getGlobal().info(lowerCaseString);

        String firstName = name.substring(0,4);
        Logger.getGlobal().info(firstName);

        String lastName = name.substring(4);
        Logger.getGlobal().info(lastName);

        String fullName = firstName + lastName;
        Logger.getGlobal().info(fullName);

        String time = "AM" + 21 + 9;
        Logger.getGlobal().info(time);

        String joinExample = String.join("/", "S", "M", "L", "XL");
        Logger.getGlobal().info(joinExample);

        Logger.getGlobal().info(String.valueOf(fullName.length()));










    }


}
