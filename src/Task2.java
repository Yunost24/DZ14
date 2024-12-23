import java.io.*;

public class Task2 {

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("output.txt")) {
            int c;
            System.out.println("Содержимое файла output.txt:");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}

