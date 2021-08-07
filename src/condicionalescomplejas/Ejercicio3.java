/*
 Desarrollar un programa que, por medio de 3 números enteros, 
determinar cuál es el mayor.
 */
package condicionalescomplejas;
public class Ejercicio3 {
public static void main(String[] args) {
    int numeroUno = 235;
    int numeroDos = 623;
    int numeroTres = 87;
    if (numeroUno > numeroDos){
        System.out.println("El numero mayor es: " +numeroUno);
    } else if (numeroDos > numeroUno && numeroDos > numeroTres){
        System.out.println("El numero mayor es: " +numeroDos);
    } else if (numeroTres > numeroDos && numeroTres > numeroUno){
        System.out.println("El numero mayor es: " +numeroTres);
    }
}    
}
