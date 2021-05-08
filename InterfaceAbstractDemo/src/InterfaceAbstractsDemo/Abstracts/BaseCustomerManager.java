package InterfaceAbstractsDemo.Abstracts;
import InterfaceAbstractsDemo.Entities.Customer;

public class BaseCustomerManager implements CustomerService,CustomerChekServices{


    @Override
    public void save(Customer customer) {
        System.out.println("Veri tabanina kaydedildi:" + customer.getFirstName());

    }

    @Override
    public void checkIfRealPerson(Customer customer) {
        if (customer.getAge() > 0){
            System.out.println("Valid person");

        }
        else{
            System.out.println("Not valid person");
        }

    }
}
