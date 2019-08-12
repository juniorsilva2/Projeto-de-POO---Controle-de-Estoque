/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

/**
 *
 * @author Cleuton
 */
import java.util.LinkedList;
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Cadastro usuario1= new Cadastro();
        usuario1.cadastrar();
        
        Cadastro usuario2= new Cadastro();
        usuario2.cadastrar();
        
        LinkedList listaUsuarios = new LinkedList();
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);
        
        Cadastro aux= new Cadastro();
        aux=(Cadastro) listaUsuarios.getFirst();
        
        System.out.println("imprimindo o usuario indice 1: "+aux.getNome());
        
        Login login= new Login();
        
        login.logar(listaUsuarios);
        
        
        
        
        
     }
    
}
