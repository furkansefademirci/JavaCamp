package InterfaceAbstractsDemo;

import InterfaceAbstractsDemo.Abstracts.BaseCustomerManager;
import InterfaceAbstractsDemo.Entities.Customer;
import InterfaceAbstractsDemo.concretes.DemirciCustomerManager;
import InterfaceAbstractsDemo.concretes.FSDCustomerManager;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager fsdCustomerManager = new FSDCustomerManager( );
        DemirciCustomerManager demirciCustomerManager = new DemirciCustomerManager();
        Customer customer1 = new Customer(1,"Furkan Sefa","Demirci",21,"11");
        demirciCustomerManager.save(customer1);
        fsdCustomerManager.save(customer1);



    }
}







































