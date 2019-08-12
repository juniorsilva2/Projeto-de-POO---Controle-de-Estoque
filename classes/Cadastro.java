/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Cleuton
 * 
 * criando o cadastro do usuario com os campos de informações de nome,cpf,conta 
 * e senha
 */
public class Cadastro extends Usuario{

   
    public void cadastrarNome(){
        System.out.println("Criando novo usuario");
        System.out.println("Informe o nome de usuário: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        super.setNome(nome);
    }
    
    private void cadastrarSenha(String senha){
        super.setSenha(senha);
    }
    
    public void cadastrarConta(){
        System.out.println("Informe o conta:");
        Scanner scanner = new Scanner(System.in);
        String conta = scanner.nextLine();
        super.setConta(conta);
    }
    
    public void cadastrarCPF(){
        System.out.println("Informe o CPF:");
        Scanner scanner = new Scanner(System.in);
        String cpf = scanner.nextLine();
        super.setCPF(cpf);
    }    
    
    /* verifica se as senhas coincidem */
    public void confirmarSenha(){
        System.out.println("Informe a nova senha");
        Scanner scanner = new Scanner(System.in);
        String senha = scanner.nextLine();
        
        System.out.println("confirme sua senha novamente");
        scanner = new Scanner(System.in);
        String confirmacao = scanner.nextLine();
        
        if(senha == null ? confirmacao == null : senha.equals(confirmacao)){
            this.cadastrarSenha(senha);
            System.out.println("Nova senha criada");
        }
        else{
            System.out.println("Senhas nao coincidem");
            confirmarSenha();
        }
    }
    
    public void cadastrar(){
        cadastrarNome();
        cadastrarCPF();
        cadastrarConta();
        confirmarSenha();
    }
  
}

    