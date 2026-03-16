/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo2;

/**
 *
 * @author alunolab10
 */
public class Agregacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conta conta01 = new Conta();
                conta01.saldo = 12312;
                conta01.numero = 123;
                
                
                               
        Conta conta02 = new Conta(99999, 321);
        
        
        Cliente c1 = new Cliente();
                c1.nome = "CauaPisos";
                c1.endereco = "RuaBridinha";
                c1.cpf = "456-00";
                
                
                
                conta01.c = c1;
                
                
                
        //System.out.println("frase");
        InOut.MsgDeInformacao("sout", conta01.numero+"");
        InOut.MsgDeInformacao("sout", conta01.saldo+"");
        InOut.MsgDeInformacao("sout", conta01.c.nome);
        InOut.MsgDeInformacao("sout", conta01.c.cpf);
        InOut.MsgDeInformacao("sout", conta01.c.endereco);
                
                
                
        
        
    }
    
}
