/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academia;

/**
 *
 * @author IgMiras
 */
public class Aluno {
    private int id;
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    public Aluno(int id, String nome, int idade, double peso, double altura){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
   }
    
    public Aluno(){
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public int getID(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void exibir(){
        System.out.println("ID: "+this.id);
        System.out.println("NOME: "+this.nome);
        System.out.println("IDADE: "+this.idade);
        System.out.println("PESO: "+this.peso);
        System.out.println("ALTURA: "+this.altura);
    }
    
    public void calcularIMC(){
        double IMC = (this.peso / (this.altura * this.altura));
        System.out.printf("IMC: %.2f\n",IMC);
    }
}
