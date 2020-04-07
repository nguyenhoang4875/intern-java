package oop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentController {


    private List<Student> students;

    public StudentController() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    public void saveToPath(String path) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(path), students);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<Student> loadFromFile(String path) {
        ObjectMapper mapper = new ObjectMapper();

        TypeReference<List<Student>> mapType = new TypeReference<List<Student>>() {
        };
        List<Student> students = null;
        try {
            students = mapper.readValue(new File(path), mapType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public Student getById(int id) {
        return students.stream().filter(student -> student.id == id).findFirst().get();
    }

    public Student findByName(String firstName) {
        return students.stream().filter(student -> student.firstName == firstName).findFirst().get();
    }

    public Student findByClassName(String className) {
        return students.stream().filter(student -> student.className == className).findFirst().get();
    }

    public List<Student> getStudents() {
        return this.students;
    }

}
