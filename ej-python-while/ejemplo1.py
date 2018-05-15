"""
    Ingreso de datos en Python
    Tomado de: https://pyformat.info/
"""


print("Estamos relizando una prueba para el ciclo while")

# Comentarios de una línea


verificar = True
cadena = "%s\t%s\t%s\n" % ("Nombres", "Apellidos", "Edad")
while verificar:
    nombre = input("Ingrese su nombre: ")
    apellido = input("Ingrese su apellido: ")
    edad = input("Ingrese su edad: ")
    cadena = "\n%s%s\t%s\t\t%d\n" % (cadena, nombre, apellido, int(edad))
    
    respuesta = input("\nIngrese (si) para salir: ")
    
    if respuesta == "si":
    	verificar = False

print(cadena)