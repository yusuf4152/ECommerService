package Business.Concretes;

import Business.Abstract.ICheckService;

import java.util.regex.Pattern;

public class CheckServiceManager implements ICheckService {
    @Override
    public boolean checkPassword(String password) {
        if (password.length()<6){
            System.out.println("şifre 6 karakterden uzun olmalıdır");
            return  false;
        }
        else return true;
    }

    @Override
    public boolean checkMail(String mail) {
        String mailRegex="(.+)@(.+)$";
        Pattern pattern= Pattern.compile(mailRegex);
            if (!pattern.matcher(mail).matches() || mail.isEmpty() || mail== null){
                System.out.println("hatalı mail");
                return false;
        }
        return true;
    }

    @Override
    public boolean checkNameLastName(String name, String LastName) {
       if (name.length() <2 || LastName.length()<2){
           System.out.println("ad ve soyad 2 karakterden uzun olmalıdır");
           return false;
        }
       else return true;
    }
}
