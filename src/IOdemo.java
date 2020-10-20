import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class IOdemo {
    public static void main(String[] args) {
        FileReader reader =
                null;
        try {
            new FileReader("otazky_odpovede");
            int znak = reader.read();
            while (znak != -1){
                System.out.println((char)znak);
                znak = reader.read();
            }
            {
                reader = new FileReader("otazky_odpovede");
                BufferedReader reader1 = new BufferedReader(reader);
                System.out.println(reader1.readLine());
            }
            try {
                znak = reader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(znak);

        } catch (FileNotFoundException e) {
            System.out.println("Subor nenajdeny");

        } catch (IOException e) {
            e.printStackTrace();


        }
    }
}
