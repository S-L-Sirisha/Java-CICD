public class StudentGrade {

    public static String calculateGrade(int marks) {

        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        String studentName = "Sirisha";
        int marks = 85;

        String grade = calculateGrade(marks);

        System.out.println("Student Name: " + studentName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}