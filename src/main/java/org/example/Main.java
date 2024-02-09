package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> studentsMath = new ArrayList<>();
        List<String> studentsScience = new ArrayList<>();
        List<String> studentsHistory = new ArrayList<>();
        List<String> studentsArt = new ArrayList<>();

        Student student1 = new Student("1", "John Doe", "1234 Main St", "A");
        Student student2 = new Student("2", "Jane Doe", "1234 Main St", "A");
        Student student3 = new Student("3", "Tom Smith", "1234 Main St", "B");
        Student student4 = new Student("4", "Jerry Smith", "1234 Main St", "B");
        Student student5 = new Student("5", "Rick Sanchez", "1234 Main St", "C");

        //Zuteilung der Schüler zu den Kursen
        studentsMath.add(String.valueOf(student1));
        studentsMath.add(String.valueOf(student3));
        studentsMath.add(String.valueOf(student4));
        studentsMath.add(String.valueOf(student5));
        System.out.println("Math Students: " + studentsMath);

        studentsScience.add(String.valueOf(student2));
        studentsScience.add(String.valueOf(student5));
        System.out.println("Science Students: " + studentsScience);

        studentsHistory.add(String.valueOf(student1));
        studentsHistory.add(String.valueOf(student2));
        studentsHistory.add(String.valueOf(student3));
        System.out.println("History Students: " + studentsHistory);
        System.out.println();

        //Übersicht der Lehrer
        Teacher teacher1 = new Teacher("1", "Mr. Johnson", "Math");
        //Mr. Johnson ist krank, stattdessen springt Mr. Müller ein
        Teacher deputyTeacher = teacher1.withName("Mr. Müller");
        Teacher teacher2 = new Teacher("2", "Mrs. Smith", "Science");
        Teacher teacher3 = new Teacher("3", "Mr. Sanchez", "History");

        System.out.println(teacher1);
        System.out.println("Vertretung: " + deputyTeacher);
        System.out.println();

        Course courseMath = new Course("1", "Math with Johnson", deputyTeacher, studentsMath);
        Course courseScience = new Course("2", "Science with Smith", teacher2, studentsScience);
        Course courseHistory = new Course("3", "History with Sanchez", teacher3, studentsHistory);

        courseMath.setName("Math with Müller");
        String courseMathNew = courseMath.getName();
        System.out.println(courseMathNew);
        System.out.println();

        System.out.println(courseMath);
        System.out.println(courseScience);
        System.out.println(courseHistory);
        System.out.println();

        //Student 2 hat sich verschlechtert und hat nun die Note C
        student2.setGrade("C");
        System.out.println(student2);
        student5.setGrade("F");
        System.out.println(student5);
        student4.setGrade("A");
        System.out.println(student4);
        System.out.println();

        //Builder
        Student student6 = Student.builder()
                .ID("6")
                .name("Morty Smith")
                .address("1234 Main St")
                .grade("A")
                .build();
        System.out.println(student6);
        studentsArt.add(String.valueOf(student6));
        System.out.println();

        Teacher teacher4 = Teacher.builder()
                .ID("4")
                .name("Mrs. Pinsel")
                .subject("Art")
                .build();
        System.out.println(teacher4);

        Course courseArt = Course.builder()
                .ID("4")
                .name("Art with Pinsel")
                .teacher(teacher4)
                .students(studentsArt)
                .build();
        System.out.println(courseArt);


    }
}