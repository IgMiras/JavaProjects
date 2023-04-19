/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvoregenealogica;

/**
 *
 * @author IgMiras
 */
public class printArvore {
    public String printArvoreRecursivo(Pessoa p1){
        if(p1.getPai() == null || p1.getMae() == null){
            return "Fim (null)";
        }
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Pai: "+p1.getPaiString());
        System.out.println("Mae: "+p1.getMaeString());
        printArvoreRecursivo(p1.getMae());
        printArvoreRecursivo(p1.getPai());
        return "oin";
    }
}
