package set;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    public int rollNo;

    public Student(int rollNo,String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String name;


    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public int compareTo(Student that) {
        return this.rollNo - that.rollNo;
    }
}


