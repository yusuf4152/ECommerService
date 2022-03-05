package adapter.Concretes;

import Entities.Concretes.Customer;
import adapter.Abstract.SignService;

public class GoogleSignService implements SignService {
    @Override
    public boolean SignUp(Customer customer) {
        if (customer.getMail()!=null){
            return true;
        }
        else return false;
    }
}
