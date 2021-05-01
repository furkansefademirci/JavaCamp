public class CourseManager {

    public float discountedPrice(float price, float percentage) {

        return (price - price * (percentage / 100));
    }

    public void enrollToCourse(Course course) {

        System.out.println("Enrolled in " + course.getCourseName());

    }

}
