/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo2;

/**
 *
 * @author alunolab10
 */
public class Conta {
    
    double saldo;
    int numero;
    
    Cliente c;
    
    
    public Conta(){}
    

    public Conta(double saldo, int numero) {
        this.saldo = saldo;
        this.numero = numero;
    }
    
    
    void saca(){};  
    void deposita(){};
    void trnsfere(){};
    void verificarTransacao(){};
    
}
