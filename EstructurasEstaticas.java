public class EstructurasEstaticas {
    public static void main(String[] args) {

        // Las estructuras estáticas no se cambian.

        int a = 10;
        int b = 11;

        // int c = 10, d = 11;

        int suma = a + b;
        int resta = a - b;

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
    }
}
