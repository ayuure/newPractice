import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double num1 = input.nextDouble();
        System.out.println("Enter another number");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("What operations do you want to perform ");
        String operations = input.nextLine();

        switch (operations){
            case "sum":
                System.out.printf("%f +%f = %f", num1, num2, num1+num2);
                break;
            case "sub":
                System.out.printf("%f -%f = %f", num1, num2, num1-num2);
                break;
            case "divide":
                if(num2==0){
                    System.out.println("cannot divide by zero");
                }
                else {
                    System.out.printf("%f/%f = %f", num1, num2, num1 / num2);
                }
                break;
            case "multiple":
                System.out.printf("%f*%f = %f", num1, num2, num1*num2);
                break;
        }
        input.close();
    }
}
