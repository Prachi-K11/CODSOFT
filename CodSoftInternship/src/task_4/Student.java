package task_4;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	 private int studentID;
	    private String name;
	    private List<Course> registeredCourses;

	    public Student(int studentID, String name) {
	        this.studentID = studentID;
	        this.name = name;
	        this.registeredCourses = new ArrayList<>();
	    }

	    public int getStudentID() {
	        return studentID;
	    }

	    public String getName() {
	        return name;
	    }

	    public List<Course> getRegisteredCourses() {
	        return registeredCourses;
	    }

	    public void registerForCourse(Course course) {
	        registeredCourses.add(course);
	    }

	    public void dropCourse(Course course) {
	        registeredCourses.remove(course);
	    }

	    @Override
	    public String toString() {
	        return "Student ID: " + studentID + "\nName: " + name;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
