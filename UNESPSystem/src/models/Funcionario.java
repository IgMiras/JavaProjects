/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public abstract class Funcionario {
    protected String id;
    protected String nome;
    protected float salario;
    protected String nivel;
    protected String tipo;
    protected String departamento;
    public static final float SALARIO_BASE = 5000;
    
    public Funcionario(){
        id = "0";
        nome = "Não definido";
        salario = 0;
        nivel = "Não definido";
        tipo = "Não definido";
    };
    
    public String getNome(){
        return this.nome;
    }
    
    public String getID(){
        return this.id;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public String getDepto(){
        return this.departamento;
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public void setSalario(float valor){
        this.salario = valor;
    }
    
    public abstract float calcularSalario();
}
