package Business.Concretes;
import Business.Abstract.ICheckService;
import Business.Abstract.ICustomerService;
import Business.Abstract.IVerifyService;
import DataAccess.Abstracts.CustomerDao;
import Entities.Concretes.Customer;
import adapter.Abstract.SignService;

public class CustomerManager implements ICustomerService {
    private final SignService signService;
    private final ICheckService checkServiceManager;
    private  final IVerifyService verifyManager;
    private final CustomerDao customerDao;
    public CustomerManager(SignService signService, ICheckService checkServiceManager, IVerifyService verifyManager, CustomerDao customerDao) {
        this.signService = signService;
        this.checkServiceManager = checkServiceManager;
        this.verifyManager = verifyManager;
        this.customerDao = customerDao;
    }

    @Override
    public void signUp(Customer customer) {
        if (this.checkServiceManager.checkPassword(customer.getPassword())&&
        this.checkServiceManager.checkNameLastName(customer.getName(),customer.getLastName())&&
        this.checkServiceManager.checkMail(customer.getMail())){
             this.verifyManager.mailVerify(customer.getMail());
             this.customerDao.add(customer);
            System.out.println("kayit işlemi başarılı");
        }
        else {
            System.out.println("kayıt işlemi başarısız");
        }
       }
    @Override
    public void SignUpWithService(Customer customer) {
    if (this.signService.SignUp(customer)){
        this.verifyManager.mailVerify(customer.getMail());
        this.customerDao.add(customer);
        System.out.println("google ile kayıt işlemi başarılı");
    }
    else {
        System.out.println("google ile kayıt başarısız");
    }
    }

    @Override
    public void signIn(String mail, String password) {
    if (mail.isEmpty() || password.isEmpty() ){
        System.out.println("başarısız giriş");
    }
     else System.out.println("başarılı giriş");
    }

}
