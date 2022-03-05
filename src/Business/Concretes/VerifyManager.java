package Business.Concretes;

import Business.Abstract.IVerifyService;

public class VerifyManager implements IVerifyService {
    @Override
    public void mailVerify(String mail) {
        System.out.println("mail onaylama işlemi yapıldı");
    }
}
