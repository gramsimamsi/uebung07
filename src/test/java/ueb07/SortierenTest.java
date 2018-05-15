package ueb07;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class SortierenTest {

    @Test
    void testSwap() {

        Integer[] arrayInt = {0, 3, 5};
        Sortieren.swap(arrayInt, 0, 1);

        assertEquals(Integer.valueOf(3), arrayInt[0]);
        assertEquals(Integer.valueOf(0), arrayInt[1]);
        assertEquals(Integer.valueOf(5), arrayInt[2]);

        String[] arrayString = {"abc", "bcd", "cia"};
        Sortieren.swap(arrayString, 1, 2);

        assertEquals("cia", arrayString[1]);
    }

    @Test
    void testStudentMatrikelSortieren(){

        Student s1 = new Student(111, "Bruce");
        Student s2 = new Student(123, "Willis");
        Student s3 = new Student(666, "Aber-Will");
        Student s4 = new Student(999, "Smith?");

        Student[] array = {s4, s3, s1, s2};
        System.out.println(Arrays.toString(array));

        Sortieren.bubbleSort(array, 0, 3);
        System.out.println(Arrays.toString(array));

        assertEquals("Smith?", array[3].getName());
        assertEquals("Bruce", array[0].getName());
    }

    @Test
    void testStudentNameSortieren(){

        Student s1 = new Student(111, "Bruce");
        Student s2 = new Student(123, "Willis");
        Student s3 = new Student(666, "Aber-Will");
        Student s4 = new Student(999, "Smith?");

        Student[] array = {s4, s3, s1, s2};
        System.out.println(Arrays.toString(array));

        Sortieren.bubbleSort(array, 0, 3, Student.getComparator());
        System.out.println(Arrays.toString(array));

        assertEquals("Smith?", array[2].getName());
        assertEquals("Bruce", array[1].getName());
    }

    @Test
    void testStudentNameSortierenComplex(){

        Student s1 = new Student(111, "Bruce");
        Student s2 = new Student(123, "Bruce");
        Student s3 = new Student(666, "Aber");
        Student s4 = new Student(999, "Aber");

        Student[] array = {s4, s3, s1, s2};
        System.out.println(Arrays.toString(array));

        Sortieren.bubbleSort(array, 0, 3, Student.getComparatorComplex());
        System.out.println(Arrays.toString(array));

        assertEquals(666, array[0].getMatrikel());
        assertEquals("Aber", array[0].getName());

        assertEquals(111, array[2].getMatrikel());
        assertEquals("Bruce", array[2].getName());
    }
}