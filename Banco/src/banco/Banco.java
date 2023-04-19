/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;
import java.util.Scanner;

/**
 *
 * @author IgMiras
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintMenu menu = new PrintMenu();
        ContaCorrente v[] = new ContaCorrente[10];
        int i;
        int opcao = 0;
        while (opcao != 9){
            menu.printarMenu();
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1: //cadastrar nova conta
                    for (i=0; v[i] != null; i++){ 
                    }
                    v[i] = new ContaCorrente();
                    v[i].setNumero(i);
                    System.out.println("Digite o nome do titular da conta: ");
                    String titular = sc.nextLine();
                    titular = PrimeiraMaiuscula.primeiraMaiuscula(titular);
                    v[i].setTitular(titular);
                    System.out.println("Digite o saldo da conta: ");
                    float saldo = sc.nextFloat();
                    sc.nextLine();
                    v[i].setSaldo(saldo);
                    System.out.println("Digite o limite da conta: ");
                    float limite = sc.nextFloat();
                    sc.nextLine();
                    v[i].setLimite(limite);
                    break;

                case 2: //saque
                    System.out.println("Deseja sacar de qual conta? (pesquisa por numero)");
                    int numero_conta = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Quanto deseja sacar? ");
                    float valor_saque = sc.nextFloat();
                    sc.nextLine();
                    if (v[numero_conta] == null){
                        System.out.println("Conta nao existente!");
                    }else{
                        v[numero_conta].sacar(valor_saque);
                    }
                    break;

                case 3: //deposito
                    System.out.println("Deseja depositar em qual conta? (pesquisa por numero)");
                    numero_conta = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Quanto deseja depositar? ");
                    float valor_deposito = sc.nextFloat();
                    sc.nextLine();
                    if (v[numero_conta] == null){
                        System.out.println("Conta nao existente!");
                    }else{
                        v[numero_conta].depositar(valor_deposito);
                    }
                    break;

                case 4: //listar contas (numero e nome titular)
                    for (int  j=0; v[j] != null; j++){
                        System.out.println("Numero da conta: "+v[j].getNumero());
                        System.out.println("Nome do titular da conta: "+v[j].getTitular());
                        System.out.println("\n");
                    }
                    break;

                case 5: //relatorio geral
                    for (int  j=0; v[j] != null; j++){
                        v[j].exibir();
                        System.out.println("\n");
                    }
                    break;

                case 6: //relatorio de contas com SALDO abaixo de 0
                    for (int k=0; v[k] != null; k++){
                        if (v[k].getSaldo() <= 0){
                            v[k].exibir();
                        }
                    }
                    break;

                case 7:
                    System.out.println("Digite o nome do cliente que deseja buscar: ");
                    String cliente = sc.nextLine();
                    cliente = PrimeiraMaiuscula.primeiraMaiuscula(cliente);
                    int cont = 0;
                    for (int l=0; v[l] != null; l++){
                        if (v[l].getTitular().equals(cliente)){
                            v[l].exibir();
                            cont++;
                        }
                    }
                    if (cont == 0){
                        System.out.println("Titular não encontrado!");
                    }
                    break;

                case 9:
                    System.out.println("Obrigado por usar o sistema!");
                    break;
                    
                default:
                    System.out.println("Opção invalida!");
                    break;
            }
        }
    }
    
}
