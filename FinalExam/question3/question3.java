// package FinalExam.question3;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class question3 {
    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {
        ArrayList<Student> slist = new ArrayList<Student>();
        // File fp = new File("FinalExam\\question3\\Q3TestData.txt");
        File fp = new File("Q3TestData.txt");
        Scanner scnr = new Scanner(fp);
        while (scnr.hasNextLine()) {
            int sid = scnr.nextInt();
            String sname = scnr.next();
            int creds = scnr.nextInt();
            int numClasses = creds / 3;
            String dob = scnr.next();
            ArrayList<Course> crsLst = new ArrayList<Course>();
            for (int i = 0; i < numClasses; i++) {
                String cid = scnr.next();
                String cname = scnr.next();
                Integer score = scnr.nextInt();
                Course newCourse = new Course(cid, cname, score);
                crsLst.add(newCourse);
            }
            Student newStudent = new Student(sid, sname, crsLst);
            newStudent.dob = dob;
            newStudent.credits = creds;
            slist.add(newStudent);
        }
        scnr.close();
        return slist;
    }

    public static void printStudent(ArrayList<Student> slist) {
        for (int i = 0; i < slist.size(); i++) {
            System.out.println(slist.get(i).toString());
            System.out.println("Total Credits: " + slist.get(i).getTotalCredits());
            System.out.println("");
        }
    }

    public static void printStudent(ArrayList<Student> slist, Integer id) {
        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).sid == id) {
                System.out.println("Student with the greatest credits:");
                System.out.println(slist.get(i).toString());
                System.out.println("Total Credits: " + slist.get(i).getTotalCredits());
                break;
            }
        }
    }

    public static Integer findStudent(ArrayList<Student> slist) {
        Integer topStudent = 0;
        int maxCred = 0;
        int maxCredIdx = 0;

        for (int i = 0; i < slist.size(); i++) {
            if (slist.get(i).getTotalCredits() > maxCred) {
                maxCred = slist.get(i).getTotalCredits();
                maxCredIdx = i;
            }
        }
        topStudent = slist.get(maxCredIdx).sid;
        return topStudent;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Student> slist;

        slist = fillupStudent();
        printStudent(slist);
    }
}
