import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in) .nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in) .nextInt();
        double quotient1 = (double) firstNumber / secondNumber;
        double quotient2 = (double) firstNumber * secondNumber;
        int quotient3 = firstNumber + secondNumber;
        int quotient4 = firstNumber - secondNumber;
        System.out.println("Частное: " + quotient1);
        System.out.println("Частное: " + quotient2);
        System.out.println(quotient3);
        System.out.println(quotient4);

    }
}