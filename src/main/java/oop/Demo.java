package oop;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setId(1);
        studentBuilder.setFirstName("teo");
        studentBuilder.setLastName("le");
        studentBuilder.setClassName("English");
        studentBuilder.setAddress("Da Nang");

        Student student = studentBuilder.build();

        StudentController studentController = new StudentController();

        studentController.addStudent(student);
        studentController.addStudent(new Student(2, "ti", "le", "Math", "QN"));
        studentController.addStudent(new Student(3, "bin", "le", "Physic", "QN"));

        studentController.deleteStudent(student);

        List<Student> studentsFromFile = studentController.loadFromFile("data/input-student.json");
        studentController.getById(2);
        studentController.findByName("ti");
        studentController.findByClassName("Math");
        studentController.saveToPath("data/output-student.json");
    }
}
