/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public class Tecnico extends Funcionario {
    public String funcao; // Assessor, Laboratório, Secretário;
    
    public Tecnico(){
        super();
        this.tipo = "Tecnico";
        this.funcao = "Não definida";
    }
    
    public Tecnico(String nome, String nivel, String funcao, String depto){
        super();
        this.nome = nome;
        this.nivel = nivel;
        this.funcao = funcao;
        this.departamento = depto;
        this.tipo = "Tecnico";
    }
    
    @Override
    public float calcularSalario(){
        if (this.nivel.equals("T1" ) || this.nivel.equals("t1" ))
        {
            this.salario = (float) (SALARIO_BASE * Constantes.T1);
        }
        else
        {
            if (this.nivel.equals("T2" ) || this.nivel.equals("t2" ))
            {
                this.salario = (float) (SALARIO_BASE * Constantes.T2);
            }
            else
            {
                System.out.println("Nivel do Tecnico invalido (deve ser T1 ou T2)");
            }
        }
        return this.salario;
    }
    
}
    
    

