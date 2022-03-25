import java.util.Scanner;
class basiccalculator{
    public static void main(String[] args){
        Scanner ip1 = new Scanner (System.in);
        System.out.println("enter first integer: ");
        int num1= ip1.nextInt();
        System.out.println("enter second integer: ");
        
        int num2 = ip1.nextInt();
        int addition = num1+num2;
        int subtraction = num1-num2;
        int multiplication = num1*num2;
        float division = num1/num2;
        System.out.println("FIRST INTEGER:" + num1);
        System.out.println("SECOND INTEGER:" + num2);
        System.out.println("ADDITION:" + addition);
        System.out.println("SUBTRACTION:" + subtraction);
        System.out.println("MULTIPLICATION:" + multiplication);
        System.out.println("DIVISION:" + division);
        ip1.close();
    }
}