import java.util.Scanner;

public class javaAdd{
    public static void main(String args[]){
        float a,b,res;
        char choice, ch;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("1. Add Two numbers\n");
            System.out.println("2. Multiply Two numbers\n");
            System.out.println("3. Exit\n\n");
            System.out.println("Enter your choice:");
            choice = scan.next().charAt(0);
            switch(choice){
                case '1' :  System.out.println("Enter two numbers ");
                            a = scan.nextFloat();
                            b = scan.nextFloat();
                            res = a + b;
                            System.out.println("Result = " + res);
                            break;
                case '2' :  System.out.println("Enter two numbers ");
                            a = scan.nextFloat();
                            b = scan.nextFloat();
                            res = a * b;
                            System.out.println("Result = " + res);
                            break;
                case '3' : System.exit(0);
                            break;
                default : System.out.println("Invalid Choice\n");
            }
            System.out.println("------------------------------\n");
        }
    }
}

