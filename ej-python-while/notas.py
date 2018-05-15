#Ingresar 4 notas y presentar un reporte que contenga (Nombre,Las 4 notas y el promedio de cada estudiante)

limite = 4
contador = 1
cadena = "\n{0:>50}\n\n{1}{2:>20}{3:>10}{4:>10}{5:>10}{6:>15}\n\n".format("Reporte Notas","Nombre","Nota 1","Nota 2","Nota 3","Nota 4","Promedio")#Valor inicial de la variable 'Cadena'

while(contador <= limite):

	print("\n\tREGISTRO DE NOTAS\n")
	print("{0}{1}\n".format("Estudiante ", contador))
	
	nombre = input("\tIngrese su nombre: ")
	nota1 = int(input("\n\t\tIngrese nota 1: "))
	nota2 = int(input("\t\tIngrese nota 2: "))
	nota3 = int(input("\t\tIngrese nota 3: "))
	nota4 = int(input("\t\tIngrese nota 4: "))

	suma = nota1 + nota2 + nota3 + nota4
	promedio = suma / limite

	cadena = "{0}{1}{2:>10}{3:>10}{4:>10}{5:>10}{6:>17}\n".format(cadena,nombre,nota1,nota2,nota3,nota4,promedio)#Concatenacion de la variable 'Cadena'
	
	contador = contador + 1

print(cadena)
