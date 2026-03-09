/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pessoaa;

/**
 *
 * @author alunolab10
 */
public class Pessoaa {

String nome;
int anoNasc;
float altura;

Pessoa(String nome, int anoNasc, float altura){
    this.nome = nome;
    this.anoNasc = anoNasc;
    this.altura = altura;
    }

void crescer(float m){
    altura = altura + m;
    }

int calcularIdade(){
    int anoAtual = LocalDate.now().getYear();
   int idade = anoAtual - anoNasc;
   return idade;
    
    }








}
