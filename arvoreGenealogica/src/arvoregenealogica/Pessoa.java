/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvoregenealogica;

/**
 *
 * @author IgMiras
 */
public class Pessoa {
    private String nome;
    private Pessoa pai;
    private Pessoa mae;
    private int idade;
   
    public Pessoa(String nome, Pessoa pai, Pessoa mae, int idade){
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.idade = idade;
    }
   
    public String getNome(){
        return this.nome;
    }
   
    public Pessoa getPai(){
        return this.pai;
    }
    
    public String getPaiString(){
        return this.pai.getNome();
    }
   
    public Pessoa getMae(){
        return this.mae;
    }
    
    public String getMaeString(){
        return this.mae.getNome();
    }
   
    public int getIdade(){
        return this.idade;
    }
}
