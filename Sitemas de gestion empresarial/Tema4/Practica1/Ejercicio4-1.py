import os #la clase para limpiarla pantalla
# declaracion de variables

diccionario={}#diccionario
valorUsuario=0#aqui almacenamos los valores que introduce el usuario
valorAcabar=""#esta variable es o para confirmar fin de una opción o para conf la eliminacion del diccionario

def introducirValores():#metodo para agregar valores al diccionario
    nombreNuevo=input("Introduce un nombre al diccionario")
    contador=1 #contador para controlar las claves 
    diccionario["Valor " + str(contador)] = nombreNuevo #asignamos el valor introducido a la clave con el valor incrementado
    contador=contador+1 #incrementamos contador
    print("Valor introducido correctamente") 
    global valorAcabar
    valorAcabar = input("Pulse cualquier tecla para continuar.....")
    
def eliminarValores():
    global diccionario  # Asegúrate de que 'diccionario' es accesible
    nombreBorrar = input("Introduce un nombre para borrarlo: ")
    clave_encontrada = None

    # Buscamos la clave correspondiente al nombre que queremos borrar
    for clave, valor in diccionario.items():
        if valor == nombreBorrar:
            clave_encontrada = clave
            # Salimos del bucle si encontramos el valor
            break

    # Eliminar el valor si se encontró la clave
    if clave_encontrada is not None:
        diccionario.pop(clave_encontrada)
        print(f"Valor '{nombreBorrar}' eliminado.")
        print("El diccionario queda así:", diccionario)
    else:
        print(f"El nombre '{nombreBorrar}' no se encontró en el diccionario.")
    
    global valorAcabar
    valorAcabar = input("Pulse cualquier tecla para continuar.....")

def mostrarValores():
    if(len(diccionario)!=0):
        print(diccionario)
    else:
        print("El diccionario está vacío")
    global valorAcabar
    valorAcabar = input("Pulse cualquier tecla para continuar.....")
    
def borrarDiccionario():

    diccionario.clear()
    print("El diccionario ha sido borrado")
    global valorAcabar
    valorAcabar = input("Pulse cualquier tecla para continuar.....")   
    
def menu():#metodo con las opciones del menu
    salir = True
    while salir:
        print("Opciones")
        print("************")
        print("1 - Introduce un valor en el diccionario")
        print("2 - Eliminar un nombre del diccionario")
        print("3 - Mostrar todos los valores de un diccionario")
        print("4 - Borrar el diccionario")
        print("9 - Salir")
        valorUsuario = int (input("Inserta un numero del menu: "))
        if valorUsuario==1:
            introducirValores()
        elif valorUsuario==2:
            eliminarValores()
        elif valorUsuario==3:
            mostrarValores()
        elif valorUsuario==4:
            borrarDiccionario()
        elif valorUsuario==9:
            print("HAsta otra")
            print("El programa ha sido realizado por Ismael Sánchez González")
            salir=False
        else :
            print("Has introducido una opción inexistente")
            global valorAcabar
            valorAcabar = input("Pulse cualquier tecla para continuar.....")
            
menu()    

