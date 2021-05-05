import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.util.Calendar;
import java.util.Date;

public class main {
    public static void main(String[] args) throws Exception {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(new Customer(1,"Engin","Demiroğ", new Date(1985, Calendar.JANUARY,6),"28861499108"));

    }
}
