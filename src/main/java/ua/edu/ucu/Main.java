package ua.edu.ucu;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Ivar", "Grimstad", 3.9, 2),
                new Student("Ittai", "Zeidman", 4.5, 1),
                new Student("Antons", "Kranga", 4.0, 2),
                new Student("Burr", "Sutter", 4.2, 2),
                new Student("Philipp", "Krenn", 4.3, 3),
                new Student("Tomasz", "Borek", 4.1, 2),
                new Student("Ittai", "Zeidman", 4.5, 1),
                new Student("Burr", "Sutter", 4.2, 2)};
        String[] studentNames =
                SmartArrayApp.findDistinctStudentNamesFrom2ndYearWithGPAgt4AndOrderedBySurname(students);
        String[] expectedStudentNames = {"Borek Tomasz", "Kranga Antons", "Sutter Burr"};

        System.out.println(Arrays.toString(studentNames));
    }
}
