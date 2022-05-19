package FinalExam.question3;

public abstract class Person {
    String name;
	String dob;
    Integer credits;
    Person() {
		name = "";
		dob = "";
	}

	Person(String n, String d) {
		name = n;
		dob = d;
	}

    abstract void printPerson();

	public String toString() {
		return "Name\t" + name + "\t DOB:\t" + dob + "\t";
	}
}