package ArrayList_Sort_Comparator;

/*
    ---> Write a program to sort ArrayList using Comparable and Comparator
        Using Comparator

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;


class Student {
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

    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            String stuName1 = o1.getStuName().toUpperCase(Locale.ROOT);
            String stuName2 = o2.getStuName().toUpperCase(Locale.ROOT);

            return stuName1.compareTo(stuName2);
        }
    };

    public static Comparator<Student> StuGradeComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            double stuGrade1 = o1.getStuGrade();
            double stuGrade2 = o2.getStuGrade();
            return Double.compare(stuGrade1,stuGrade2);
        }
    };

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

        students.add(new Student("cengizhan", 892, 4.99));
        students.add(new Student("selin", 623, 3.59));
        students.add(new Student("ismail", 728, 2.67));
        students.add(new Student("salime", 280, 3.89));
        students.add(new Student("chivas", 480, 4.51));

        for(Student stu: students){
            System.out.println(stu);
        }

        Collections.sort(students, Student.StuNameComparator);

        System.out.println("--------------------StuNameComparator-----------------------");

        for(Student stu: students){
            System.out.println(stu);
        }

        Collections.sort(students, Student.StuGradeComparator);

        System.out.println("--------------------StuGradeComparator-----------------------");

        for(Student stu: students){
            System.out.println(stu);
        }
    }
}
