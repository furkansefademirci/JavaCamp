public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Furkan", "email@gmail.com", "123");
        Student student2 = new Student("Sefa", "email@hotmail.com", "456");
        User user = new User("user", "user@email.com", "456");
        Instructer instructer = new Instructer("FSD", "fsd@fsd.com", "789");

        UserManager userManager = new UserManager();
        InstructerManager instructerManager = new InstructerManager();

        Student[] students = {student1, student2};
       
        userManager.changePhoneNumber(student1, "321");

        for (Student student : students) {
            System.out.println(student.toString());
            instructerManager.showStudents(student);
        }


    }

}
