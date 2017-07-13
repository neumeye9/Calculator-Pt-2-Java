public class CalculatorIITest{
    public static void main(String[] args){

        CalculatorII.performOperation("10.5");
        CalculatorII.performOperation("+");
        CalculatorII.performOperation("5.2");
        CalculatorII.performOperation("*");
        CalculatorII.performOperation("10");
        CalculatorII.performOperation("=");
        CalculatorII.getResult();

        CalculatorII.performOperation("200");
        CalculatorII.performOperation("/");
        CalculatorII.performOperation("10");
        CalculatorII.performOperation("-");
        CalculatorII.performOperation("5");
        CalculatorII.performOperation("=");
        CalculatorII.getResult();
    }
}