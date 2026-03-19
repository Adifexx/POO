/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClienteConta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Alunolab10
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta cc01 = new Conta();
        cc01.numero = 1;
        //cc01.saldo = 100;
        cc01.depositar(100);
        
        
        
        
        Conta cc03 = new Conta(1, 100);
        
        Cliente cli1 = new Cliente("Nome1", "Endereco1", "CPF1");
        Cliente cli2 = new Cliente("Nome2", "Endereco2", "CPF2");
        
        
        
        System.out.println("Saldo da conta "+ cc01.saldo);
        
        
        cc01.depositar(200);
        System.out.println("Saldo da conta "+ cc01.saldo);
        
        cc01.sacar(50);
        System.out.println("Saldo da conta "+ cc01.saldo);
        
        System.out.println("          ");
        
        
        
        Conta cc02 = new Conta();
        cc02.numero = 2;
        cc02.saldo = 100;
        
        System.out.println("Saldo da conta "+ cc01.saldo);
        System.out.println("Saldo da conta "+ cc02.saldo);
        
        cc01.transferir(cc02, 50);
        
        System.out.println("Saldo da conta "+ cc01.saldo);
        System.out.println("Saldo da conta "+ cc02.saldo);
        
        
        cc01.c = cli1;
        System.out.println(cc01.numero);
        System.out.println("Qual o nome do cliente da conta cc01?");
        System.out.println(cc01.c.nome);
        
        
        int[] myArrayRaiz = new int[10];
        myArrayRaiz[0] = 20;
        
        List<String> myList = new ArrayList<>();
        Set<String> nySet = new HashSet<>();
        Map<String, String> myMap = new HashMap<>();
        
        
        myList.add("Vinicius");
        myList.add("Rosalen");
        
       // for
        
    }
    
    
}
