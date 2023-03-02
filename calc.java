import java.util.Scanner;
public class calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        String op;
        System.out.print("enter first number:");
        num1=sc.nextInt();
        System.out.print("enter operator:");
        op=sc.next();
        System.out.print("enter second number:");
        num2=sc.nextInt();
        switch(op){
            case "+":
                    System.out.print(num1+num2);
                    break;
            case "-":
                    System.out.print(num1-num2);
                    break;
            case "*":
                    System.out.print(num1*num2);
                    break;
            case "/":
                    System.out.print(num1/num2);
                    break;
            case "%":
                    System.out.print(num1%num2);
                    break;
            default:
                    System.out.print("Invalid Operator");

        }
    }
}
