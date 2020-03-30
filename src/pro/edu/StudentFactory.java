package pro.edu;

public class StudentFactory {

    public static Student  create(String name, int age){

        // Any logic
        if (age < 16) return null;

        return new Student(name, age);
    }

}
