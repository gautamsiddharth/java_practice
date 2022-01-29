package day7;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Office {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sid", 500, LocalDate.now());

        Employee employee2 = new Employee("Ram", 1000, LocalDate.now());
        employee2.setAge(30);

        Logger.getGlobal().info(employee1.getName());
        Logger.getGlobal().info(employee2.getName());


    }
}
