## En Python no existen 'byte', 'short', 'long' de forma separada. Todo se maneja con 'int' que no tiene límite de tamaño.
## En Python se utiliza Float que es equivalente a un Double en Java. Tiene la misma capacidad de tamaño.

## Las variables estáticas no se cambian.

a = 10
b = 11

## c, d = 10, 11

suma = a + b
resta = a - b
multiplicacion = a * b
division = a / b

print("La suma es: ", suma)
print("La resta es: ", resta)
print("La multiplicación es: ", multiplicacion)
print("La división es: ", division)

## Otras estructuras de datos
palabra = "Hola"
for i in palabra:
    print (i) ## Las String ocupan menos espacio de memoria, mientras que los char ocupan más.

c = 'H'
d = 'O'
e = 'L'
f = 'A'
print(c + d + e + f) ## Sumar letras sí es posible en Python. Esto es conocido como concatenar.

x = True
y = False 