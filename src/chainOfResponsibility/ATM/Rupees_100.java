package chainOfResponsibility.ATM;

public class Rupees_100 implements Currency {
    private Currency nextCurrency;

    @Override
    public void dispense(Amount amount) {
        int amt = amount.getTotal();
        if(amt >= 100){
            int notes = amt / 100;
            int rem = amt % 100;
            System.out.println("100 rupees Notes are :"+notes);
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
