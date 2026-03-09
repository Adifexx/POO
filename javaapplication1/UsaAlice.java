
import aula01.Alice;

void main(){
    
    System.out.println("Iniciando o Alice.");
    
    //int idade = 28;
    Alice anabelle = new Alice();
    
    
    anabelle.corcabelo = "roxo";
    anabelle.py = 10;
    
    System.out.println("Qual a cor do cabelo?: " + anabelle.corcabelo);
    if (anabelle.move()){
        System.out.println("Alice se moveu");
    }
    
    anabelle.turn();
    anabelle.say("fahhhhh");
    
   Alice ana2 = new Alice("Amarelo", 20);
    
    
    
    
    
    
}
