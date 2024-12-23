import java.io.*;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для записи в файл: ");

        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", false)) {
            writer.write(text);
            System.out.println("Информация записана в файл output.txt");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}

