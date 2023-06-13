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
    public String id;
    public String nome;
    public float salario;
    public String nivel;
    public String tipo;
    public String departamento;
    public static final float SALARIO_BASE = 5000;
    
    public Funcionario(){
        id = "0";
        nome = "Não definido";
        salario = 0;
        nivel = "Não definido";
        tipo = "Não definido";
    };
    
    public abstract float calcularSalario();
}
