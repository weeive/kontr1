package kontr1;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, number;
        System.out.println("Введите последовательность чисел, завершающуюся нулем:");
        while ((number = scanner.nextInt()) != 0) {
            sum += number;
        }
        System.out.println("Сумма последовательности: " + sum);
        scanner.close();
    }
}
