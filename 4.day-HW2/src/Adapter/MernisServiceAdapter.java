package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisService.DIWKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) throws Exception {
        DIWKPSPublicSoap client = new DIWKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.valueOf(customer.getNationalityId()),customer.getFirstname().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());

    }
}
