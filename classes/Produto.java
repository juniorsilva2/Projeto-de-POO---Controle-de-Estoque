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
public class Produto {
    
    private String nome;
    private float preco;
  
    private float getPreco(){
        return preco;
    }
    
    private String getNome(){
        return nome;
        
    }
    
    private void setPreco(float novopreco){
        this.preco= novopreco;
    }
    
    private void setNome(String nome){
        this.nome=nome;
    }
}

