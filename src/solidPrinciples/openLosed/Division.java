package solidPrinciples.openLosed;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Division implements Operation{
    private int operand1;
    private int operand2;


    public int perform(){
        int res = 0;
        try{
            res = operand1/operand2;
        }catch (Exception e){
            System.out.println(e);
        }

        return res;
    }
}
