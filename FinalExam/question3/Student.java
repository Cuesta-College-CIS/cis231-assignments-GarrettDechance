package FinalExam.question3;
import java.util.ArrayList;


class Student extends Person {
        Integer sid;
        Integer credits;
        ArrayList<Course> clist;
        
        Student(Integer id, String name, ArrayList<Course> c){
            sid = id;
            super.name = name;
            clist = c;
        }

        Student(String name, String birthday, Integer id, Integer cred){
            super(name, birthday);
            sid = id;
            credits = cred;
        }
    
        
        public Integer getTotalCredits(){
            Integer totalCred = credits;
            return totalCred;
        }

        @Override
        public void printPerson(){
            System.out.println("Student: " + sid + "  " + super.name + "\n " + clist.toString().replace("[","").replace("]","").replace(",",""));
        }
        
        @Override
        public String toString(){
            
            String studString = (super.toString() + "\nID:\t" + sid + "\t Credits:\t" + credits+ "\n " + clist.toString().replace("[","").replace("]","").replace(",","")); //I know it's ugly but it keeps it from printing in a weird format
            return studString;
        }
    } 

