
public class Cash {
    int cashOut;

    public void withdrawMoney() throws Exception{
        int cashOut = Atm.scanner.nextInt();
        if (cashOut < 100){
            System.out.println("Please remove your cash. Thank You!");
        }
        else {throw new Exception("Cash not available");}
    }
}
