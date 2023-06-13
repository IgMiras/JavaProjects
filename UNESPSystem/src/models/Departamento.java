/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public class Departamento {
    public String codigo;
    public String nome;
    public Funcionario[] funcionarios;
    public int cont;
    private final int MAX = 100;
    
    public Departamento(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
        funcionarios = new Funcionario[MAX];
        this.cont = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getDados(){
        String dados = "Nome: "+this.nome+" Codigo: "+this.codigo;
        return dados;
    }
    
    public void addTecnico(String nome, String nivel, String funcao, String depto){
        if (cont < MAX){
            funcionarios[cont] = new Tecnico(nome, nivel, funcao, depto);
            funcionarios[cont].id = this.codigo+this.cont;
            funcionarios[cont].salario = funcionarios[cont].calcularSalario();
            System.out.println("Tecnico adicionado!");
            this.cont++;
        }
    }
    
    public void addDocenteEfetivo(String nome, String nivel, String titulacao, String area, String depto){
        if (cont < MAX){
            funcionarios[cont] = new DocenteEfetivo(nome, nivel, titulacao, area, depto);
            funcionarios[cont].id = this.codigo+this.cont;
            funcionarios[cont].salario = funcionarios[cont].calcularSalario();
            System.out.println("Docente Efetivo adicionado!");
            this.cont++;
        }
    }
    
    public void addDocenteSubstituto(String nome, String nivel, String titulacao, int cargaHoraria, String depto){
        if (cont < MAX){
            funcionarios[cont] = new DocenteSubstituto(nome, nivel, titulacao, cargaHoraria, depto);
            funcionarios[cont].id = this.codigo+this.cont;
            funcionarios[cont].salario = funcionarios[cont].calcularSalario();
            System.out.println("Docente Substituto adicionado!");
            this.cont++;
        }
    }
}
