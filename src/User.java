
public class User {
    String name;

    void inputName() throws Exception{
        System.out.println("Welcome, please enter your name.");
        name = Atm.scanner.nextLine();
        if (name.isEmpty()){
            throw new Exception("Please enter a name.");
        }
        else{
            System.out.println("Hi " + name);
        }
    }

}





