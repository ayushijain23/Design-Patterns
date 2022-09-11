package chainOfResponsibility.ATM;

import java.util.Scanner;

public class ATM_Machine {
    static Currency CurrentCurrency;

    public static void ATM_setup(){
        CurrentCurrency = new Rupees_100();
        Currency rupees_50 = new Rupees_50();
        Currency rupees_10 = new Rupees_10();

        CurrentCurrency.setNextCurrency(rupees_50);
        rupees_50.setNextCurrency(rupees_10);
    }
    public static void main(String[] args) {
        ATM_setup();
        Scanner kb = new Scanner(System.in);
        int totalAmount = kb.nextInt();
        Amount withdrawAmt = new Amount(totalAmount);
        if(totalAmount % 10 != 0){
            System.out.println("kindly enter multiple of 10");
        }
        else{
            CurrentCurrency.dispense(withdrawAmt);
        }
    }
}
