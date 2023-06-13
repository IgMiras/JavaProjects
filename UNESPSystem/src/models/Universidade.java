/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author IgMiras
 */
public class Universidade {
    public static String nome;
    public static Departamento[] departamentos;
    private static int cont = 0;
    private static final int MAX = 10;
    private static Universidade instancia = null;
    
    public Universidade(String nomeUniversidade){
        nome = nomeUniversidade;
        departamentos = new Departamento[MAX];
    }
    
    public static Universidade getInstancia(String nome){
        if (instancia == null){
            instancia = new Universidade(nome);
        }
        return instancia;
    }
    
    public void addDepto(String nome, String codigo){
        if (cont < MAX){
            departamentos[cont] = new Departamento(nome, codigo);
            cont++;
        }
    }
    
    public void addTecnico(String nome, String nivel, String funcao, String depto){
        for (int i=0; departamentos[i] != null; i++){
            if (departamentos[i].nome.equalsIgnoreCase(depto)){
                departamentos[i].addTecnico(nome, nivel, funcao, depto);
                return;
            }
        }
        System.out.println("Departamento nao encontrado, logo, tecnico nao cadastrado!");
    }
    
    public void addDocenteEfetivo(String nome, String nivel, String titulacao, String area, String depto){
        for (int i=0; departamentos[i] != null; i++){
            if (departamentos[i].nome.equalsIgnoreCase(depto)){
                departamentos[i].addDocenteEfetivo(nome, nivel, titulacao, area, depto);
                return;
            }
        }
        System.out.println("Departamento nao encontrado, logo, Docente Efetivo nao cadastrado!");
    }
    
    public void addDocenteSubstituto(String nome, String nivel, String titulacao, int cargaHoraria, String depto){
        for (int i=0; departamentos[i] != null; i++){
            if (departamentos[i].nome.equalsIgnoreCase(depto)){
                departamentos[i].addDocenteSubstituto(nome, nivel, titulacao, cargaHoraria, depto);
                return;
            }
        }
        System.out.println("Departamento nao encontrado, logo, Docente Substituto nao cadastrado!");
    }
    
    public String exibirTodosDepartamentos(){
        String relatorio = "";
        for (int i=0; i < cont; i++){
            relatorio = relatorio+departamentos[i].getDados()+"\n";
        }
        return relatorio;
    }
    
    public String relatorioGeral(){
        String relatorio = "";
        for (int i=0; i < cont; i++){
            relatorio = relatorio+departamentos[i].getNome()+":\n";
            float gastoTotal = 0;
            
            for (int j=0; j < departamentos[i].cont; j++){
                relatorio = relatorio+"nome: "+departamentos[i].funcionarios[j].nome+"\nSalario: "+departamentos[i].funcionarios[j].calcularSalario()+"\n";
                gastoTotal = gastoTotal + departamentos[i].funcionarios[j].calcularSalario();
            }
            relatorio = relatorio+"GASTO TOTAL: "+gastoTotal+"\n\n";
        }
        return relatorio;
    }
    
    public String resumoDeptos(){
        String relatorio = "";
        int numFuncionarios=0;
        for (int i=0; i < cont; i++){
            relatorio = relatorio+departamentos[i].nome+":\n";
            float gastoTotal = 0;
            
            for (int j=0; j < departamentos[i].cont; j++){
                gastoTotal = gastoTotal + departamentos[i].funcionarios[j].calcularSalario();
                numFuncionarios++;
            }
            relatorio = relatorio+"NÚMERO DE FUNCIONARIOS: "+numFuncionarios+"\n";
            relatorio = relatorio+"GASTO TOTAL: "+gastoTotal+"\n\n";
        }
        return relatorio;
    }
    
    public String resumoDeptosGastoEspecifico(float gastoEspecifico){
        String relatorio = "";
        int numFuncionarios=0;
        
        for (int i=0; i < cont; i++){
            float gastoDepto = 0;
            
            for (int j=0; j < departamentos[i].cont; j++){
                gastoDepto = gastoDepto + departamentos[i].funcionarios[j].calcularSalario();
                numFuncionarios++;
            }
            
            if (gastoDepto < gastoEspecifico){
                relatorio = relatorio+departamentos[i].nome+":\n";
                relatorio = relatorio+"NÚMERO DE FUNCIONARIOS: "+numFuncionarios+"\n";
                relatorio = relatorio+"GASTO TOTAL: "+gastoDepto+"\n\n";
            }
        }
        return relatorio;
    }
    
