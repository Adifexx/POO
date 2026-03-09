/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author alunolab10
 */
public class Alice {
    
    public float tamanho;
    public String corcabelo;
    public int px, py, pz;
    
    public Alice(){}
    public Alice(String cor, int z){
        this.corcabelo = cor;
        this.pz = z;
    }
    
    public boolean move(){
        System.out.println("Alice: move()");
        return true;
    }
    
    public void turn(){
        System.out.println("Alice: move()");
        
    }
    
    public void say(String text){
        System.out.println("Alice: move()" + text);
        
    }

    
}
