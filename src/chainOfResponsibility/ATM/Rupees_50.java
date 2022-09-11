package chainOfResponsibility.ATM;

public class Rupees_50 implements Currency {
    private Currency nextCurrency;

    @Override
    public void dispense(Amount amount) {
        int amt = amount.getTotal();
        if(amt >= 50){
            int notes = amt / 50;
            int rem = amt % 50;
            System.out.println("50 rupees Notes are :"+notes);
            if(rem != 0){
                Amount remAmount = new Amount(rem);
                nextCurrency.dispense(remAmount);
            }
        }
        else{
            nextCurrency.dispense(new Amount(amt));
        }
    }

    @Override
    public void setNextCurrency(Currency nextCurrency) {
             this.nextCurrency = nextCurrency;
    }
}
