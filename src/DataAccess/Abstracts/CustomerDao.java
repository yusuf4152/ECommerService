package DataAccess.Abstracts;

import Entities.Concretes.Customer;

public interface CustomerDao {
void add(Customer customer);
void delete(Customer customer);
Customer get(int id);
}
