package Module4.GuidedAssignments.lists.Problem1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProjectGroup implements Iterable<Student>{
    private List<Student> list;

    public ProjectGroup() {
        list = new LinkedList<Student>();
    }

    public void addStudent(Student student) {
        list.add(student);
    }

    public void addStudent(int index, Student student) {
        list.add(index, student);
    }

    public void addStudent(Student student, Student newStudent) {
        int index = list.indexOf(student) + 1;
        this.addStudent(index, newStudent);
    }

    public void remove(Student student) {
        list.remove(student);
    }

    public void remove(int index) {
        list.remove(index);
    }

    public int size() {
        return list.size();
    }

    public void set(int index, Student newStudent) {
        list.set(index, newStudent);
    }

    public void set(Student student, Student newStudent) {
        int index = list.indexOf(student);
        this.set(index, newStudent);
    }

    public Student find (String studentID) {
        for (int i = 0; i < this.size(); i++) {
            if (list.get(i).getStudentID().equals(studentID)) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < this.size(); i++) {
            result += list.get(i).toString() + "\n";
        }
        return result;
    }

    @Override
    public Iterator<Student> iterator() {
        return list.iterator();
    }
}
