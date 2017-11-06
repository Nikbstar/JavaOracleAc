package ru.nik66.practice4;

public class App {

    public static final int STUDENTS_NUM = 2;

    public static void main(String[] args) throws GroupNameException, GroupAddStudentExcepion {
        Group group = new Group("First", STUDENTS_NUM);
        group.addStudent();
        group.addStudent();
        group.addStudent();
        System.out.println(group.printStudents());
    }

}
