/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvoregenealogica;

/**
 *
 * @author IgMiras
 */
public class ArvoreGenealogica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa Jorge = new Pessoa("Jorge", null, null, 90);
        Pessoa Olivia = new Pessoa("Olivia", null, null, 70);
        Pessoa Maria = new Pessoa("Maria", null, null, 90);
        Pessoa Jesus = new Pessoa("Jesus", null, null, 90);
        Pessoa Zilda = new Pessoa("Zilda", Jorge, Olivia, 43);
        Pessoa Vicente = new Pessoa("Vicente", Jesus, Maria, 55);
        Pessoa Igor = new Pessoa("Igor", Vicente, Zilda, 18);
        printArvore arvore = new printArvore();
        arvore.printArvoreRecursivo(Igor);
    }
    
}
