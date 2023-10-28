public class ExcepcionIndiceCadena {
    public static void main(String[] args) {
        String cadena = "Hola";
        try {
            char ch = cadena.charAt(10);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
