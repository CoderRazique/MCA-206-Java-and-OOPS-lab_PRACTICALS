// 12. Write a Java program for Hierarchical Inheritance.

class College {
    String collegeName = "LNCT BHOPAL";

    void printCollege() {
        System.out.println("College name : " + collegeName);
    }
}

class Student extends College {
    String studentName;
    int rollNo;

    Student(String studentName, int rollNo) {
        this.studentName = studentName;
        this.rollNo = rollNo;
    }

    void printStudent() {
        System.out.println("Student name : " + studentName);
        System.out.println("Student roll number : " + rollNo);
    }
}

class Faculty extends College {
    String teacherName;
    int id;
    String subName;

    Faculty(String teacherName, int id, String subName) {
        this.id = id;
        this.teacherName = teacherName;
        this.subName = subName;
    }

    void printStudent() {
        System.out.println("Faculty id : " + id);
        System.out.println("Faculty  name : " + teacherName);
        System.out.println("Faculty  subject : " + subName);
    }
}

public class assignment12_hierarchicalInheritance {
    public static void main(String[] args) {
        Student student = new Student("Md Abdul Razique", 135);
        student.printCollege();
        student.printStudent();

        Faculty faculty = new Faculty("Dev Chauhan", 10001, "Software Engineering");
        faculty.printCollege();
        faculty.printStudent();
    }
}
