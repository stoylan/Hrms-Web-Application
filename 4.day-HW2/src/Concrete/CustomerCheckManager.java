package Concrete;

import Abstract.ICustomerCheckService;
import Abstract.ICustomerService;
import Entities.Customer;


public class CustomerCheckManager implements ICustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
}
