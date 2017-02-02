/**
 * Created by nathanbutler on 2/1/17.
 * Defines the users name and opening greeting.
 */
public class User {
    String name;

    void inputName() throws Exception{
        System.out.println("Welcome, please input your name.");
        name = Atm.scanner.nextLine();
        if (name.isEmpty()){
            throw new Exception("Please enter a name.");
        }
        else{
            System.out.println("Hi " + name);
        }
    }

}





