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
public class Usuario {
    
    private String nome;
    private String cpf;
    private String conta;
    private String senha;
    
    public Usuario(String nome,String cpf,String conta,String senha){
        this.nome = nome;
        this.cpf= cpf;
        this.conta= conta;
        this.senha= senha;
    }
     
    private String getNome(){
        return nome;
    }
    
    private String getCPF(){
        return cpf;
    }
    
    private String getConta(){
        return conta;
    }
    
    private String getSenha(){
        return senha;
    }
    
    
   
    public boolean setSenha(String novaSenha){
         if(novaSenha == null ? senha == null : novaSenha.equals(senha)){
             this.senha= novaSenha;
             return true;
         }
         else{
             return false;
         }
         
   }
}

