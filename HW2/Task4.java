package HW2;
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        while (true) {
            try {
                String userName = inputDataFromUser();
                System.out.println("Вас зовут " + userName);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    private static String inputDataFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in, "utf-8");
        String userData;
        System.out.print("Введите ваше имя: ");
        userData = scanner.nextLine();
        if (userData == "") {
            throw new Exception("Пустые строки вводить нельзя");
        }
        scanner.close();
        return userData;
    }

}
