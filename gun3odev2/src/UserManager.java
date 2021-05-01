public class UserManager {

    public void changePhoneNumber(User user , String phoneNumber){
        user.setPhoneNumber(phoneNumber) ;
        System.out.println("Phone number has been changed to: " + user.getPhoneNumber() );

    }


}
