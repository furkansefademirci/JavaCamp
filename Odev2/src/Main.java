import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Course courseJava = new Course("Java Bootcamp", "Furkan Sefa Demirci"
                , "Learn java from scratch ", 100);

        Course courseCpp = new Course("C++ Bootcamp", "Furkan Sefa Demirci"
                , "Learn C++ from scratch ", 200);

        Course[] courses = {courseJava, courseCpp};

        CourseManager courseManager = new CourseManager();
        System.out.println("Please enter the percentage of discount: ");
        int percentage = myObj.nextInt();


        for (Course course : courses) {
            System.out.println(course.toString() + " Discounted price for: " + course.getCourseName()+" "
                    + courseManager.discountedPrice(course.getCoursePrice(),percentage));
        }

        courseManager.enrollToCourse(courseJava);
        courseManager.enrollToCourse(courseCpp);

    }
}
