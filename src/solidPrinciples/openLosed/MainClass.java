package solidPrinciples.openLosed;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter details");

        for(int i = 0; i < 3; i++){
            int num1 = kb.nextInt();
            int num2 = kb.nextInt();
            String operation = kb.next();

            CalculatorFactory factory = new CalculatorFactory();
            int result = factory.perform(num1, num2, operation);
            System.out.println(result);
        }
    }
}
