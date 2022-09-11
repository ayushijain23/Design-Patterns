package solidPrinciples.openLosed;

public class CalculatorFactory {

    public int perform(int num1, int num2, String operationType){
        int result = -1;
        if(operationType.equals("Add")){
            Addition obj = new Addition();
            obj.setOperand1(num1);
            obj.setOperand2(num2);
            result = obj.perform();
        }

        else if(operationType.equals("Subtraction")){
            Subtraction obj = new Subtraction();
            obj.setOperand1(num1);
            obj.setOperand2(num2);
            result = obj.perform();
        }
        else if(operationType.equals("Division")){
            Division obj = new Division();
            obj.setOperand1(num1);
            obj.setOperand2(num2);
            result = obj.perform();
        }

        return result;
    }
}
