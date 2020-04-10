package oop;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void test_Student() {
        Student student = new Student();
        student.setId(1);
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setClassName("IT");
        student.setAddress("New York, US");

        Assert.assertEquals(student.getId(), 1);
        Assert.assertEquals(student.getFirstName(), "John");
        Assert.assertEquals(student.getLastName(), "Doe");
        Assert.assertEquals(student.getAddress(), "New York, US");
        Assert.assertEquals(student.getClassName(), "IT");
        Assert.assertEquals(student.toString(), "Student{id=1, firstName='John', lastName='Doe', className='IT', address='New York, US'}");

        Student student1 = new Student(2,"Smith","Taylor","AI","London, UK");
    }
}
