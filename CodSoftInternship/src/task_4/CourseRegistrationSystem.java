package task_4;

public class CourseRegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course mathCourse = new Course("MATH101", "Introduction to Mathematics", "Basic math course", 30);
        Course physicsCourse = new Course("PHYS101", "Physics Fundamentals", "Introductory physics", 25);

        // Create students
        Student student1 = new Student(1, "Prachi");
        Student student2 = new Student(2, "punam");

        // Register students for courses
        mathCourse.registerStudent(student1);
        physicsCourse.registerStudent(student1);
        physicsCourse.registerStudent(student2);

        // Display course information
        System.out.println("Course Information:");
        System.out.println(mathCourse);
        System.out.println("\nStudent Information:");
        System.out.println(student1);
        System.out.println("\nRegistered Courses for Student 1:");
        for (Course course : student1.getRegisteredCourses()) {
            System.out.println(course.getCourseCode() + " - " + course.getTitle());
        }
	}

}
