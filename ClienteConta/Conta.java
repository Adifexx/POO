/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClienteConta;

/**
 *
 * @author Alunolab10
 */
public class Conta {
    int numero;
    //private double saldo;
    double saldo;
    private String senha;
    
    Cliente c;

    public double getSaldo() {
        return saldo;
    }
    
    
    
    
    boolean sacar(double valor){
        if(VerificarTransacao(valor)){
        saldo -= valor;
        return true;
        }
        return false;
    }
    
    void depositar (double valor){
        saldo += valor;
    }
    
    void transferir (Conta destino, double valor){
        //this.sacar(valor);
        sacar(valor);
        destino.depositar(valor);
    }
    
    
    private boolean VerificarTransacao(double valor){
        
        return saldo > valor;
        
        /*
        if(saldo > valor)
        return true;
        else
        return false;
        */
        
    }
    
    
    public Conta(){
    }
    

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    
}
