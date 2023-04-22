/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package academia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author IgMiras
 */
public class Academia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Menu menu = new Menu();
        menu.printMenu();
        int opcao = scanner.nextInt();
        scanner.nextLine();
        Aluno v[] = new Aluno[10];
        int i=0;
        while (opcao != 9){ //(9) Sair
            if (opcao == 1){ //cadastrar aluno
                v[i] = new Aluno();
                System.out.println("Digite o nome do aluno: ");
                String nome = scanner.nextLine();
                v[i].setNome(nome);
                System.out.println("Digite a idade do aluno: ");
                int idade = (int) scanner.nextInt();
                scanner.nextLine();
                v[i].setIdade(idade);
                System.out.println("Digite o peso do aluno (em kg): ");
                double peso = (double) scanner.nextDouble();
                scanner.nextLine();
                v[i].setPeso(peso);
                System.out.println("Digite a altura do aluno (em metros): ");
                double altura = (double) scanner.nextDouble();
                scanner.nextLine();
                v[i].setAltura(altura);
                v[i].setID(i);
                i++;
            }
            if (opcao == 2){ //printar nomes
                for (int j = 0; v[j] != null; j++){
                    System.out.println("\n");
                    System.out.println("Nome do aluno "+j+": "+v[j].getNome());
                }
                if (v[0] == null){
                    System.out.println("Nenhum aluno cadastrado!");
                }
            }
            if (opcao == 3){ //relatorio geral
                for (int j = 0; v[j] != null; j++){
                    System.out.println("\n");
                    System.out.println("ID do aluno "+j+": "+v[j].getID());
                    System.out.println("Nome do aluno "+j+": "+v[j].getNome());
                    System.out.println("Idade do aluno "+j+": "+v[j].getIdade());
                    System.out.println("Peso do aluno "+j+": "+v[j].getPeso());
                    System.out.println("Altura do aluno "+j+": "+v[j].getAltura());
                }
                if (v[0] == null){
                    System.out.println("Nenhum aluno cadastrado!");
                }
            }
            System.out.println("\n");
            System.out.println("\n");
            menu.printMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();
        }
    }
    
}
