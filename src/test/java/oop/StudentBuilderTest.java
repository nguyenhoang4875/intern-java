package oop;

import org.junit.Assert;
import org.junit.Test;

public class StudentBuilderTest {

    @Test
    public void test_StudentBuild(){
        StudentBuilder studentBuilder = new StudentBuilder();
        studentBuilder.setId(1);
        studentBuilder.setFirstName("John");
        studentBuilder.setLastName("Doe");
        studentBuilder.setClassName("IT");
        studentBuilder.setAddress("New York, US");

        Assert.assertEquals(studentBuilder.build().toString(),"Student{id=1, firstName='John', lastName='Doe', className='IT', address='New York, US'}");

    }

}
