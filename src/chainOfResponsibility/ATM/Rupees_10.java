package chainOfResponsibility.ATM;

public class Rupees_10 implements Currency {
    private Currency nextCurrency;

    @Override
    public void dispense(Amount amount) {
        int amt = amount.getTotal();
        if(amt >= 10){
            int notes = amt / 10;
            int rem = amt % 10;
            System.out.println("10 rupees Notes are :"+notes);
            if(rem != 0){
                Amount remAmount = new Amount(rem);
                nextCurrency.dispense(remAmount);
            }
        }
    }

    @Override
    public void setNextCurrency(Currency nextCurrency) {
        this.nextCurrency = nextCurrency;
    }
}
