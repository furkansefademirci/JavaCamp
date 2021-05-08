package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface UserService {
    void addUser(User user);
    void addUserWithServices();

    void SigIn(User user,String email,String password);

}
