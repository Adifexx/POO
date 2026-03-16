/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo;

/**
 *
 * @author alunolab10
 */
public class AulaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Endereco end01 = new Endereco();
        end01.rua = "Da UVV";
        end01.CEP = "123-00";
        end01.numero = 123;
        end01.referencia = "Ao lado do Shopping";
        
        
        Endereco end02 = new Endereco("De Casa", "456-00", "logo ali", 456);
        
        Empregado emp01 = new Empregado();
        emp01.nome = "Vinicius";
        emp01.matricula = 777;
        emp01.salario = 200;
        
        
        emp01.e = end01;
        
        
        //System.out.println("frase");
        
        InOut.MsgDeInformacao("sout", emp01.nome);
        InOut.MsgDeInformacao("sout", emp01.matricula+"");
        InOut.MsgDeInformacao("sout", emp01.e.rua);
        InOut.MsgDeInformacao("sout", emp01.e.referencia);
        
        
        
        
    }
    
    
}
