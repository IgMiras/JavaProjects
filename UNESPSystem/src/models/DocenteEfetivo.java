/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public class DocenteEfetivo extends Docente {
    public String area; // Biologicas, Exatas, Humanas, Saude;
    
    public DocenteEfetivo(String nome, String nivel, String titulacao, String area, String depto){
        super();
        this.nome = nome;
        this.nivel = nivel;
        this.titulacao = titulacao;
        this.area = area;
        this.tipo = "Docente Efetivo";
        this.departamento = depto;
    }
    
    @Override
    public float calcularSalario(){
        if (this.nivel.equals("D1" ) || this.nivel.equals("d1" ))
        {
            this.salario = (float) ( Constantes.ACRESCIMO_DOCENTE_EFETIVO * (SALARIO_BASE * Constantes.D1));
        }
        else
        {
            if (this.nivel.equals("D2" ) || this.nivel.equals("d2" ))
            {
                this.salario = (float) ( Constantes.ACRESCIMO_DOCENTE_EFETIVO * (SALARIO_BASE * Constantes.D2));
            }
            else
            {
                if (this.nivel.equals("D3" ) || this.nivel.equals("d3" ))
                {
                    this.salario = (float) ( Constantes.ACRESCIMO_DOCENTE_EFETIVO * (SALARIO_BASE * Constantes.D3));
                }
                else
                {
                    System.out.println("Nivel do Docente Efetivo invalido (deve ser D1, D2 ou D3)");
                }
            }
        }
        return this.salario;
    }
}
