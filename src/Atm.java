
import java.util.Scanner;

public class Atm {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        User user = new User();
        user.inputName();
        Option option = new Option();
        option.chooseOption();
    }

}
