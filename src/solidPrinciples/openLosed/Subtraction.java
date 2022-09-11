package solidPrinciples.openLosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Subtraction implements Operation{
    private int operand1;
    private int operand2;


    public int perform(){
        return operand1 - operand2;
    }
}
