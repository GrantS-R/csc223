package Module4.GuidedAssignments.lists.Problem1;

public class Student {
    private String studentID;
    private String name;
	private int number;
	private String grade;

    public Student(String studentID, String name, int number, String grade) {
        this.studentID = studentID;
		this.name = name;
		this.number = number;
		if (grade == null)
			this.grade = "";
		else
			this.grade = grade;
    }

    public Student(String studentID, String name, int number) {
        this(studentID, name, number, "");
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public boolean graded() {
        return !grade.equals("");
    }

    public boolean equals(Object other) {
        if (other instanceof Student) {
            Student otherStudent = (Student) other;
            if (studentID.equals(otherStudent.getStudentID()) && number == otherStudent.getNumber()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String result ="\n" + name + "\tID: "+ studentID + "\nNumber of credits: " + number;
        if (!grade.equals("")) {
            result += "\nGrade: " + grade ;
        }
        return result;
    }
}
