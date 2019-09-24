package com.gfarkas.data_structures.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {

    private int id;
    private String fname;
    private double cgpa;

    Student(int id, String fname, double cgpa) {

        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;

    }

    int getId() {

        return id;

    }

    String getFname() {

        return fname;

    }

    double getCgpa() {

        return cgpa;

    }

}

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();

        while (testCases > 0) {

            int id = in.nextInt();

            String fname = in.next();

            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);

            studentList.add(st);

            testCases--;

        }

        studentList.sort(Comparator.comparing(Student::getCgpa).reversed().
                thenComparing(Student::getFname).thenComparing(Student::getId));

        for (Student st : studentList) {

            System.out.println(st.getFname());

        }

    }

}


