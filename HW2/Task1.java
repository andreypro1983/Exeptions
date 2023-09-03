package HW2;

import java.util.Scanner;

// Реализуйте метод,который запрашивает у пользователя ввод дробного числа(типа float),
// и возвращает введенное значение.Ввод текста вместо числа не должно приводить к падению приложения,
//   вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task1 {
    public static void main(String[] args) {
        System.out.printf("Вы ввели дробное число: " + inputFloat());
    }

    private static float inputFloat() {
        Scanner scanner;
        Float inputFloat;
        while (true) {
            try {
                scanner = new Scanner(System.in);
                System.out.print("Введите дробное число: ");
                inputFloat = parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
        return inputFloat;
    }

    private static float parseFloat(String inputData) throws NumberFormatException {
        try {
            return Float.parseFloat(inputData);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Введены данные не корретного формата");
        }
    }

}
