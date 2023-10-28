import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionArchivoNoEncontrado {
    public static void main(String[] args) {
        try {
            File archivo = new File("archivoInexistente.txt");
            Scanner scanner = new Scanner(archivo);
            
            if (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

