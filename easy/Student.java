public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("Course: " + course.getCourseName() + ", Duration: " + course.getDuration() + " weeks");
    }
}
