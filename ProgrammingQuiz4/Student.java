package ProgrammingQuiz4;

import java.util.ArrayList;

public class Student {
    Integer sid;
    String sname;
    ArrayList<Course> clist;
    
    Student(Integer id, String name, ArrayList<Course> c){
        sid = id;
        sname = name;
        clist = c;
    }

    
    public Integer getTotalCredits(){
        Integer totalCred = 0;
        for(int i = 0; i < clist.size(); i++){
            totalCred += clist.get(i).credit;
        }
        return totalCred;
    }
    
    public String toString(){
        
        String studString = ("Student: " + sid + "  " + sname + "\n" + clist); //I know something is wrong because it prints in brackets, but I can't figure out how to fix it.
        return studString;
    }
} 
