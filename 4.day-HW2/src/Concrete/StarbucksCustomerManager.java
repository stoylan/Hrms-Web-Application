package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private final ICustomerCheckService iCustomerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }


    @Override
    public void save(Customer customer) throws Exception {
        if (iCustomerCheckService.checkIfRealPerson(customer)) {
            System.out.println("Succesfully login");
            super.save(customer);
        }else {
            System.out.println("You have entered some wrong information. Etc. Name,Surname,BirthDate or Nationality Number");
        }

    }


}
