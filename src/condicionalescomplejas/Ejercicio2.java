/*
 Desarrollar un programa que permita determinar la cantidad de cifras 
de un número X teniendo en cuenta que el número únicamente puede 
tener 4 cifras. Mostrar un mensaje por defecto si el número supera las 
4 cifras
 */
package condicionalescomplejas;
public class Ejercicio2 {
    public static void main(String[] args) {
    int NumeroEvaluar = 12;
    int cifras = (int)(Math.log10(NumeroEvaluar)+1);
    if (cifras <= 4){
        System.out.println("El numero tiene: "+ cifras + " cifras");
    }else {
        System.out.println("El numero tiene mas de 4 cifras");
    }
    }
}
