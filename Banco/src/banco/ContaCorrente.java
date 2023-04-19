/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IgMiras
 */
public class ContaCorrente {
    private int numero;
    private String titular;
    private float saldo;
    private float limite;
    
    public ContaCorrente(){}
    
    public ContaCorrente(int numero, String titular, float saldo, float limite){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }    
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public float getLimite(){
        return this.limite;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public void setLimite(float limite){
        this.limite = limite;
    }
    
    public void exibir(){
        System.out.println("Numero da conta: "+this.numero);
        System.out.println("Nome do titular: "+this.titular);
        System.out.println("Saldo da conta: "+this.saldo);
        System.out.println("Limite da conta: "+this.limite);
    }
    
    public void depositar(float valor){
        this.saldo = this.saldo + valor;
        System.out.println("Deposito realizado com sucesso!");
    }
    
    public void sacar(float valor){
        if (valor <= (this.saldo + this.limite)){
            if (valor <= this.saldo){
                this.saldo = this.saldo - valor;
            }else{
                valor = valor - this.saldo;
                this.saldo = 0;
                this.limite = this.limite - valor;
            }
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saque não realizado (sem saldo+limite suficiente)");
        }
    }
}
