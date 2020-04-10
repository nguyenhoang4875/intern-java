package oop;

import org.junit.Assert;
import org.junit.Test;

public class StudentControllerTest {

    @Test
    public void test_StudentController(){

        StudentController studentController = new StudentController();
        Student student = new Student(1,"John","Doe","IT","New York, US");
        studentController.addStudent(student);
        studentController.getStudents();
        Assert.assertEquals(studentController.findByName("John"),student);
        Assert.assertEquals(studentController.findByClassName("IT"),student);
        Assert.assertEquals(studentController.getById(1),student);
        studentController.deleteStudent(student);
    }
}
