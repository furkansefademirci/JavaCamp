public class Course {
    private String courseName;
    private String instructerName;
    private String courseDescription;
    private float coursePrice;

    public Course(String courseName, String instructerName, String courseDescription, int coursePrice) {
        this.courseName = courseName;
        this.instructerName = instructerName;
        this.courseDescription = courseDescription;
        this.coursePrice = coursePrice;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructerName() {
        return instructerName;
    }

    public void setInstructerName(String instructerName) {
        this.instructerName = instructerName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public float getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(float coursePrice) {
        this.coursePrice = coursePrice;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructerName='" + instructerName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", coursePrice=" + coursePrice +
                '}';
    }
}
