import java.io.*;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для замены содержимого файла:");

        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", false)) {
            writer.write(text);
            System.out.println("Содержимое файла заменено.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}

