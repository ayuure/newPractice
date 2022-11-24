import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double num1 = input.nextDouble();
        System.out.println("Enter another number");
        double num2 = input.nextDouble();
        input.nextLine();
        System.out.println("What operations do you want to perform ");
        String operations = input.nextLine();

        if(operations.equals("sum")){
            System.out.printf("%f + %f =%f", num1,num2, num1+num2);
        } else if (operations.equals("multiple")) {
            System.out.printf("%f x %f = %f", num1, num2, num1*num2);
        } else if (operations.equals("sub")) {
            System.out.printf("%f - %f = %f", num1,num2, num1-num2);

        } else if (operations.equals("divide")) {
            if(num2==0){
                System.out.println("Cannot divide by zero");
            }
            else {
            System.out.printf("%f/%f=%f", num1,num2, num1/num2);
            }

        }

        input.close();

    }
}