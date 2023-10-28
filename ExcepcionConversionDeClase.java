public class ExcepcionConversionDeClase {
    public static void main(String[] args) {
        Object objeto = "Hola";
        try {
            Integer numero = (Integer) objeto;
            System.out.println(numero);
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

