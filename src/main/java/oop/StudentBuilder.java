package oop;

public class StudentBuilder extends Student {

    public StudentBuilder() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student build() {
        return new Student(id, firstName, lastName, className, address);
    }
}
