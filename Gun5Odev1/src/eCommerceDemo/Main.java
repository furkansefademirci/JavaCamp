package eCommerceDemo;


import eCommerceDemo.business.concretes.SignUpWithGoogle;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.business.concretes.VerificationWithEmail;
import eCommerceDemo.entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Furkan Sefa", "Demiri", "email@email.com", "123");
        User user1 = new User("Furkan Sefa", "Demiri", "email@email.com", "123456");
        UserManager userManager = new UserManager(new VerificationWithEmail(), new SignUpWithGoogle());

        userManager.addUser(user);
        userManager.addUser(user1);

        System.out.println("**********************");

        userManager.addUserWithServices();

        userManager.SigIn(user, "email@email.com", "123");


    }


}
