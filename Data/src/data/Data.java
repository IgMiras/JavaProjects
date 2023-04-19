/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author IgMiras
 */
public class Data {
    private int dia;
    private int mes;
    private String mesExtenso;
    private int ano;
    private String DDMMAA;
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        switch(mes){
            case 1:
                this.mesExtenso = "Janeiro";
                break;
            case 2:
                this.mesExtenso = "Fevereiro";
                break;
            case 3:
                this.mesExtenso = "Marco";
                break;
            case 4:
                this.mesExtenso = "Abril";
                break;
            case 5:
                this.mesExtenso = "Maio";
                break;
            case 6:
                this.mesExtenso = "Junho";
                break;
            case 7:
                this.mesExtenso = "Julho";
                break;
            case 8:
                this.mesExtenso = "Agosto";
                break;
            case 9:
                this.mesExtenso = "Setembro";
                break;
            case 10:
                this.mesExtenso = "Outubro";
                break;
            case 11:
                this.mesExtenso = "Novembro";
                break;
            case 12:
                this.mesExtenso = "Dezembro";
                break;
            default:
                System.out.println("Mes invalido!");
                break;
        }
        this.ano = ano;
        this.DDMMAA = String.format("%d/%d/%d",dia,mes,ano);
    }
}
