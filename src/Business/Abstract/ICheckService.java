package Business.Abstract;

public interface ICheckService {
    boolean checkPassword(String password);
    boolean checkMail(String mail);
    boolean checkNameLastName(String name,String LastName);

}
