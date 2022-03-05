import Business.Concretes.CheckServiceManager;
import Business.Concretes.CustomerManager;
import Business.Concretes.VerifyManager;
import DataAccess.Concretes.AzureCustomerDao;
import Entities.Concretes.Customer;
import adapter.Concretes.GoogleSignService;

public class Main {
    public static void  main(String args[]){
        Customer customer= new Customer(1,"yusuf","demir","yusuf@mail.com","1234567");
        CustomerManager customerManager = new CustomerManager(new GoogleSignService(),new CheckServiceManager(),new VerifyManager(),new AzureCustomerDao());
    customerManager.signUp(customer);
    }
}
