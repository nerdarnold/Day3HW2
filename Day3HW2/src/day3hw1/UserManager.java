package day3hw1;
//BASE CLASS FOR HUMANITY METHODS
public class UserManager {
	public void add(User user){
        System.out.println("User added: "+user.getFirstName());
    }
    public void update(User user){
        System.out.println("User update: "+user.getFirstName());
    }
    public void delete(User user){
        System.out.println("User delete: "+user.getFirstName());
    }
}
