package Exception.Calculatr;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculatorMethods calc = new CalculatorMethods();

        while (true){
            System.out.println("\nТекущий результат: " + calc.result);
            System.out.println("Выберите операцию:");
            System.out.println("1 - Сложение");
            System.out.println("2 - Вычитание");
            System.out.println("3 - Умножение");
            System.out.println("4 - Деление");
            System.out.println("5 - Степень");
            System.out.println("6 - Квадратный корень");
            System.out.println("0 - Выход");

            int choice = scanner.nextInt();

            if(choice == 0){
                System.out.println("Выход...");
                break;
            }

            double number = 0;

            if(choice >= 1 && choice <= 5){
                System.out.print("Введите число: ");
                number = scanner.nextDouble();
            }

            switch (choice){
                case 1:
                    System.out.println("Результат: " + calc.add(number));
                    break;

                case 2:
                    System.out.println("Результат: " + calc.substract(number));
                    break;

                case 3:
                    System.out.println("Результат: " + calc.multiply(number));
                    break;

                case 4:
                    try {
                        System.out.println("Результат: " + calc.divide(number));
                    } catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Результат: " + calc.degree(number));
                    break;

                case 6:
                    System.out.println("Результат: " + calc.sqrt());
                    break;

                default:
                    System.out.println("Неверный выбор");
            }
        }

        scanner.close();
    }
}

