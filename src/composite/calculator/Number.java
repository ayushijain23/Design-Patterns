package composite.calculator;

public class Number implements Expression{
    int val;

    public Number(int val) {
        this.val = val;
    }

    public int evaluate(){
        return val;
    }
}
