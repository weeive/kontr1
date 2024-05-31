package kontr1;

import java.util.Scanner;

public class rec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два неотрицательных целых числа a и b:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Сумма чисел: " + sum(a, b));
        scanner.close();
    }

    public static int sum(int a, int b) {
        if (b == 0) return a;
        return sum(a + 1, b - 1);
    }
}

