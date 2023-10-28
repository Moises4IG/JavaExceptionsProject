import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class ExcepcionIO {
    public static void main(String[] args) {
        try (BufferedReader lector = new BufferedReader(new StringReader("prueba"))) {
            lector.close();
            char c = (char) lector.read(); // Leyendo de un lector cerrado
            System.out.println(c);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
