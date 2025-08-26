public class EstructurasEstaticas {
    public static void main(String[] args) {

        // Las estructuras estáticas no se cambian.

        // Tipo estándar de dato para guardar números no muy grandes.
        // Da buen balance entre rango y memoria
        int a = 10;
        int b = 11;

        // int c = 10, d = 11

        int suma = a + b;
        int resta = a - b;
        double multiplicacion = a * b;
        // Optional Division = a / b --> Optinal no es un tipo de dato. No genera error.
        // Puede ser utilizado en divisiones por cero.

        // double -> Mayor precisión en números con bastantes decimales (15-16 dígitos aprox)
        double division = a / b;

        // Dato de tipo 'byte' (8 bits, -128 a 127)
        byte edad = 25; // Datos que requieren poco espacio

        // Dato de tipo 'short' (16 bits, -32,768 a 32,767)
        short poblacionPueblo = 15000; // Datos que requieren espacio intermedio

        // Dato de tipo 'long' (64 bits, números enteros grandes)
        long poblacionMundial = 8000000000L; // Datos que requieren bastante espacio

        // float -> Menos precisión en números con bastantes decimales (7 dígitos aprox)
        float precio = 19.99f;

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
