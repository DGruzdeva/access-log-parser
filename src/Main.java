import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in) .nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in) .nextInt();
        int addition = (int) firstNumber + secondNumber;
        int subtraction = (int) firstNumber - secondNumber;
        int multiplication = (int) firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;
        System.out.println("Сложение:" + addition);
        System.out.println("Вычитание:" + subtraction);
        System.out.println("Деление:" + quotient);
        System.out.println("Умножение:" + multiplication);
        }
}