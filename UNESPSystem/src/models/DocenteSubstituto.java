/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public class DocenteSubstituto extends Docente {
    public int cargaHoraria; // 12 ou 24 horas;
        
    public DocenteSubstituto(String nome, String nivel, String titulacao, int cargaHoraria, String depto){
        super();
        this.nome = nome;
        this.nivel = nivel;
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
        this.departamento = depto;
        this.tipo = "Docente Substituto";
    }
    
    @Override
    public float calcularSalario(){
        if (this.nivel.equals("S1" ) || this.nivel.equals("s1" ))
        {
            this.salario = (float) (SALARIO_BASE * Constantes.S1);
        }
        else
        {
            if (this.nivel.equals("S2" ) || this.nivel.equals("s2" ))
            {
                this.salario = (float) (SALARIO_BASE * Constantes.S2);
            }
            else
            {
                System.out.println("Nivel do Docente Substituto invalido (deve ser S1 ou S2)");
            }
        }
        return this.salario;
    }
}
