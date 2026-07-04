import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 ,num2, Result;
        System.out.print("enter first num1 :");
        num1 = sc.nextDouble();
        System.out.print("Enter operator(+,-,*,/):");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second num2 :");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+': Result = num1+num2;
                System.out.println("Result ="+Result);
                    break;
            case '-': Result = num1-num2;    
                System.out.println("Result ="+Result);
                    break;
            case '*': Result = num1*num2;        
                System.out.println("Result ="+Result);
                    break;
            case '/': if(num2 != 0){
                Result = num1 / num2;
                System.out.println("Result ="+Result);
            }
            else{
                System.out.println("Error! because denomenator is zero");
            }   
                    break;  
            default:System.out.println("operator is not define!");
                
        }
            sc.close();
    }
}
