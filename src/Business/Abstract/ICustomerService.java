package Business.Abstract;

import Entities.Concretes.Customer;

public interface ICustomerService {
    void signUp(Customer customer);
    void  SignUpWithService(Customer customer);
    void signIn(String mail,String password);
}
