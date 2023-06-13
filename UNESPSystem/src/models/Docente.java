/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public abstract class Docente extends Funcionario {
    public String titulacao; // Graduacao, Mestrado, Doutorado, Livre-Docente, Titular
    
    public Docente(){
        super();
        titulacao = "Não definida";
    }
    
    public abstract float calcularSalario();
}
