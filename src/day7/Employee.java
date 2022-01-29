package day7;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Employee {

    private String name;  //Required
    private  Double salary;  //Required
    private LocalDate joiningDate;  //Required
    private int age;  //Optional data


    public Employee(String name, double salary, LocalDate joiningDate){

        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;


    }



    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public int getAge() {
        return age;
    }
}
