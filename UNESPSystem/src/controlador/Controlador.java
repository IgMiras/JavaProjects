/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import models.Universidade;

/**
 *
 * @author IgMiras
 */
public class Controlador {
    private Universidade universidade = Universidade.getInstancia("UNESP");
    
    public Controlador(){};
    
    public void addDepto(String nome, String codigo){
        universidade.addDepto(nome, codigo);
    }
    
    public void addTecnico(String nome, String nivel, String funcao, String depto){
        universidade.addTecnico(nome, nivel, funcao, depto);
    }
    
    public void addDocenteEfetivo(String nome, String nivel, String titulacao, String area, String depto){
        universidade.addDocenteEfetivo(nome, nivel, titulacao, area, depto);
    }
    
    public void addDocenteSubstituto(String nome, String nivel, String titulacao, int cargaHoraria, String depto){
        universidade.addDocenteSubstituto(nome, nivel, titulacao, cargaHoraria, depto);
    }
    
    public String exibirTodosDepartamentos(){
        return universidade.exibirTodosDepartamentos();
    }
     
    public String relatorioGeral(){
        return universidade.relatorioGeral();
    }
     
    public String resumoDeptos(){
        return universidade.resumoDeptos();
    }
    
    public String resumoDeptosGastoEspecifico(float gastoEspecifico){
        return universidade.resumoDeptosGastoEspecifico(gastoEspecifico);
    }
    
    public String funcionariosSalarioEspecifico(float salarioEspecifico){
        return universidade.funcionariosSalarioEspecifico(salarioEspecifico);
    }
    
    public String exibirTodosFuncionarios(){
        return universidade.exibirTodosFuncionarios();
    }
    
    public String exibirTodosTecnicos(){
        return universidade.exibirTodosTecnicos();
    }
    
    public String exibirTodosDocentes(){
        return universidade.exibirTodosDocentes();
    }
    
    public String exibirTodosDocentesEfetivos(){
        return universidade.exibirTodosDocentesEfetivos();
    }
    
    public String exibirTodosDocentesSubstitutos(){
        return universidade.exibirTodosDocentesSubstitutos();
    }
    
    public String exibirInfosDepto(String codigo){
        return universidade.exibirInfosDepto(codigo);
    }
    
    public String buscarFuncionarioCodigo(String codigo){
        return universidade.buscarFuncionarioCodigo(codigo);
    }
    
    public String buscarFuncionarioNome(String nome){
        return universidade.buscarFuncionarioNome(nome);
    }
}
