package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // create a list of students
        List<Student> students = new ArrayList<>();
        // add some students to the list
        students.add(new Student("Bob", "Peterson"));
        students.add(new Student("Kate", "Thompson"));
        students.add(new Student("Johnny", "Beware"));
        students.add(new Student("John", "Adams"));

        System.out.println("Before Sorting");
        students.forEach(student -> System.out.println(student.getFullName()));

        students.sort(Comparator.comparing(Student::getLastName));

        /* or u can do sorting with this
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // compare last names for sorting
                return s1.getLastName().compareToIgnoreCase(s2.getLastName());
            }
        });
        */

        // print new line
        System.out.println();
        // print first and last name if students after sorting
        System.out.println("After Sorting");
        students.forEach(student -> System.out.println(student.getFullName()));
    }
}