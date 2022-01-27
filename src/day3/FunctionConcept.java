package day3;

public class FunctionConcept {

    public static void main(String[] args) {

        int a= 2;
        int b= 3;
        add(a,b);
        int result = addition(a,b);

        int d = 6;
        int e = 5;
        add(d ,e);

    }
    //no returns
    public static void add(int a, int b){
        int c = a + b;
        System.out.println(c);
    }

    // returns value

    public static int addition(int a, int b){
        int c = a + b;
        System.out.println(c);
        return c;
    }
}
