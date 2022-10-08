package composite.calculator;

       /*

       (5 + (2 * 7) + (10 - 6))  - output should be 23

                             +
                       /    |     \
                     5      *      -
                           / \    /   \
                          2   7   10   6

        */

public class Main {
    public static void main(String[] args) {
        Expression two = new Number(2);
        Expression seven = new Number(7);

        Expression mulitply = new ArthematicExpression(two, seven, Operation.MULTIPLY);
        System.out.println("After multiplying 2 & 7 -> "+mulitply.evaluate());

        Expression five = new Number(5);
        Expression addition = new ArthematicExpression(mulitply, five, Operation.ADD);
        System.out.println("After Adding 14 with 5 -> "+addition.evaluate());

        Expression ten = new Number(10);
        Expression six = new Number(6);

        Expression subtract = new ArthematicExpression(ten, six, Operation.SUBTRACT);
        System.out.println("After Subtracting 6 from 10 -> "+subtract.evaluate());

        Expression finalAnswer = new ArthematicExpression(addition, subtract, Operation.ADD);
        System.out.println("Final Answer of (5 + (2 * 7) + (10 -6)) -> "+finalAnswer.evaluate());

    }
}
