import java.util.Scanner;



public class Calculator {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = kb.nextInt();
        System.out.println();
        
        int a= 10;
        int b= 5;

       
        if (choice == 1){
              addition add = new addition();
              int sum = add.addition(a,b);
              System.out.println("Sum is:" + sum);
              
        }
        else if (choice == 2){
            subtraction sub = new subtraction();
            int diff=sub.subtraction(a,b);
            System.out.println("diff is:" + diff);
        }
        else if (choice == 3){
            division div = new division();
            int divide=div.division(a,b);
            System.out.println("div is:" + divide);
        }
        else if (choice == 4){
            multiplication mul = new multiplication();
            int prod=mul.multiplication(a,b);
            System.out.println("mul is:" + prod);
        } 
 
        System.out.println();
        kb.close();
    }
}
