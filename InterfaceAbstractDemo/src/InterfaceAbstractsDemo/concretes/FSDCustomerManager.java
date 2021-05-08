package InterfaceAbstractsDemo.concretes;

import InterfaceAbstractsDemo.Abstracts.BaseCustomerManager;
import InterfaceAbstractsDemo.Entities.Customer;

public class FSDCustomerManager extends BaseCustomerManager {

    @Override
    public void save(Customer customer) {
        super.save(customer);
        super.checkIfRealPerson(customer);
    }
}

