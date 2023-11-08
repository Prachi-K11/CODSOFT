package task_4;

import java.util.*;

public class Course {
	
	private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private List<Student> registeredStudents;

    public Course(String courseCode, String title, String description, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.registeredStudents = new ArrayList<>();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailableSlots() {
        return capacity - registeredStudents.size();
    }

    public List<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void registerStudent(Student student) {
        if (getAvailableSlots() > 0) {
            registeredStudents.add(student);
            student.registerForCourse(this);
        } else {
            System.out.println("Course is already full. Cannot register.");
        }
    }

    public void removeStudent(Student student) {
        if (registeredStudents.contains(student)) {
            registeredStudents.remove(student);
            student.dropCourse(this);
        } else {
            System.out.println("Student is not registered for this course.");
        }
    }

    @Override
    public String toString() {
        return "Course Code: " + courseCode + "\nTitle: " + title + "\nDescription: " + description +
                "\nCapacity: " + capacity + "\nAvailable Slots: " + getAvailableSlots();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

    