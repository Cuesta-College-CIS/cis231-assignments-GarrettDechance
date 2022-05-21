// package FinalExam.question3;

public class Course implements CourseActivity {
    String cid;
    String cname;
    Integer score;
    String grade;

    public Course(String id, String name, Integer c, String g) {
        cid = id;
        cname = name;
        score = c;
        grade = g;
    }

    public Course(String id, String name, Integer c) {
        cid = id;
        cname = name;
        score = c;
        grade = decideGrade();
    }

    public String toString() {
        return ("Course ID:\t " + cid + "\tName: " + cname + "\tScore " + score + "\tGrade " + grade + "\n");
    }

    @Override
    public String decideGrade() {
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        return grade;
    }

    @Override
    public void printCourseInfo() {
        System.out
                .println("Course ID\t\t: " + cid + "\tName: " + cname + "\tScore " + score + "\tGrade " + grade + "\n");
    }
}
