/*
Implementar un método que reciba por parámetro dos números enteros y determine cuál es
el mayor y lo muestre por pantalla.
 */
package repasob;

import static java.lang.Integer.max;
import java.util.Scanner;


public class RepasoB {

    
    /*public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.println("Ingrese dos numeros");
        a = leer.nextInt();
        b = leer.nextInt();
        int mayor = max( a, b);
        System.out.println("El mayor de los dos numeros: " + mayor);
        
        }
    */
    
   /* public static void main(String[] args) {
        /*
        Crear un método que reciba por parámetro un numero y determine si es par o impar
        */
       /* Scanner leer = new Scanner(System.in);
        int a;
        System.out.println("Ingrese un numero");
        a = leer.nextInt();
        if(a%2==0 && a!=0){
            System.out.println("El numero es par");
            }else{
            System.out.println("El numero es impar");
        }

     }*/
    /*public static void main(String[] args) {
        /*
        Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals()
de String.
        */
        /* Scanner leer = new Scanner(System.in);
         String frase;
         String eureka = "eureka";
         System.out.println("Ingrese una frase");
         frase = leer.nextLine();
         if(frase.equals(eureka)){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");

         }
  }*/
   /* public static void main(String[] args) {
        /*
        Realizar un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
el método lenght() de String.

        */
        /*Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = leer.nextLine();
        int largo = palabra.length();
        if(largo == 8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        }*/
    /*public static void main(String[] args) {
        /*
        Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una
‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
        */
       /* Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Escriba una frase");
        frase = leer.nextLine();
       if(frase.startsWith("A")||frase.startsWith("a")){
           System.out.println("Correcto");
       }else{
           System.out.println("Incorrecto");
       }*/
      
    public static void main(String[] args) {
        /*
        Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo método definir una
variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El método debe mostrar
lo siguiente:
 Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
 Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
 Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
 Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
 Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba”

        */
        Scanner leer = new Scanner(System.in);
        int motor;
        System.out.println("Ingrese un numero del 1 al 4");
        motor = leer.nextInt();
        switch(motor){
            case 1: { System.out.println("La bomba es una bomba de agua"); 
            break;}
            case 2: { System.out.println("La bomba es una bomba de gasolina");
            break;}
            case 3: { System.out.println("La bomba es una bomba de hormigón");
            break;}
            case 4: { System.out.println("La bomba es una bomba de pasta alimenticia");
            break;}
            default: { System.out.println("No existe un valor válido para tipo de bomba");}
   }
}
}

