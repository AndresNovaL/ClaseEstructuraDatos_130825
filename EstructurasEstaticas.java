public class EstructurasEstaticas {
    public static void main(String[] args) {

        // Las estructuras estáticas no se cambian.

        int a = 10;
        int b = 11;

        // int c = 10, d = 11

        int suma = a + b;
        int resta = a - b;
        double multiplicacion = a * b;
        // Optional Division = a / b --> Optinal no es un tipo de dato. No genera error.
        // Puede ser utilizado en divisiones por cero.
        double division = a / b;

        // long c = 30000000000000L

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);

        // Otras estructuras de datos
        char c = 'A'; // Entre comillas simples
        String palabra = "Hola";
        System.out.println("El caracter es: " + c);
        System.out.println("La palabra es: " + palabra);

        char d = 'H';
        char e = 'O';
        char f = 'L';
        char g = 'A';

        // String concatenar = d + e + f + g --> No es posible sumar letras en Java.
        // System.out.println(concatenar)

        Boolean z = true;
        Boolean x = false; // los datos Boolean sólo pueden tener dos valores: True o False
    }
}
