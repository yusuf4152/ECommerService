package DataAccess.Concretes;

import DataAccess.Abstracts.CustomerDao;
import Entities.Concretes.Customer;

public class AzureCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println(customer.getName()+" veritabanına eklendi");
    }

    @Override
    public void delete(Customer customer) {
        System.out.println(customer.getName()+" veri tabanından silindi");
    }

    @Override
    public Customer get(int id) {
        System.out.println(id+" li müşteri getirildi");
        return null;
    }
}
