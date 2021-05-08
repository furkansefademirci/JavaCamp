package eCommerceDemo.business.concretes;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.entities.concretes.User;

import java.util.ArrayList;

public class UserManager implements UserService {
    private BaseVerification baseVerification;
    private BaseSignUpService baseSignUpService;

    ArrayList<User> users = new ArrayList<>();

    public UserManager(BaseVerification baseVerification, BaseSignUpService baseSignUpService) {
        this.baseVerification = baseVerification;
        this.baseSignUpService = baseSignUpService;
    }

    @Override
    public void addUser(User user) {
        if ((user.getPassword().length() < 6) |
                (users.contains(user.getEmail())) |
                (user.getFirstName().length() < 2 & user.getLastName().length() < 2)
        ) {
            System.out.println("Kullanıcı eklenemedi.");
        } else {
            if (baseVerification.sendLink()) {
                users.add(user);
                System.out.println("kullanıcı eklendi.");
            }

        }

    }

    @Override
    public void addUserWithServices() {
        baseSignUpService.signUp();

    }

    @Override
    public void SigIn(User user, String email, String password) {
        if ((user.getEmail().equals(email)) & (user.getPassword().equals(password)) & users.contains(user)) {
            System.out.println("Login is correct");
        } else {
            System.out.println("Login is not correct, email or password incorrect");
        }

    }
}
