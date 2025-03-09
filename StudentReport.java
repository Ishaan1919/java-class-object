class Student{
    String name;
    int rollNumber;
    int marks;

    Student(String name, int rollNumber, int marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    String calculateGrade(){
        if (marks >= 90){
            return "A";
        }
        else if (marks >= 80){
            return "B";
        }
        else if (marks >= 70){
            return "C";
        }
        else if (marks >= 60){
            return "D";
        }
        else{
            return "F";
        }
    }

    void displayDetails(){
        System.out.println("Name of the student is " + name);
        System.out.println("Roll Number of the student is " + rollNumber);
        System.out.println("Marks of the student are " + marks);
        System.out.println("Grade of the student is " + calculateGrade());
    }
}

public class StudentReport{
    public static void main(String[] args){
        String name = "Ishaan";
        int rollNumber = 11;
        int marks = 90;
        Student student = new Student(name,rollNumber,marks);
        student.displayDetails();
    }
}