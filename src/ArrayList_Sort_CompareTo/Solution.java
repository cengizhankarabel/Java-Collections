package ArrayList_Sort_CompareTo;

/*
    ---> Write a program to sort ArrayList using Comparable and Comparator
        Using Comparable compareTo() method

 */

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable{
    private String stuName;
    private int stuId;
    private double stuGrade;

    public Student(String stuName, int stuId, double stuGrade) {
        this.stuName = stuName;
        this.stuId = stuId;
        this.stuGrade = stuGrade;
    }

    public String getStuName() {
        return stuName;
    }

    public int getStuId() {
        return stuId;
    }

    public double getStuGrade() {
        return stuGrade;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public void setStuGrade(double stuGrade) {
        this.stuGrade = stuGrade;
    }

    @Override
    public int compareTo(Object o) {
        int compareStuId = ((Student)o).getStuId();
        return this.stuId-compareStuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuId=" + stuId +
                ", stuGrade=" + stuGrade +
                '}';
    }
}

public class Solution {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("cengizhan", 101, 4.99));
        students.add(new Student("selin", 601, 3.59));
        students.add(new Student("ismail", 780, 2.67));
        students.add(new Student("salime", 280, 3.89));
        students.add(new Student("chivas", 480, 4.51));

        for(Student stu: students){
            System.out.println(stu);
        }

        System.out.println("-------------------------------------------");

        Collections.sort(students);

        for(Student stu: students){
            System.out.println(stu);
        }
    }
}
