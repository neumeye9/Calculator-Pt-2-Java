import java.util.*;

class CalculatorII implements java.io.Serializable{
    private static String operation;
    private static double result = 0;
    public static ArrayList <String> operations = new ArrayList<String>();


    public CalculatorII(){
    }

    public static void performOperation(String operation){
        operations.add(operation);

        //for loop through any and all operations passed into method
        if(operation == "="){
            result = Double.parseDouble(operations.get(0));

            for(int i = 0; i < operations.size(); i++){
                if(operations.get(i) == "+"){
                    result += Double.parseDouble(operations.get(i+1));
                }
                if(operations.get(i) == "-"){
                    result -= Double.parseDouble(operations.get(i+1));
                }
                if(operations.get(i) == "*"){
                    result *= Double.parseDouble(operations.get(i+1));
                }
                if(operations.get(i) == "/"){
                    result /= Double.parseDouble(operations.get(i+1));
                }
            }
        }
    }

    public static double getResult(){
        System.out.println("The result is: " + result);
        //need to clear operations ArrayList for next set
        System.out.println("Clearing out operations ArrayList");
        operations.clear();
        System.out.println("The size of ArrayList is:" + operations.size());
        return result;
    }
}