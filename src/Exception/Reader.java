package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
//Напиши метод, который читает содержимое текстового файла с использованием try-with-resources
// и BufferedReader.
// Обработай отдельно FileNotFoundException и IOException.
    public void FileReader(){
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException b){
            b.getMessage();
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
