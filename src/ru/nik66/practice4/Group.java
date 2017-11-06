package ru.nik66.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Group {

    public static final int MIN_NAME_LENGTH = 1;
    public static final int MIN_POSITION = 0;
    private String name;
    private Student[] students;

    public String printStudents() {
        return Arrays.toString(students);
    }

    private boolean findDublicates(Student studentArg) {
        for (Student student : students) {
            if (studentArg.equals(student)) {
                return true;
            }
        }
        return false;
    }

    public void addStudent() throws GroupAddStudentExcepion {
        addStudent(Group.createStudent());
    }

    public void addStudent(Student student) throws GroupAddStudentExcepion {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                addStudent(student, i);
                return;
            }
        }
        System.out.println("Group " + getName() + " is full.");
    }

    public void addStudent(Student student, int position) throws GroupAddStudentExcepion {
        if (position >= MIN_POSITION && position < students.length) {
            if (!findDublicates(student)) {
                students[position] = student;
            } else {
                throw new GroupAddStudentExcepion("Dublicate finded");
            }
        } else {
            throw new GroupAddStudentExcepion("Wrong position: " + position + ", must be from " + MIN_POSITION + " to " + students.length);
        }
    }

    public void addStudents() throws GroupAddStudentExcepion {
        for (int i = 0; i < students.length; i++) {
            addStudent(Group.createStudent(), i);
        }
    }

    private static Student createStudent() {
        Student student = new Student();
        while (true) {
            System.out.println("Input student name: ");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseSin(System.in)))) {
                student.setName(br.readLine());
                break;
            } catch (StudentNameException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new UncloseSin(System.in)))){
                student.setAge(readNumber(br, "Input student age: "));
                break;
            } catch (StudentAgeException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return student;
    }

    private static int readNumber(BufferedReader br, String message) throws IOException {
        int number;
        while (true) {
            System.out.println(message);
            try {
                number = Integer.parseInt(br.readLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong value format");
            }
        }
        return number;
    }

    public Group(String name, int groupSize) throws GroupNameException {
        setName(name);
        // groupSize реализовать защиту
        students = new Student[groupSize];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws GroupNameException {
        if (name.length() > 1) {
            this.name = name;
        } else {
            throw new GroupNameException("Group name must be more then " + MIN_NAME_LENGTH + " symbols");
        }
    }
}
