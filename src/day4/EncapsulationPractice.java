package day4;

public class EncapsulationPractice {

    public static void main(String[] args) {
        Student student1 = new Student(); // Student object
        // student1.name = "Sid";
        student1.setName("Sid");
        student1.setSocialSecurityNumber("12345678");


        student1.playing();

        Student student2 = new Student();
        student2.setName("Ram");




        System.out.println(student1.getName());
        System.out.println(student2.getName());
     //   System.out.println(student2.getSocialSecurityNumber());





    }

}
