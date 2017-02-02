/**
 * Created by nathanbutler on 2/1/17.
 * Defines user input to transact with ATM.
 */
public class Option {
    int currentBalance = 100;
    String cancel;


    void chooseOption() throws Exception{
        System.out.println("What would you like to do today: " +
                "\nTo check your balance press 1" + "\nTo withdraw funds press 2" + "\nTo cancel transaction press 3");

        int selectedInput = Atm.scanner.nextInt();

        switch (selectedInput){
            case 1: selectedInput = 1;
                System.out.println("Your balance is " + currentBalance);

                break;

            case 2: selectedInput = 2;
                System.out.println("Please enter the amount you wish to withdraw into the keypad.");
                Cash cash = new Cash();
                cash.withdrawMoney();

                break;

            case 3: selectedInput = 3;
                System.out.println("You have successfulLy cancelled the current transaction. Please come again.");

                break;


        }

    }


}
