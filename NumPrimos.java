/**
 * Dado un número entero aleatorio entre 1 y 100 que será almacenado en la variable randomNumber, 
 * mostrar por pantalla si este número es primo o no.
 * @author Diego González Romero
 * @version 13/11/2022
 */

public class NumPrimos {
    public static void main(String[] args) {
        //Declaramos la variable para el numero máximo del número aleatorio
        int M = 100;
        //Declaramos el número aleatorio y una variable para el resultado
        int numeroRandom = (int)(Math.random()*M+1);
        int resultado = 1;
        //La expresión la formularemos con un bucle for y un "IF" dentro
        for(int i = 2; resultado != 0; i++){
            resultado = numeroRandom%i;
            if(resultado == 0 && i != numeroRandom){
                System.out.println("El número " + numeroRandom + " no es primo");
            }else if(resultado == 0 && i==numeroRandom){
                System.out.println("El número " + numeroRandom + " es primo");
            }
        }
    }
}