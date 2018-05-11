
package db1start01;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class Matematica {
    public static void main(String[] args) {
        int numero, parimpar, dobro;
        int primo = 0;
        
        Scanner leitura = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        numero = leitura.nextInt();
        
        parimpar = numero % 2;
        dobro = numero*2;
        
       for(int i = numero ; i >= 1 ; i--){
           if(numero % i ==0){
               primo++;
           }
       }
       
        
        if(parimpar == 0){
            System.out.println("Numero " + numero + " é par");
            System.out.println("Numero " + numero + " não é impar");
        }else{
            System.out.println("Numero " + numero + " é impar");
            System.out.println("Numero " + numero + " não é par");
        }
        
        if(numero > 10){
            System.out.println("Numero " + numero + " é maior que 10");
            
        }else{
            System.out.println("Numero " + numero + " não é maior que 10");
        }
        
            System.out.println("Dobro de " + numero + " é " + dobro);
            
        if(primo == 2){
            System.out.println("Numero " + numero + " é primo");
        }else{
            System.out.println("Numero " + numero + " não é primo");
        }
        
    }
    
}
    

