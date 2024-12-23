import java.io.*;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст для добавления в файл:");

        String text = scanner.nextLine();

        try (FileWriter writer = new FileWriter("output.txt", true)) {
            writer.append("\n").append(text);
            System.out.println("Текст добавлен в конец файла.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}


