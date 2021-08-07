/*
 0 5 infante
6 10 niño
11 15 preadolescente 
16 18 adolescente 
19 25 pre adulto 
26 40 adulto 
41 55 pre anciano 
56 + anciano
 */
package condicionalescomplejas;
public class Ejercicio1 {
 public static void main(String[] args) {
     int edad = 14;
   if (edad >=0  && edad <= 5 ){
       System.out.println("La edad corresponde a un infante");
   }
   else if (edad >= 6 && edad <=10 ){
       System.out.println("La edad corresponde a un niño");
   }
   else if (edad >= 11 && edad <=15){
       System.out.println("La edad corresponde a un Pre-adolescente");
   }else if (edad >= 16 && edad <=18){
       System.out.println("La edad corresponde a un adolescente");
   }else if (edad >= 19 && edad <=25){
       System.out.println("La edad corresponde a un pre-adulto");
   }else if (edad >= 26 && edad <=40){
       System.out.println("La edad corresponde a un adulto");
   }else if (edad >= 41 && edad <=55){
       System.out.println("La edad corresponde a un pre-anciano");
   }else {
       System.out.println("La edad corresponde a un anciano");  
               
   }
 }   
}
