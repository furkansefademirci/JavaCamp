package eCommerceDemo.business.concretes;

import java.util.Scanner;

public class BaseVerification {
    Scanner myobj = new Scanner(System.in);
    int verificationInt;

    boolean sendLink() {
        System.out.println("Please click the link for sign in. ( Or write 1 )");
        verificationInt = myobj.nextInt();
        if (verificationInt == 1) {
            System.out.println("Congratulations");
            return true;
        } else {
            System.out.println("User did not added");
            return false;
        }


    }
}
