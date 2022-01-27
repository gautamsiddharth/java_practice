package day2;

public class Student {


    // name
    // phoneNumber
    // dob
    // class
    // rollNumber
    // address
    // idNumber
    // email
    // username
    // password
    // emergencyContactNumber
    // socialSecurityNumber


    public String name;
    String phoneNumber;
    String dob;
    String sClass;
    String address;
    String rollNumber;
    int idNUmber;
    String email;
    String username;
    String password;
    String emergencyContactNumber;
    String SocialSecurityNumber;


    public void playing(){
        System.out.println("Student is playing");
    }


    public static void main(String[] args) {
        Student student1 = new Student(); // Student object

        student1.name = "Sid";
        System.out.println(student1.name);
        student1.playing();



        Student student2 = new Student();
        student2.name = "Ram";




    }











}
