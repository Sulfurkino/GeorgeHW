package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StringCount{
    private static int StringCount(String filename) {
        int count = 0;

        try (BufferedReader br = new BufferedReader(
                new FileReader(filename, StandardCharsets.UTF_8))) {

            while (br.readLine() != null) {
                count++;
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка во время чтения файла.");
        }

        return count;
    }

}