    public String funcionariosSalarioEspecifico(float salarioEspecifico){
        String relatorio = "";
        
        for (int i=0; i<cont; i++){
            
            for(int j=0; j<departamentos[i].cont; j++){
                if ((departamentos[i].funcionarios[j].calcularSalario()) < salarioEspecifico){
                    relatorio = relatorio+"Nome: "+departamentos[i].funcionarios[j].nome+"\tID: "+departamentos[i].funcionarios[j].id+"\tsalario: "+departamentos[i].funcionarios[j].calcularSalario()+"\tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                }
            }
        }
        return relatorio;
    }
    
    public String exibirTodosFuncionarios(){
        String relatorio = "";
        
        for (int i=0; i<cont; i++){
            
            for(int j=0; j<departamentos[i].cont; j++){
                    relatorio = relatorio+"Nome: "+departamentos[i].funcionarios[j].nome+"\tID: "+departamentos[i].funcionarios[j].id+"\tsalario: "+departamentos[i].funcionarios[j].calcularSalario()+"\tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
            }
        }
        return relatorio;
    }
    
    public String exibirTodosTecnicos(){
        String relatorio = "";
        
        for (int i=0; i<cont; i++){
            
            for(int j=0; j<departamentos[i].cont; j++){
                if (departamentos[i].funcionarios[j].tipo.equalsIgnoreCase("Tecnico")){
                    relatorio = relatorio+"Nome: "+departamentos[i].funcionarios[j].nome+"\tID: "+departamentos[i].funcionarios[j].id+"\tsalario: "+departamentos[i].funcionarios[j].calcularSalario()+"\tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                }
            }
        }
        return relatorio;
    }
    
    public String exibirTodosDocentes(){
        String relatorio = "";
        
        for (int i=0; i<cont; i++){
            
            for(int j=0; j<departamentos[i].cont; j++){
                if (departamentos[i].funcionarios[j].tipo.contains("Docente")){
                    relatorio = relatorio+"Nome: "+departamentos[i].funcionarios[j].nome+"\tID: "+departamentos[i].funcionarios[j].id+"\tsalario: "+departamentos[i].funcionarios[j].calcularSalario()+"\tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                }
            }
        }
        return relatorio;
    }
    
    public String exibirTodosDocentesEfetivos(){
        String relatorio = "";
        
        for (int i=0; i<cont; i++){
            
            for(int j=0; j<departamentos[i].cont; j++){
                if (departamentos[i].funcionarios[j].tipo.equalsIgnoreCase("Docente Efetivo")){
                    relatorio = relatorio+"Nome: "+departamentos[i].funcionarios[j].nome+"\tID: "+departamentos[i].funcionarios[j].id+"\t salario: "+departamentos[i].funcionarios[j].calcularSalario()+"\tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                }
            }
        }
        return relatorio;
    }
    
    public String exibirTodosDocentesSubstitutos(){
        String relatorio = "";
        
        for (int i=0; i<cont; i++){
            
            for(int j=0; j<departamentos[i].cont; j++){
                if (departamentos[i].funcionarios[j].tipo.equalsIgnoreCase("Docente Substituto")){
                    relatorio = relatorio+"Nome: "+departamentos[i].funcionarios[j].nome+"\tID: "+departamentos[i].funcionarios[j].id+"\t salario: "+departamentos[i].funcionarios[j].calcularSalario()+"\tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                }
            }
        }
        return relatorio;
    }
    
    public String exibirInfosDepto(String codigo){
        String relatorio = "";
        float gastoTotal=0;
        for (int i=0; i<cont; i++){
            if (departamentos[i].codigo.equalsIgnoreCase(codigo)){
                
                relatorio = relatorio+departamentos[i].nome+":\n";
                for (int j=0; j<departamentos[i].cont; j++){
                    relatorio = relatorio+"Funcionario "+j+": "+departamentos[i].funcionarios[j].nome+"\n";
                    gastoTotal = gastoTotal + departamentos[i].funcionarios[j].calcularSalario();
                }
                relatorio = relatorio+"GASTO TOTAL: "+gastoTotal+"\n";
                return relatorio;
            }
        }
        return "Departamento nao encontrado!\n";
    }
    
    public String buscarFuncionarioCodigo(String codigo){
        String relatorio = "";
        for (int i=0; i<cont; i++){
            for (int j=0; j<departamentos[i].cont; j++){
                if (departamentos[i].funcionarios[j].id.equalsIgnoreCase(codigo)){
                    relatorio = "Nome: "+departamentos[i].funcionarios[j].nome+"/tNivel: "+departamentos[i].funcionarios[j].nivel+"/tTipo: "+departamentos[i].funcionarios[j].tipo+"/tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                    return relatorio;
                }
            }
        }
        return "Funcionario nao encontrado!\n";
    }
    
    public String buscarFuncionarioNome(String nome){
        String relatorio = "";
        for (int i=0; i<cont; i++){
            for (int j=0; j<departamentos[i].cont; j++){
                if (departamentos[i].funcionarios[j].nome.equalsIgnoreCase(nome)){
                    relatorio = "Nome: "+departamentos[i].funcionarios[j].nome+"/tNivel: "+departamentos[i].funcionarios[j].nivel+"/tTipo: "+departamentos[i].funcionarios[j].tipo+"/tDepto: "+departamentos[i].funcionarios[j].departamento+"\n";
                    return relatorio;
                }
            }
        }
        return "Funcionario nao encontrado!\n";
    }
}
