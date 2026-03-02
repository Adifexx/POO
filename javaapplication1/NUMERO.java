/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author alunolab10
 */
public class NUMERO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numerosecreto = 10;
        
        for (int tentativa = 0; tentativa <= 16 ; tentativa++) {
            int numero = InOut.leInt("Digite um número maior que 0:");
            if (tentativa >= 3 && tentativa <= 5) {
                System.out.println("Chuta um numero entre 1 e 1000");
            }
            if (tentativa >= 8 && tentativa <=10) {
                System.out.println("Chuta um numero entre 1 e 100");
            }
            if (tentativa >= 13) {
                System.out.println("Chuta um numero entre 1 e 10");
            }
            if (numero == numerosecreto) {
                System.out.println("Voce acertou!!!");
                break;
            }
            
        }
                
                
        
        
        
        
        
    }
    
}
