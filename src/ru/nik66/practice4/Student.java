package ru.nik66.practice4;

public class Student {

    public static final int MIN_NAME_LENGTH = 1;
    public static final int MIN_STUDENT_AGE = 1;
    public static final int MAX_STUDENT_AGE = 100;
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) throws StudentNameException, StudentAgeException {
        setName(name);
        setAge(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getAge() != student.getAge()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws StudentNameException {
        if (name.length() > MIN_NAME_LENGTH) {
            this.name = name;
        } else {
            throw new StudentNameException("Student name must be more then " + MIN_NAME_LENGTH + " symbols");
        }
    }

    public void setAge(int age) throws StudentAgeException {
        if (age > MIN_STUDENT_AGE && age < MAX_STUDENT_AGE) {
            this.age = age;
        } else {
            throw new StudentAgeException("Student's age must be between " + MIN_STUDENT_AGE + " and " + MAX_STUDENT_AGE);
        }
    }

}
